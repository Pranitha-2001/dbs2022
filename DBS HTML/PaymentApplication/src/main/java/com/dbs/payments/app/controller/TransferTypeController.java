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

import com.dbs.payments.app.model.TransferType;
import com.dbs.payments.app.service.TransferTypeService;

@RestController
@RequestMapping("/paymentapp")
@CrossOrigin
public class TransferTypeController {
	@Autowired
	private TransferTypeService transfertypeservice;
	
	@PostMapping("/addtransfertype")
	public String addTransferType(@RequestBody TransferType transfertype) {
		transfertypeservice.addTrasferType(transfertype);
		return "transfertype added";
	}
	
	@GetMapping("/gettransfertype")
	public ResponseEntity<List<TransferType>> getTransferType(){
		return ResponseEntity.ok(transfertypeservice.getTransferType());
	}
}
