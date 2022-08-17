package com.dbs.payments.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.payments.app.model.Address;
import com.dbs.payments.app.service.AddressService;

@RestController
@RequestMapping("/paymentapp")
public class AddressController {
	@Autowired
	private AddressService addservice;
	
	@PostMapping("/addaddress")
	public String create( @RequestBody Address address){
		addservice.addAddress(address);
		return "saved";
		
	}
	@GetMapping("/getaddress")
	public ResponseEntity<List<Address>> getaddress(){
		return ResponseEntity.ok(addservice.getAddress());
	}
	
	

}
