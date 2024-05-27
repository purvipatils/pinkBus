package com.pinkBus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinkBus.model.Passenger;
import com.pinkBus.service.PassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

	@Autowired
	private PassengerService passengerService;

	@GetMapping("/id/{passengerId}")
	public ResponseEntity<?> getPassengerDetails(@PathVariable Long passengerId) {

		System.out.println(passengerId);

		Passenger passenger = passengerService.getPassengerById(passengerId);
		if (passenger != null) {
			return ResponseEntity.ok(passenger);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Passenger not found");
		}

	}

	@PostMapping("/addPassenger")
	public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger) {
		Passenger addedPassenger = passengerService.addPassenger(passenger);
		return new ResponseEntity<>(addedPassenger, HttpStatus.CREATED);
	}

	/*
	 * @PutMapping("/{id}") public ResponseEntity<Passenger>
	 * updatePassenger(@PathVariable Long id, @RequestBody Passenger passenger) { }
	 * 
	 * @DeleteMapping("/{id}") public ResponseEntity<Void>
	 * deletePassenger(@PathVariable Long id) { }
	 */
}