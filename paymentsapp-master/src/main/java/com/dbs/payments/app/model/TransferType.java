package com.dbs.payments.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TransferType {

	@Id
	private String transferTypeCode;
	private String transferTypeDescription;
	
	@OneToMany(mappedBy = "transferType")
	private List<Transaction> transactions;
	
	public TransferType() {
		// TODO Auto-generated constructor stub
	}

	public String getTransferTypeCode() {
		return transferTypeCode;
	}

	public void setTransferTypeCode(String transferTypeCode) {
		this.transferTypeCode = transferTypeCode;
	}

	public String getTransferTypeDescription() {
		return transferTypeDescription;
	}

	public void setTransferTypeDescription(String transferTypeDescription) {
		this.transferTypeDescription = transferTypeDescription;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
}
