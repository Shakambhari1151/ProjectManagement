package com.ibm.shakambhari.vehicle.service;

import java.util.List;
import com.ibm.shakambhari.DAO.*;
import com.ibm.shakambhari.domain.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class VehicleService {
	@Autowired
	private VehicleDAO vehicleDAO;

	public void addVehicle(vehicle car) {
		vehicleDAO.save(car);
	}

//	public void setVehicleDAO(VehicleDAO vehicleDAO) {
//		this.vehicleDAO = vehicleDAO;
//	}

//	public vehicle vehicleByVehicleId(Integer vehicleId) {
//		return this.vehicleDAO.findByVehicleId(vehicleId);
//	}

	public List<vehicle> search(Integer seats, Double minPrice, Double maxPrice, Boolean isAvailable) {
		seats = seats == null ? 0 : seats;
		minPrice = minPrice == null ? 0.0 : minPrice;
		maxPrice = maxPrice == null ? Double.MAX_VALUE : maxPrice;
		List<vehicle> vehicles ;
		if (isAvailable != null) {
			vehicles = this.vehicleDAO
					.findByNumberOfSeatsGreaterThanEqualAndDailyPriceLessThanEqualAndDailyPriceGreaterThanEqualAndIsAvailableOrderByVehicleIdDesc(
							seats, maxPrice, minPrice, isAvailable);
		} else {
			vehicles = this.vehicleDAO
					.findByNumberOfSeatsGreaterThanEqualAndDailyPriceLessThanEqualAndDailyPriceGreaterThanEqualOrderByVehicleIdDesc(
							seats, maxPrice, minPrice);

		}
		return vehicles;
	}

	/*
	 * public List<Vehicle> search(VehicleSpec vSpec) { List<Vehicle> vehicles =
	 * null; if (vSpec.getIsAvailable()) vehicles = this.vehicleDAO
	 * .findByBrandIgnoringCaseLikeAndTypeIgnoringCaseLikeAndVehiclePlateNumberIgnoringCaseLikeAndNumberOfSeatsGreaterThanEqualAndDailyPriceLessThanEqualOrderByVehicleIdDesc(
	 * vSpec.getBrand(), vSpec.getType(), vSpec.getVehiclePlateNumber(),
	 * vSpec.getNumberOfSeats(), vSpec.getDailyPrice()); else { this.vehicleDAO
	 * .findByBrandIgnoringCaseLikeAndTypeIgnoringCaseLikeAndVehiclePlateNumberIgnoringCaseLikeAndNumberOfSeatsGreaterThanEqualAndDailyPriceLessThanEqualAndIsAvailableOrderByVehicleIdDesc(
	 * vSpec.getBrand(), vSpec.getType(), vSpec.getVehiclePlateNumber(),
	 * vSpec.getNumberOfSeats(), vSpec.getDailyPrice(), vSpec.getIsAvailable());
	 * } return vehicles; }
	 */
	public List<vehicle> getAll() {
		return vehicleDAO.findAll();
	}

	public vehicle find(int vehicleId) {
		return vehicleDAO.findByVehicleId(vehicleId);
	}

	public void deleteVehicle(Integer vehicleId) {
		this.vehicleDAO.deleteByVehicleId(vehicleId);
	}

	
	
	public void updtae(vehicle vehicle)
	{
		vehicleDAO.save(vehicle);
	}

//	public void update(Vehicle vehicle) {
//		// TODO Auto-generated method stub
//		this.vehicleDAO.setVehicleByVehicleId(vehicle.getBrand(), vehicle.getType(), vehicle.getVehiclePlateNumber(),
//				vehicle.getModel(), vehicle.getNumberOfSeats(), vehicle.getDailyPrice(), vehicle.getIsAvailable(),
//				vehicle.getVehicleId());
//	}

}


