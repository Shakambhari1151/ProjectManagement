package com.ibm.shakambhari.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.shakambhari.domain.*;

public interface carBookingRepository extends JpaRepository<CarBooking, Integer>{
	

}

