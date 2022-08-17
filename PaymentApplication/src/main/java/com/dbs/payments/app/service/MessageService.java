package com.dbs.payments.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payments.app.model.Message;
import com.dbs.payments.app.repository.MessageRepo;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepo messagerepo;
	
	public String addMessage(Message message) {
		messagerepo.save(message);
		return "Message added";
	}
	
	public List<Message> getMessage(){
		return messagerepo.findAll();
	}
}
