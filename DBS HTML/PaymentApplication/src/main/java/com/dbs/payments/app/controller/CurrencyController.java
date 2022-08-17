package com.dbs.payments.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.payments.app.model.Currency;
import com.dbs.payments.app.service.CurrencyService;

@RestController
@RequestMapping("/paymentapp")
public class CurrencyController {
	
	@Autowired
	private CurrencyService currencyservice;
	
	@PostMapping("/addcurrency")
	public String addCurrency(@RequestBody Currency currency) {
		currencyservice.addCurrency(currency);
		return "Currency Added";
	}
	
	@GetMapping("/getcurrency")
	public ResponseEntity<List<Currency>> getCurrency(){
		return ResponseEntity.ok(currencyservice.getCurrency());
	}
	

}
