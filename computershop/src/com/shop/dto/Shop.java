package com.shop.dto;

public class Shop {
	


		
	public Shop(String id, String phone, String pname, int model, String price, String pic) {
		super();
		this.id = id;
		this.phone = phone;
		this.pname = pname;
		this.model = model;
		this.price = price;
		this.pic = pic;
	}
	public Shop() {
		// TODO Auto-generated constructor stub
	}
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
	private String id;
	private String phone;
	
	private String pname;
	private int model;
	private String price;
	private String pic;

}
