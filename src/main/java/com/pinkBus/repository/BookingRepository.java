package com.pinkBus.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinkBus.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	public Optional<Booking> findById(Long id);

}
