package database;
import java.util.ArrayList;
import java.util.List;

import invoicing.Product;

public class ProductData {
	private List<Product> products=intializeProductData();
	private List<Product> intializeProductData() {
		List<Product> prodlist=new ArrayList<Product>();
		prodlist.add(new Product(1,"Laptop",50000));
		prodlist.add(new Product(2,"Mouse",2000));
		prodlist.add(new Product(3,"Keyboard",10000));
		return prodlist;
		
	}
	public List<Product> getProducts()
	{
		return products;
	}
	

}
