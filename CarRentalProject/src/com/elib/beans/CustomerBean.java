package com.elib.beans;

public class CustomerBean {
	private int id;
	private String name,email,address;
	private long mobile;

	public CustomerBean() {
	}

	public CustomerBean(int id, String name, String email, String address, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
	}

	public CustomerBean(String name, String email, String address, long mobile) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	
}
