package com.dbs.payments.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customerdetails")
public class CustomerAccountDetails {
	
	@Id
	private String customerid;
	private String accountNumber;
	private String accountHolderName;
	private int overDraft;
	private double clearBalance;
	@OneToOne
	private Address address;
	
	public CustomerAccountDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomerAccountDetails(String customerid, String accountNumber, String accountHolderName, int overDraft,
			double clearBalance, Address address) {
		super();
		this.customerid = customerid;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.overDraft = overDraft;
		this.clearBalance = clearBalance;
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerAccountDetails [customerid=" + customerid + ", accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName + ", overDraft=" + overDraft + ", clearBalance="
				+ clearBalance + ", address=" + address + "]";
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(int overDraft) {
		this.overDraft = overDraft;
	}

	public double getClearBalance() {
		return clearBalance;
	}

	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
