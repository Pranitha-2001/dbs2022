package invoicing;

public class Customer {
	private String email;
	private String customername;
	private String customerphoneno;
	public Customer(String email, String customername, String customerphoneno) {
		super();
		this.email = email;
		this.customername = customername;
		this.customerphoneno = customerphoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomerphoneno() {
		return customerphoneno;
	}
	public void setCustomerphoneno(String customerphoneno) {
		this.customerphoneno = customerphoneno;
	}
	
}