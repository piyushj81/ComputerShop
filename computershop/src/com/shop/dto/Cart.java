package com.shop.dto;

public class Cart {
	public Cart(String phone, String id, String pname, int model, String price, String pic) {
		super();
		this.phone = phone;
		this.id = id;
		this.pname = pname;
		this.model = model;
		this.price = price;
		this.pic = pic;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	private String phone;
	private String id;
	private String pname;
	private int model;
	private String price;
	private String pic;
	
	
}
