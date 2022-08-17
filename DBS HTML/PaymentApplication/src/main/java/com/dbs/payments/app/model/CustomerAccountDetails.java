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
	
	
}
