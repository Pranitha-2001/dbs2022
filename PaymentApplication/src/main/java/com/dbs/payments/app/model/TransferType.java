package com.dbs.payments.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TransferType {

	@Id
	
	private String transfercode;
	private String transferdescription;
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy= "transferType")
//	private List<Transaction> transactions;
	public TransferType() {
		
	}

public TransferType(String transfercode, String transferdescription) {
	super();
	this.transfercode = transfercode;
	this.transferdescription = transferdescription;
}

public String getTransfercode() {
	return transfercode;
}

public void setTransfercode(String transfercode) {
	this.transfercode = transfercode;
}

public String getTransferdescription() {
	return transferdescription;
}

public void setTransferdescription(String transferdescription) {
	this.transferdescription = transferdescription;
}

@Override
public String toString() {
	return "TransferType [transfercode=" + transfercode + ", transferdescription=" + transferdescription + "]";
}
	
	
	}
