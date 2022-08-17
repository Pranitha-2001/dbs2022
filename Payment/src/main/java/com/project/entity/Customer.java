package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String customerid;
	private String accountholdername;
	private int overdrafting;
	private double clearbalance;
	private String customeraddress;
	private String customercity;
	private String customertype;
	
	public Customer() 
	{
		
	}

	public Customer(String customerid, String accountholdername, int overdrafting, double clearbalance,
			String customeraddress, String customercity, String customertype) {
		super();
		this.customerid = customerid;
		this.accountholdername = accountholdername;
		this.overdrafting = overdrafting;
		this.clearbalance = clearbalance;
		this.customeraddress = customeraddress;
		this.customercity = customercity;
		this.customertype = customertype;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getAccountholdername() {
		return accountholdername;
	}

	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}

	public int getOverdrafting() {
		return overdrafting;
	}

	public void setOverdrafting(int overdrafting) {
		this.overdrafting = overdrafting;
	}

	public double getClearbalance() {
		return clearbalance;
	}

	public void setClearbalance(double clearbalance) {
		this.clearbalance = clearbalance;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	public String getCustomercity() {
		return customercity;
	}

	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}

	public String getCustomertype() {
		return customertype;
	}

	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", accountholdername=" + accountholdername + ", overdrafting="
				+ overdrafting + ", clearbalance=" + clearbalance + ", customeraddress=" + customeraddress
				+ ", customercity=" + customercity + ", customertype=" + customertype + "]";
	}
	

}
