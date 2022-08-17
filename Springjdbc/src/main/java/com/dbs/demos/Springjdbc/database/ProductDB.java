package com.dbs.demos.Springjdbc.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dbs.demos.Springjdbc.entity.Product;

@Repository
public class ProductDB {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	private List<String> fruits;
	public List<String> getFruits() {
		return fruits;
	}
	
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public ProductDB() {
		System.out.println("Inside product db");
	}
	public boolean insertProduct(ProductDB product) {
		String sql = "insert into product values(?,?,?)";
		try {
			this.jdbcTemplate.update(sql,product.getProdid(),product.getName(),product.getPrice());
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
			
		}
		return true;
	}
	
	}
	class ProductMapper implements RowMapper<ProductMapper> {

		@Override
		public ProductDB mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product product = new Product();
			product.setProdid(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setPrice(rs.getDouble(3));
			return product;
		}
		
	}
	
	public List<Product> getProducts() {
		String sql = "select * from product";
			return this.jdbcTemplate.query(sql, new ProductMapper());
		
		
	}
	public Product getProductById(int id) {
		String sql = "select * from product where prodid=?";
		return this.jdbcTemplate.queryForObject(sql, new ProductMapper(), id);
		
	}
	public boolean deleteProduct(int id)
	{
		String sql = "delete from product where Prodid = ?";
		try {
			jdbcTemplate.update(sql,id);
		}
		catch(Exception e) {
		System.out.println(e);
		return false;
		}
		return true;
	}
	public boolean updateProduct(ProductDB product) {
		String sql = "update product set name = ?,price = ? where prodid=?";
		try {
			this.jdbcTemplate.update(sql,product.getName(),product.getprice(),product.getProdid());
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	private Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
