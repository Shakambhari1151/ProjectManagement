package com.ibm.shakambhari.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.shakambhari.domain.*;




public interface PersonDAO extends JpaRepository<Person, Integer> {

	void deleteByPersonId(Integer personId);
	
	List<Person> findAll();

	Person findByPersonId(int personId);
	
//	@Modifying
//	@Query("update Vehicle v set v.brand = ?1, v.type = ?2, v.vehiclePlateNumber = ?3, v.model = ?4, v.numberOfSeats = ?5, v.dailyPrice = ?6, v.isAvailable = ?7 where v.vehicleId = ?8")

//	void setVehicleByVehicleId(String brand, String type, String vehiclePlateNumber, int model, int numberOfSeats,
//			double dailyPrice, Boolean isAvailable, int vehicleId);
}



