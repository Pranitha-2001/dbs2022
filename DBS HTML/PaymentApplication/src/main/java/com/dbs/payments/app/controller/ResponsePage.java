package com.dbs.payments.app.controller;

public class ResponsePage {
	
	private boolean status;
	
	private Object body;
	
	private String message;

	
	public ResponsePage() {
		// TODO Auto-generated constructor stub
	}


	public ResponsePage(boolean status, Object body, String message) {
		super();
		this.status = status;
		this.body = body;
		this.message = message;
	}

	public void setMessage(String message)
	{
		this.message=message;
	}
	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Object getBody() {
		return body;
	}


	public void setBody(Object body) {
		this.body = body;
	}


	public String getMessage() {
		return message;
	}


	
}
