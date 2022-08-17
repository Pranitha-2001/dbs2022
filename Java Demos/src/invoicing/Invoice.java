package invoicing;

import java.time.LocalDate;
import java.util.List;

public class Invoice {

	private String invno;
	private Customer customer;
	private LocalDate invdate;
	private String status;
	private List<LineItem> lineItems;
	public Invoice(String invno) {
		super();
		this.invno = invno;
		this.invdate = LocalDate.now();
	}
	public String getInvno() {
		return invno;
	}
	public void setInvno(String invno) {
		this.invno = invno;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDate getInvdate() {
		return invdate;
	}
	public void setInvdate(LocalDate invdate) {
		this.invdate = invdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<LineItem> getLineItems() {
		return lineItems;
	}
	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}
	@Override
	public String toString() {
		return "Invoice [invno=" + invno + ", customer=" + customer + ", status=" + status + "]";
	}
	
}
