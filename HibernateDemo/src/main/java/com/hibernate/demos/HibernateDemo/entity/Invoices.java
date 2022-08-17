package com.hibernate.demos.HibernateDemo.entity;

import java.time.LocalDate;

public class Invoices {
	private String invno;
	private String custname;
	private LocalDate date;
	private Product product;
	private int qty;
	private double invoiceamount;
	public Invoices() {
		
	}
	public Invoices(String invno, String custname, LocalDate date, Product product, int qty, double invoiceamount) {
		super();
		this.invno = invno;
		this.custname = custname;
		this.date = date;
		this.product = product;
		this.qty = qty;
		this.invoiceamount = invoiceamount;
	}
	public String getInvno() {
		return invno;
	}
	public void setInvno(String invno) {
		this.invno = invno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getInvoiceamount() {
		return invoiceamount;
	}
	public void setInvoiceamount(double invoiceamount) {
		this.invoiceamount = invoiceamount;
	}
	@Override
	public String toString() {
		return "Invoices [invno=" + invno + ", custname=" + custname + ", date=" + date + ", product=" + product
				+ ", qty=" + qty + ", invoiceamount=" + invoiceamount + "]";
	}
	

}
