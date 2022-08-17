package com.dbs.payments.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Logger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne()
	private CustomerAccountDetails customerid;

	@ManyToOne()
	private Employee employeeId;
	
	
	
	private String screenName;
	private String action;  
	private String ipaddress;
	public Logger() {
		
	}
	public Logger(int id, CustomerAccountDetails customerid, Employee employeeId, String screenName, String action,
			String ipaddress) {
		super();
		this.id = id;
		this.customerid = customerid;
		this.employeeId = employeeId;
		this.screenName = screenName;
		this.action = action;
		this.ipaddress = ipaddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CustomerAccountDetails getCustomerid() {
		return customerid;
	}
	public void setCustomerid(CustomerAccountDetails customerid) {
		this.customerid = customerid;
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
	@Override
	public String toString() {
		return "Logger [id=" + id + ", customerid=" + customerid + ", employeeId=" + employeeId + ", screenName="
				+ screenName + ", action=" + action + ", ipaddress=" + ipaddress + "]";
	}
	
	
	}
