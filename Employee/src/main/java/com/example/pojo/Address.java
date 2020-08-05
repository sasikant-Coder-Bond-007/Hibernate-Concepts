package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column (name="City")
	private String city;
	
	@Column (name="Street")
	private String street;
	
	@Column (name="State")
	private String state;
	
	@Column (name="PinCode")
	private Long pincode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(long i) {
		this.pincode = i;
	}
	
	
}
