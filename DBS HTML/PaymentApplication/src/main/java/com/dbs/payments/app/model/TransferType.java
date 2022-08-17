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
	
	}
