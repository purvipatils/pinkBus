package com.pinkBus.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinkBus.model.Bus;
import com.pinkBus.service.BusService;

@RestController

@RequestMapping("/bus")

public class BusController {
	private final BusService busService;

	public BusController(BusService busService) {
		this.busService = busService;
	}

	@PostMapping("/add")
	public ResponseEntity<Bus> addBus(@RequestBody Bus bus) {
		Bus addedBus = busService.addBus(bus);
		return new ResponseEntity<>(addedBus, HttpStatus.CREATED);
	}

	@GetMapping("/id/{busId}")
	public ResponseEntity<?> getBusDetails(@PathVariable Long busId) {
		System.out.println(busId);
		Bus bus = busService.getBusById(busId);
		if (bus != null) {
			return ResponseEntity.ok(bus);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Bus not found");
		}
	}

	@GetMapping("/number/{busNumber}")
	public ResponseEntity<?> getBusDetails(@PathVariable String busNumber) {
		System.out.println(busNumber);
		Bus bus = busService.getBusByNumber(busNumber);
		if (bus != null) {
			return ResponseEntity.ok(bus);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Bus not found");
		}
	}

}
