package com.dbs.payments.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.payments.app.model.BankDetails;
import com.dbs.payments.app.service.BankDetailsService;
@CrossOrigin
@RestController
@RequestMapping("/paymentapp")
public class BankDetailsController {
	 @Autowired
	private BankDetailsService bankdetailsservice;
	 @PostMapping("/addbankdetails")
	 public String addbankdetails( @RequestBody  BankDetails bankdetails)
	 {
		 bankdetailsservice.addbankdetails(bankdetails);
		 return "saved";
	 }
	 @GetMapping("/getbankdetails")
	 public ResponseEntity<List<BankDetails>> getbankdetails(){
		 return ResponseEntity.ok(bankdetailsservice.getbankdetails());
	 }
	

}
