package com.dbs.payments.app.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dbs.payments.app.model.CustomerAccountDetails;
import com.dbs.payments.app.model.Logger;
import com.dbs.payments.app.service.CustomerAccountDetailsService;
@CrossOrigin
@RestController
@RequestMapping("/paymentapp")
public class CustomerAccountDetailsController {
	@Autowired
	private CustomerAccountDetailsService customeraccountdetailsservice;
	@PostMapping("/addcustomerdetails")
	public String addCustomerDetails(@RequestBody CustomerAccountDetails customer) {
		customeraccountdetailsservice.addCustomerDetails(customer);
		return "Details Added";
	}
	@GetMapping("/getcustomerdetails")
	public ResponseEntity<List<CustomerAccountDetails>> getCustomerData(){
		return ResponseEntity.ok(customeraccountdetailsservice.getCustomerData());
	}
	@GetMapping("/getcustomerdetails/{custid}")
	public ResponseEntity<Optional<CustomerAccountDetails>> getcustbyid(@PathVariable String custid ){
		return ResponseEntity.ok(customeraccountdetailsservice.getcustdetailsbyid(custid));
	}
	@PostMapping("/validatereceiver")
	public String validatereceiver(@RequestBody String name) throws IOException
	{
		if(customeraccountdetailsservice.checkreceiver(name))
			return "Invalid";
		return "Valid";
	}

}
