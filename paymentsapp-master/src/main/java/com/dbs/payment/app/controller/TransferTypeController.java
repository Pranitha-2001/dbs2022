package com.dbs.payment.app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.payment.app.Service.TransferTypeService;
import com.dbs.payments.app.model.TransferType;
@RestController
@RequestMapping("/paymentapp")
public class TransferTypeController {
	TransferTypeService transfertypeservice;
	
	@GetMapping("/addtransfertype")
	public String createData(@RequestBody TransferType t) {
		transfertypeservice.transfertypesave(t);
		return "Data inserted successfully";
	}
	@PostMapping("/gettransfertype")
	public ResponseEntity<List<TransferType>> getAllTransferType(){
		return ResponseEntity.ok(transfertypeservice.getTransferTypeData());
		
	}

}
