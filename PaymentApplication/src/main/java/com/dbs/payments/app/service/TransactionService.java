package com.dbs.payments.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dbs.payments.app.controller.ResponsePage;
import com.dbs.payments.app.model.Address;
import com.dbs.payments.app.model.CustomerAccountDetails;
import com.dbs.payments.app.model.Transaction;
import com.dbs.payments.app.repository.TransactionRepo;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepo transactionrepo;
	@Autowired
	private CustomerAccountDetailsService custService;

	public void addTransaction(Transaction transaction) {
		transactionrepo.save(transaction);
	}

	public List<Transaction> getTransactions() {
		return transactionrepo.findAll();
	}

	public Transaction getTransactionById(int tid) {
		return transactionrepo.findById(tid).orElse(null);
	}

	public List<Transaction> getTransactionByCustid(String custid) {
		return transactionrepo.getTransactionByCustid(custid).orElse(null);
	}

	public ResponseEntity<ResponsePage> validateTransaction(Transaction transaction) {
		try {
			Optional<CustomerAccountDetails> customer = custService
					.getcustdetailsbyid(transaction.getCustomerId().getCustomerid());
			if (customer.isPresent()) 
			{
				CustomerAccountDetails cust = customer.get();
				if ((cust.getClearBalance() > transaction.getInrAmount()) || cust.getOverDraft() == 1) 
				{
					if (transaction.getTransferType().getTransfercode().equals(cust.getCustomerType())) 
					{
						return ResponseEntity.status(HttpStatus.OK).body(new ResponsePage(true, transaction, "valid"));

					}
					
					else if (transaction.getTransferType().getTransfercode().equals("banktransfer")) 
					{
						if (cust.getCustomerType().equals("bank")) {
							return ResponseEntity.status(HttpStatus.OK)
									.body(new ResponsePage(true, transaction, "valid"));

						} else {
							return ResponseEntity.status(HttpStatus.BAD_REQUEST)
									.body(new ResponsePage(false, transaction, "Illegal Transfer Type"));
						}
					} 
					
					else if (transaction.getTransferType().getTransfercode().equals("banktransfertoown")) 
					{
						if (cust.getCustomerType().equals("bank")
								&& transaction.getReceiverbic().getBic().contains("HDFC")) {
							return ResponseEntity.status(HttpStatus.OK)
									.body(new ResponsePage(true, transaction, "valid"));
						} else {
							return ResponseEntity.status(HttpStatus.BAD_REQUEST)
									.body(new ResponsePage(false, transaction, "Illegal Transfer Type"));
						}
					}

					else {
						return ResponseEntity.status(HttpStatus.BAD_REQUEST)
								.body(new ResponsePage(false, transaction, "Illegal Transfer Type"));
					}

				} 
				else {
					return ResponseEntity.status(HttpStatus.BAD_REQUEST)
							.body(new ResponsePage(false, transaction, "Insuffecient Funds"));
				}

			} 
			
			else 
			{
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
						.body(new ResponsePage(false, transaction, "Customer Doesn't exists"));
			}
		} 
		catch (Exception e) {
			System.out.println(e);

		}
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponsePage(true, transaction, "valid"));
		
	}

}
