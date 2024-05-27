package com.pinkBus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinkBus.model.Booking;
import com.pinkBus.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	private final BookingService bookingService;

	@Autowired
	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}

	@PostMapping("/add")
	public ResponseEntity<Booking> addBus(@RequestBody Booking booking) {
		Booking addedBooking = bookingService.addBooking(booking);
		return new ResponseEntity<>(addedBooking, HttpStatus.CREATED);
	}
}