package com.elib.beans;

public class CarBean {
	private int id;
	private String carName,carNum;
	private int seats;
	private long rent;
	private String status;
	
	public CarBean() {
	}

	public CarBean(int id, String carName, String carNum, int seats, long rent,String status) {
		super();
		this.id = id;
		this.carName = carName;
		this.carNum = carNum;
		this.seats = seats;
		this.rent = rent;
		this.status=status;
	}

	public CarBean(String carName, String carNum, int seats, long rent,String status) {
		super();
		this.carName = carName;
		this.carNum = carNum;
		this.seats = seats;
		this.rent = rent;
		this.status=status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public long getRent() {
		return rent;
	}

	public void setRent(long rent) {
		this.rent = rent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
