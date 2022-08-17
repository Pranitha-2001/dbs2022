package com.dbs.payments.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressid;
	private String city;
	private String zipcode;
	public String getCity() {
		return city;
	}
	
	
	public Address(int addressid, String city, String zipcode) {
		super();
		this.addressid = addressid;
		this.city = city;
		this.zipcode = zipcode;
	}


	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
}
