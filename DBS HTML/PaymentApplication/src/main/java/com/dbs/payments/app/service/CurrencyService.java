package com.dbs.payments.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payments.app.model.Currency;
import com.dbs.payments.app.repository.CurrencyRepo;

@Service
public class CurrencyService {
	
	@Autowired
 private CurrencyRepo currencyrepo;
	
	public void addCurrency(Currency c)
	{
		currencyrepo.save(c);
	}
	public List<Currency> getCurrency()
	{
		return (List<Currency>) currencyrepo.findAll();
	}
	

}
