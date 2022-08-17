package com.dbs.payments.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Message {
	
	@Id
	private String messageCode;
	private String instruction;
	
//	@OneToMany(mappedBy = "messageCode")
//	private List<Transaction> transactions;
	public Message() {
		
	}

public Message(String messageCode, String instruction) {
	super();
	this.messageCode = messageCode;
	this.instruction = instruction;
}

public String getMessageCode() {
	return messageCode;
}

public void setMessageCode(String messageCode) {
	this.messageCode = messageCode;
}

public String getInstruction() {
	return instruction;
}

public void setInstruction(String instruction) {
	this.instruction = instruction;
}

@Override
public String toString() {
	return "Message [messageCode=" + messageCode + ", instruction=" + instruction + "]";
}
	
	
	}
