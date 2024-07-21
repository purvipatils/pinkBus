package com.pinkBus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinkBus.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

	public Bus findByBusNumber(String busNumber);

}
