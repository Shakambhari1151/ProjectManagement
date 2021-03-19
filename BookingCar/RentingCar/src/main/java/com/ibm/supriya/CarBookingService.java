package com.ibm.supriya;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarBookingService {
	@Autowired
	carBookingRepository repo;
	
	public List<CarBooking> getAllBookings()
	{
		List<CarBooking> carbooking = new ArrayList<CarBooking>();
		repo.findAll().forEach(value -> carbooking.add(value));
		return carbooking;
	}
	
	public CarBooking getCarBookingById(int id)
	{
		return repo.findById(id).get();
	}
	public void saveOrUpdate(CarBooking carbooking)
	{
		repo.save(carbooking);
	}
	public void delete(int id)
	{
		repo.deleteById(id);;
	}
	public void update(CarBooking carbooking ,int reservationId)
	{
		repo.save(carbooking);
	}

}
