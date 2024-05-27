package com.pinkBus.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pinkBus.controller.DuplicateRecordException;
import com.pinkBus.model.Passenger;
import com.pinkBus.repository.PassengerRepository;


@Service
public class PassengerService {
    private final PassengerRepository passengerRepository;

    @Autowired
    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    
    public Passenger getPassengerById(Long passengerId) {
		return passengerRepository.findById(passengerId).orElse(null);
	}

    public Passenger addPassenger(Passenger passenger) {

		if (isDuplicatePassengerId(passenger.getPassengerId()) != null) {

			throw new DuplicateRecordException("Passenger with the same Id already exists");
		} else {
			return passengerRepository.save(passenger);
		}

	}

    private Optional<Passenger> isDuplicatePassengerId(Long passengerId) {
		return passengerRepository.findById(passengerId);
	}
	}


	

