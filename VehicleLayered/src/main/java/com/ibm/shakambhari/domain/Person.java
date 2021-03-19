package com.ibm.shakambhari.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.validation.constraints.Min;

//import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private Integer personId;	

	private String userName;
		
	private String password;
		
	private String phonenumber;	
	
	private String address;
	
	private String email;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", userName=" + userName + ", password=" + password + ", phonenumber="
				+ phonenumber + ", address=" + address + ", email=" + email + "]";
	}
	
	
	
	

}



