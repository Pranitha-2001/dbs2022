package com.hibernate.demos.HibernateDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Supplier {
	@Id
	private int sid;
	private String supplierName;
	private String city;
	private String company;
   //	@Embedded
	@OneToOne
	private Email email;
	public Supplier() {
		
	}
	public Supplier(int sid, String supplierName, String city, String company, Email email) {
		super();
		this.sid = sid;
		this.supplierName = supplierName;
		this.city = city;
		this.company = company;
		this.email = email;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", supplierName=" + supplierName + ", city=" + city + ", company=" + company
				+ ", email=" + email + "]";
	}
	

}
