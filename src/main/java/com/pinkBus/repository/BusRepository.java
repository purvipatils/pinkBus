package com.pinkBus.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinkBus.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

	public Optional<Bus> findById(Long id);
	
	public Bus  findByBusNumber(String busNumber);



	
}
