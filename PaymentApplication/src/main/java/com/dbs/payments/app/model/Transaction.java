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
	public Transaction() {
		
	}
	public Transaction(int transactionId, CustomerAccountDetails customerId, BankDetails receiverbic,
			String receiverAccountNumber, String receiverName, TransferType transferType, Message messageCode,
			double currencyAmount, double transferFee, double inrAmount, String transferDate) {
		super();
		this.transactionId = transactionId;
		this.customerId = customerId;
		this.receiverbic = receiverbic;
		this.receiverAccountNumber = receiverAccountNumber;
		this.receiverName = receiverName;
		this.transferType = transferType;
		this.messageCode = messageCode;
		this.currencyAmount = currencyAmount;
		this.transferFee = transferFee;
		this.inrAmount = inrAmount;
		this.transferDate = transferDate;
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
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", customerId=" + customerId + ", receiverbic="
				+ receiverbic + ", receiverAccountNumber=" + receiverAccountNumber + ", receiverName=" + receiverName
				+ ", transferType=" + transferType + ", messageCode=" + messageCode + ", currencyAmount="
				+ currencyAmount + ", transferFee=" + transferFee + ", inrAmount=" + inrAmount + ", transferDate="
				+ transferDate + "]";
	}
	
	
	}
