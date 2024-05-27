package com.pinkBus.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinkBus.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
	public Optional<Passenger> findById(Long id);




}