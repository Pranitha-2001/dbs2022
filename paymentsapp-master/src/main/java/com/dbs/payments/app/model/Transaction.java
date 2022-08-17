package com.dbs.payments.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;
	
	@ManyToOne(optional = false)
	private CustomerAccountDetails customerId;
	
	@ManyToOne
	private Currency currencyCode;
	
	@ManyToOne
	private BankDetails receiverbic;
	
	private String receiverAccountNumber;
	private String receiverName;
	
	@ManyToOne
	private TransferType transferType;
	
	@ManyToOne
	private Message messageCode;
	
	private double currencyAmount;
	private double transferFee;
	private double inrAmount;
	private String transferDate;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public CustomerAccountDetails getCustomerId() {
		return customerId;
	}

	public void setCustomerId(CustomerAccountDetails customerId) {
		this.customerId = customerId;
	}

	public Currency getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(Currency currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BankDetails getReceiverbic() {
		return receiverbic;
	}

	public void setReceiverbic(BankDetails receiverbic) {
		this.receiverbic = receiverbic;
	}

	public String getReceiverAccountNumber() {
		return receiverAccountNumber;
	}

	public void setReceiverAccountNumber(String receiverAccountNumber) {
		this.receiverAccountNumber = receiverAccountNumber;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public TransferType getTransferType() {
		return transferType;
	}

	public void setTransferType(TransferType transferType) {
		this.transferType = transferType;
	}

	public Message getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(Message messageCode) {
		this.messageCode = messageCode;
	}

	public double getCurrencyAmount() {
		return currencyAmount;
	}

	public void setCurrencyAmount(double currencyAmount) {
		this.currencyAmount = currencyAmount;
	}

	public double getTransferFee() {
		return transferFee;
	}

	public void setTransferFee(double transferFee) {
		this.transferFee = transferFee;
	}

	public double getInrAmount() {
		return inrAmount;
	}

	public void setInrAmount(double inrAmount) {
		this.inrAmount = inrAmount;
	}

	public String getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}

}
