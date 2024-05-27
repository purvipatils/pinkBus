package com.pinkBus.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "bus_number")
    private String busNumber;

    @Column(name = "seating_capacity")
    private int seatingCapacity;

    @Column(name = "bus_type")
    private String busType;

    @Column(name = "departure_city")
    private String departureCity;

    @Column(name = "arrival_city")
    private String arrivalCity;

    @Column(name = "departure_time")
    private String departureTime;

    @Column(name = "arrival_time")
    private String arrivalTime;
    
    @Column(name = "bus_fare")
    private int busFare;
    

	public int getBusfare() {
		return busFare;
	}

	public void setBusfare(int busfare) {
		this.busFare = busfare;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	
	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Bus() {
		super();
	}

	public Bus orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

   
}