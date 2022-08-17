package com.dbs.payments.app.controller;

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

import com.dbs.payments.app.model.Address;
import com.dbs.payments.app.model.CustomerAccountDetails;
import com.dbs.payments.app.model.Transaction;
import com.dbs.payments.app.service.CustomerAccountDetailsService;
import com.dbs.payments.app.service.TransactionService;

@RequestMapping("/paymentapp")
@RestController
@CrossOrigin
public class TransactionController {
	
	@Autowired
	private TransactionService transactionservice;
	@Autowired
	private CustomerAccountDetailsService custservice;
	
	@PostMapping("/addtransaction")
	public ResponseEntity<ResponsePage> addTransaction( @RequestBody Transaction transaction){
		
		
		int statuscode=transactionservice.validateTransaction(transaction).getStatusCodeValue();
		if(statuscode==200)
		{
			String cust_id=transaction.getCustomerId().getCustomerid();
			System.out.println(cust_id);
			Optional<CustomerAccountDetails> cust=custservice.getcustdetailsbyid(cust_id);
			CustomerAccountDetails customer=cust.get();
			customer.setClearBalance(customer.getClearBalance()-transaction.getInrAmount());
			transactionservice.addTransaction(transaction);
		}
		return transactionservice.validateTransaction(transaction);
		
	
	}
	@GetMapping("/gettransactions")
	public ResponseEntity<List<Transaction>> getTransactions(){
		return ResponseEntity.ok(transactionservice.getTransactions());
	}
	@GetMapping("/gettransactionbyid/{tid}")
	public ResponseEntity<Transaction> getTransactionsbyid(@PathVariable int tid){
		return ResponseEntity.ok(transactionservice.getTransactionById(tid));
	}
	@GetMapping("/gettransactionbycustid/{custid}")
	public ResponseEntity<List<Transaction>> getTransactionsbycustid(@PathVariable String custid){
		return ResponseEntity.ok(transactionservice.getTransactionByCustid(custid));
	}
	
	
	
	
}
