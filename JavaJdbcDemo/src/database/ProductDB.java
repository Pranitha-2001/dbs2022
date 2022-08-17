package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Product;

public class ProductDB {
	DbConnection dbconnection = new DbConnection();
	public Product insertProduct() throws ClassNotFoundException, SQLException {
		String sql = "insert into product values(?,?,?)";
	    Connection con = dbconnection.connectDB();
	    //This prepare the query to be executed
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setInt(1,4);
	    ps.setString(2,"Monitor");
	    ps.setDouble(3,3000);
	    ps.executeUpdate();
	    dbconnection.closeConnection();
		return null;
		
	}
	public List<Product> getProducts( ) throws ClassNotFoundException, SQLException{
		String sql = "select * from product";
		Connection con = dbconnection.connectDB();
		//It prepares the query to be executed
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		List<Product> products = new ArrayList<>();
		while(rs.next()) {
			Product product = new Product();
			product.setProdid(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setPrice(rs.getDouble(3));
			products.add(product);
		}
		return products;
	}

}
