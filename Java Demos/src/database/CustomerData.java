package database;

import java.util.ArrayList;
import java.util.List;
import invoicing.Customer;

public class CustomerData {
	private List<Customer> customers = intializeCustomers();
	private List<Customer> intializeCustomers(){
		List<Customer> custlist = new ArrayList<Customer>();
		custlist.add(new Customer("a@a.c","A","1111111111"));
		custlist.add(new Customer("b@a.c","B","1111111111"));
		custlist.add(new Customer("c@a.c","C","1111111111"));
		return custlist;
		
	}
	public List<Customer> getCustomers()
	{
		return customers;
	}

}
