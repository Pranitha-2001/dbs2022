package com.dbs.payments.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Logger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(optional = false)
	private CustomerAccountDetails customerId;

	@ManyToOne(optional = false)
	private Employee employeeId;
	
	private String screenName;
	private String action;
	private String ipaddress;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CustomerAccountDetails getCustomerId() {
		return customerId;
	}

	public void setCustomerId(CustomerAccountDetails customerId) {
		this.customerId = customerId;
	}

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	
	public Logger() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Logger [id=" + id + ", customerId=" + customerId + ", employeeId=" + employeeId + ", screenName="
				+ screenName + ", action=" + action + ", ipaddress=" + ipaddress + "]";
	}
	
}
