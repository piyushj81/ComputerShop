package com.shop.dto;

public class Form {
	public Form(String phone, String address, String pincode, String city, String state) {
		super();
		this.phone = phone;
		this.address = address;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String phone;
	
	private String address;
	private String pincode;
	private String city;
	private String state;
	
}
