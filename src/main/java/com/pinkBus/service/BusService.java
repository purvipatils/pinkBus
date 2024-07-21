package com.pinkBus.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pinkBus.controller.DuplicateRecordException;

import com.pinkBus.model.Bus;
import com.pinkBus.repository.BusRepository;

@Service
public class BusService {
	private final BusRepository busRepository;

	public BusService(BusRepository busRepository) {
		this.busRepository = busRepository;
	}

	public Bus getBusById(Long busId) {
		return busRepository.findById(busId).orElse(null);
	}

	public Bus getBusByNumber(String busNumber) {
		return busRepository.findByBusNumber(busNumber).orElse(null);
	}

	public Bus addBus(Bus bus) {

		if (isDuplicateBusNumber(bus.getBusNumber()) != null) {

			throw new DuplicateRecordException("Bus with the same number already exists");
		} else {
			return busRepository.save(bus);
		}

	}

	private Bus isDuplicateBusNumber(String busNumber) {
		return busRepository.findByBusNumber(busNumber);
	}

	public void delete(Bus bus) {
		// TODO Auto-generated method stub
		busRepository.deleteById(bus.getId());
	}

	public Optional<Bus> getBus(Long busId) {
		return busRepository.findById(busId);
	}

}
