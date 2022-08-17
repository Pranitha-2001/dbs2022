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
	public Currency() {
		
	}
public Currency(String currencyCode, String currencyName, double conversionRate) {
	super();
	this.currencyCode = currencyCode;
	this.currencyName = currencyName;
	this.conversionRate = conversionRate;
}
public String getCurrencyCode() {
	return currencyCode;
}
public void setCurrencyCode(String currencyCode) {
	this.currencyCode = currencyCode;
}
public String getCurrencyName() {
	return currencyName;
}
public void setCurrencyName(String currencyName) {
	this.currencyName = currencyName;
}
public double getConversionRate() {
	return conversionRate;
}
public void setConversionRate(double conversionRate) {
	this.conversionRate = conversionRate;
}
@Override
public String toString() {
	return "Currency [currencyCode=" + currencyCode + ", currencyName=" + currencyName + ", conversionRate="
			+ conversionRate + "]";
}
	
	
}
