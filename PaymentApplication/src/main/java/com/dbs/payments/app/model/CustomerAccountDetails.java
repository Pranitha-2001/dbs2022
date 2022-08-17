package com.dbs.payments.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="customerdetails")
public class CustomerAccountDetails {
	
	@Id
	private String customerid;
	private String accountNumber;
	private String accountHolderName;
	private int overDraft;
	private double clearBalance;
	private String customerType;
	@OneToOne()
	private Address address;
	public CustomerAccountDetails() {
		
	}
	public CustomerAccountDetails(String customerid, String accountNumber, String accountHolderName, int overDraft,
			double clearBalance, String customerType, Address address) {
		super();
		this.customerid = customerid;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.overDraft = overDraft;
		this.clearBalance = clearBalance;
		this.customerType = customerType;
		this.address = address;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
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
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustomerAccountDetails [customerid=" + customerid + ", accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName + ", overDraft=" + overDraft + ", clearBalance="
				+ clearBalance + ", customerType=" + customerType + ", address=" + address + "]";
	}
	
	
}
