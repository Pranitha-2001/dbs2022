package client;

import java.sql.SQLException;
import java.util.List;

import database.DbConnection;
import database.ProductDB;
import entity.Product;

public class Test {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		DbConnection dbconnect = new DbConnection();
		dbconnect.connectDB();
		ProductDB productdb = new ProductDB();
		//productdb.insertProduct();
		List<Product> products = productdb.getProducts();
		for(Product product: products) {
			System.out.println(product);
		}
		
	}

}
