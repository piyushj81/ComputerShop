package com.shop.dto;

public class Admin {
	public Admin(String id, String phone, String cname, String pic, String pname, int model, String price,
			String address, String city, String pincode, String state) {
		super();
		this.id = id;
		this.phone = phone;
		this.cname = cname;
		this.pic = pic;
		this.pname = pname;
		this.model = model;
		this.price = price;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	private String id;
	private String phone;
	private String cname;
	private String pic;
	private String pname;
	private int model;
	private String price;
	private String address;
	private String city;
	private String pincode;
	private String state;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
}
