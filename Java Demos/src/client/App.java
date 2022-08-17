package client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import database.CustomerData;
import database.ProductData;
import invoicing.Customer;
import invoicing.Invoice;
import invoicing.LineItem;
import invoicing.Product;

public class App {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		ProductData productData= new ProductData();
		CustomerData customerData=new CustomerData();
		List<Product> products=productData.getProducts();
		List<Customer>customers = customerData.getCustomers();
		System.out.println("Enter customer email id");
		String email=sc.next();
		App app = new App();
		if(app.validateCustomer(email,customers))
		{
			System.out.println("Please choose a product to purchase");
			app.displayProducts(products);
			Invoice invoice = new Invoice("I001");
			int id=1;
			List<LineItem> items = new ArrayList<>();
			while(true)
			{
				int pid =  sc.nextInt();
				System.out.println("Enter quantity");
				int qty=sc.nextInt();
				for(Product product: products)
				{
					if(product.getProdid()==pid)
					{
						LineItem item = new LineItem(1,invoice, product, qty);
						items.add(item);						break;
					}
				}
				System.out.println("Do you want to continue enter y/n");
				char ch = sc.next().charAt(0);
				if(ch=='n'|| ch=='N')
					break;
				System.out.println("Please choose a product to purchase");
				app.displayProducts(products);
			}
			invoice.setLineItems(items);
			int total=0;
			System.out.println("Invoice No "+invoice.getInvno());
			System.out.println("Customer Email "+email);
			System.out.format("%5s%10s%10s%10s%10s\n"
					,"SNO","Name","Price","Quantity","Total" );
			for(LineItem item : invoice.getLineItems())
			{
				double sum = item.getQuantity() * item.getProduct().getPrice();
				System.out.format("%5s%10s%10s%10s%10s",item.getId(),item.getProduct().getName(),item.getProduct().getPrice(),item.getQuantity(),sum);
				total+=sum;
			}
			System.out.println("Total Amount "+total);
		}
		else {
			System.out.println("Not a valid email id");
		}
	}
	public void displayProducts(List<Product> products)
	{
		System.out.format("%3s%10s%8s\n", "Id" ,"Name","Price");
		for(Product product: products)
		{
			System.out.format("%3d",product.getProdid());
			System.out.format("%10s",product.getName());
			System.out.format("%12.2f \n", product.getPrice());
		}
}
	public boolean validateCustomer(String email,List<Customer> customers)
	{
		for(Customer customer: customers)
		{
			if(customer.getEmail().equals(email))
				return true;
		}
		return false;
	}

}
