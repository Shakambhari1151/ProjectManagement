package com.ibm.shakambhari.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//import org.springframework.format.annotation.DateTimeFormat;



@Entity
//@Table(name="reservation_table")
@Table
public class CarBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="reservation_Id")
	@Column
	private int reservationId;
	
	//@Column(name="reservation_Time")
	@Column
	private Date reservationDateTime;
	
	//@Column(name="reservation_Pick")
	@Column
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date pickUpDateTime;
//	@Column(name="reservation_return")
	
	@Column
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date returnDateTime;
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public Date getReservationDateTime() {
		return reservationDateTime;
	}
	public void setReservationDateTime(Date reservationDateTime) {
		this.reservationDateTime = reservationDateTime;
	}
	public Date getPickUpDateTime() {
		return pickUpDateTime;
	}
	public void setPickUpDateTime(Date pickUpDateTime) {
		this.pickUpDateTime = pickUpDateTime;
	}
	public Date getReturnDateTime() {
		return returnDateTime;
	}
	public void setReturnDateTime(Date returnDateTime) {
		this.returnDateTime = returnDateTime;
	}
	
}

