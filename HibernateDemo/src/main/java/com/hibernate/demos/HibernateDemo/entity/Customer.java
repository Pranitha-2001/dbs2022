package com.hibernate.demos.HibernateDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String email;
	private String password;
	@Column(name="phone")
	private String phoneNumber;
	private String city;
	public Customer() {
		
	}
	public Customer(String email, String password, String phoneNumber, String city) {
		
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber + ", city=" + city
				+ "]";
	}
	

}
