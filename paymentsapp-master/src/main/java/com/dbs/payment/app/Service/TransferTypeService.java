package com.dbs.payment.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payment.app.Repository.TransferTypeRepo;
import com.dbs.payments.app.model.TransferType;

@Service
public class TransferTypeService {
	@Autowired
	TransferTypeRepo transfertypeRepo;
	public List<TransferType> getTransferTypeData() {
		return transfertypeRepo.findAll();
		
	}
	public void transfertypesave(TransferType t) {
		transfertypeRepo.save(t);
	}

}
