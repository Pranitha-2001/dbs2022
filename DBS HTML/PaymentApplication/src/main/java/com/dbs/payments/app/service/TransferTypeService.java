package com.dbs.payments.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payments.app.model.TransferType;
import com.dbs.payments.app.repository.TransferTypeRepo;

@Service
public class TransferTypeService {
	@Autowired
	private TransferTypeRepo transfertyperepo;
	
	public String addTrasferType(TransferType transfertype) {
		transfertyperepo.save(transfertype);
		return "transfer type saved to database";
	}
	
	public List<TransferType> getTransferType(){
		return transfertyperepo.findAll();
	}
}
