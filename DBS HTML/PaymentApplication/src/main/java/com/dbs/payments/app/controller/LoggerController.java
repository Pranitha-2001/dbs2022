package com.dbs.payments.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.payments.app.model.Address;
import com.dbs.payments.app.model.Logger;
import com.dbs.payments.app.service.LoggerService;

@RestController
@RequestMapping("/paymentapp")
public class LoggerController {
	
	@Autowired
	private LoggerService loggerservice;
	
	@PostMapping("/addlogger")
	public String addLogger(@RequestBody Logger logger) {
		
		loggerservice.addLogger(logger);
		return "Logger added";
	}
	
	@GetMapping("/getloggers")
	public ResponseEntity<List<Logger>> getLoggers(){
		return ResponseEntity.ok(loggerservice.getLogs());
	}
}
