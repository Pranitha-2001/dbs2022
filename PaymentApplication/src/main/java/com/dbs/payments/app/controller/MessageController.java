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

import com.dbs.payments.app.model.Message;
import com.dbs.payments.app.service.MessageService;

@RestController
@RequestMapping("/paymentapp")
@CrossOrigin
public class MessageController {

	@Autowired
	private MessageService messageservice;
	
	@PostMapping("/addmessage")
	public String addMessage(@RequestBody Message message) {
		messageservice.addMessage(message);
		return "Message added to DB";
	}
	
	@GetMapping("/getmessage")
	public ResponseEntity<List<Message>> getMessage(){
		return ResponseEntity.ok(messageservice.getMessage());
	}
}
