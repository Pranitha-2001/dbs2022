package com.dbs.payments.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Currency {
	
	@Id
	private String currencyCode;
	private String currencyName;
	private double conversionRate;
//	@OneToMany(mappedBy = "currencyCode")
//	private List<Transaction> transactions;
	
}
