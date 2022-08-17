package com.dbs.payments.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payments.app.model.BankDetails;
import com.dbs.payments.app.repository.BankDetailsRepo;

@Service
public class BankDetailsService {
	@Autowired
	private BankDetailsRepo bankdetailsrepo;
	
	public void addbankdetails(BankDetails bankdetails) {
		bankdetailsrepo.save(bankdetails);
	}
	
	public List<BankDetails> getbankdetails()
	{
		return (List<BankDetails>) bankdetailsrepo.findAll();
	}
	

}
