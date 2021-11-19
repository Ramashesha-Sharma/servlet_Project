package com.elib.beans;

import java.sql.Date;

public class RentCarBean {
	private int carid,custid;
	private String carname,carnum,custname;
	private long custmobile,rent;
	private Date pickup, dropoff;
	private String returnstatus;

	public RentCarBean() {
	}


	public RentCarBean(String carname, String carnum, String custname, long custmobile, long rent, Date pickup,
			Date dropoff) {
		super();
		this.carname = carname;
		this.carnum = carnum;
		this.custname = custname;
		this.custmobile = custmobile;
		this.rent = rent;
		this.pickup = pickup;
		this.dropoff = dropoff;
	
	}
	


	public RentCarBean(int carid, int custid, String carname, String carnum, String custname, long custmobile,
			long rent, Date pickup, Date dropoff) {
		super();
		this.carid = carid;
		this.custid = custid;
		this.carname = carname;
		this.carnum = carnum;
		this.custname = custname;
		this.custmobile = custmobile;
		this.rent = rent;
		this.pickup = pickup;
		this.dropoff = dropoff;
	}


	public int getCarid() {
		return carid;
	}


	public void setCarid(int carid) {
		this.carid = carid;
	}


	public int getCustid() {
		return custid;
	}


	public void setCustid(int custid) {
		this.custid = custid;
	}


	public String getCarname() {
		return carname;
	}


	public void setCarname(String carname) {
		this.carname = carname;
	}


	public String getCarnum() {
		return carnum;
	}


	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}


	public String getCustname() {
		return custname;
	}


	public void setCustname(String custname) {
		this.custname = custname;
	}


	public long getCustmobile() {
		return custmobile;
	}


	public void setCustmobile(long custmobile) {
		this.custmobile = custmobile;
	}


	public long getRent() {
		return rent;
	}


	public void setRent(long rent) {
		this.rent = rent;
	}


	public Date getPickup() {
		return pickup;
	}


	public void setPickup(Date pickup) {
		this.pickup = pickup;
	}


	public Date getDropoff() {
		return dropoff;
	}


	public void setDropoff(Date dropoff) {
		this.dropoff = dropoff;
	}


	public String getReturnstatus() {
		return returnstatus;
	}


	public void setReturnstatus(String returnstatus) {
		this.returnstatus = returnstatus;
	}



}
