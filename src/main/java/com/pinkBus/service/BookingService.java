package com.pinkBus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pinkBus.model.Booking;
import com.pinkBus.repository.BookingRepository;

@Service
public class BookingService {
	private final BookingRepository bookingRepository;

	@Autowired
	public BookingService(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}

	public Booking getBusById(Long bookingId) {
		return bookingRepository.findById(bookingId).orElse(null);
	}

	public Booking addBooking(Booking booking) {
		return bookingRepository.save(booking);
	}

}