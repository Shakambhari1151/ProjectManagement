package com.ibm.shakambhari.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.shakambhari.booking.service.*;
import com.ibm.shakambhari.domain.*;

@RestController
@RequestMapping("/api")
public class CarBookingController {
	@Autowired
	CarBookingService bookService;
	@GetMapping("/carbookings")
	private List<CarBooking> getAllBookings()
	{
		return bookService.getAllBookings();
	}
	@GetMapping("/carbookings/{reservationId}")
	private CarBooking getCarBooking(@PathVariable("reservationId") int reservationId)
	{
		return bookService.getCarBookingById(reservationId);
	}
	@PostMapping("/carbooking")
	private int saveCarBooking(@RequestBody CarBooking carbooking)
	{
		bookService.saveOrUpdate(carbooking);
		return carbooking.getReservationId();
	}
	@PutMapping("/carbooking")
	private CarBooking update(@RequestBody CarBooking carbooking)
	{
		bookService.saveOrUpdate(carbooking);
		return carbooking;
	}
	@DeleteMapping("carbookings/{reservationId}")
	private void deleteCarBooking(@PathVariable ("reservationId") int reservationId)
	{
		bookService.delete(reservationId);
	}

}

