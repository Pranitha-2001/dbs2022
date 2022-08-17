package com.dbs.payments.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BankDetails {

	@Id
	private String bic;
	private String bankName;
	
	@OneToMany(mappedBy = "receiverbic")
	private List<Transaction> transactions;
	
	public BankDetails() {
		// TODO Auto-generated constructor stub
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	
	
}
