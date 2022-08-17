package com.hibernate.demos.HibernateDemo.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Embeddable
@Entity
public class Email {
	@Id
	private  int id;
	private String emailId;
	public Email() {
		
	}
	public Email(int id, String emailId) {
		super();
		this.id = id;
		this.emailId = emailId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Email [id=" + id + ", emailId=" + emailId + "]";
	}
	
	 

}
