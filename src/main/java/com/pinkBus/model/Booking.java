package com.pinkBus.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "bus_id")
	private Bus bus;
	
	@Column(name = "departure")
	private String departure;

	@Column(name = "fare")
	private String fare;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}



//
//    @ManyToOne
//    @JoinColumn(name = "passenger_id")
//    private Passenger passenger;

//	private LocalDateTime bookingTime;



//	public Bus getBus() {
//		return bus;
//	}
//
//	public void setBus(Bus bus) {
//		this.bus = bus;
//	}

//	public Passenger getPassenger() {
//		return passenger;
//	}
//
//	public void setPassenger(Passenger passenger) {
//		this.passenger = passenger;
//	}

//	public String getBookingTime() {
//		return bookingTime;
//	}
//
//	public void setBookingTime(String bookingTime) {
//		this.bookingTime = bookingTime;
//	}

}