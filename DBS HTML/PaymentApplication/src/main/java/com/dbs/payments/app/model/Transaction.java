package com.dbs.payments.app.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
	@Id
	private int transactionId;
	@ManyToOne()
	private CustomerAccountDetails customerId;
//	@ManyToOne()
//	private Currency currencyCode;
	@ManyToOne()
	private BankDetails receiverbic;
	private String receiverAccountNumber;
	private String receiverName;
	@ManyToOne()
	private TransferType transferType;
	
	@ManyToOne()
	private Message messageCode;
	
	private double currencyAmount;
	private double transferFee;
	private double inrAmount;
	private String transferDate;
	
	}
