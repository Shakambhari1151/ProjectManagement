package com.ibm.shakambhari.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.validation.constraints.Min;

//import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class vehicle {
	@Id
	@GeneratedValue
	private Integer vehicleId;	

	private String brand;
		
	private String type;
		
	private String vehiclePlateNumber;		
	private int model;
	
	private int numberOfSeats;
	
	private double dailyPrice;
	private boolean isAvailable;

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getVehiclePlateNumber() {
		return vehiclePlateNumber;
	}

	public void setVehiclePlateNumber(String vehiclePlateNumber) {
		this.vehiclePlateNumber = vehiclePlateNumber;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public double getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(double dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", brand=" + brand + ", type=" + type + ", vehiclePlateNumber="
				+ vehiclePlateNumber + ", model=" + model + ", numberOfSeats=" + numberOfSeats + ", dailyPrice="
				+ dailyPrice + ", isAvailable=" + isAvailable + "]";
	}

}



