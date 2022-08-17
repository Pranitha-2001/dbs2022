package com.hibernate.demos.HibernateDemo.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class ReaderEntity {
	private static final long serialVersionUID = -1798070786993154676L;
	@Id
	private Integer readerId;
	private String email;
	private String firstname;
	private String lastname;
	@ManyToMany(mappedBy = "readers")
	
	private Set<SubscriptionEntity> subscriptions;
	public Integer getReaderId() {
		return readerId;
	}
	public void setReaderId(Integer readerId) {
		this.readerId = readerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Set<SubscriptionEntity> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(Set<SubscriptionEntity> subscriptions) {
		this.subscriptions = subscriptions;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ReaderEntity [readerId=" + readerId + ", email=" + email + ", firstname=" + firstname + ", lastname="
				+ lastname + "]";
	}
	

}
