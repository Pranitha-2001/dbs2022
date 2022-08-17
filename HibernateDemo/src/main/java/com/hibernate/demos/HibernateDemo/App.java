package com.hibernate.demos.HibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.demos.HibernateDemo.entity.Customer;
import com.hibernate.demos.HibernateDemo.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
	static SessionFactory sf =  HibernateUtil.getSessionFactory();

    public static void main( String[] args )
    {
        Product product = new Product();
       // product.setName("Laptop");
      //  product.setPrice(80000.0);
       // insertProduct(product);
       // product.setName("Mac");
       // product.setPrice(60000.0);
        //updateProduct(product);
        //product.setId(3);
       // deleteProduct(product);
        //product.setId(1);
      //  System.out.println(getProductById(1).getProdid());
        //System.out.println(getProductById(2).getProdid());
        System.out.println(getCustomersByCity("Hyderabad"));
        //Customer c1 = new Customer("a@a.c","abc","1234567890","Hyderabad");
        //Customer c2 = new Customer("b@.c","bca","2134567890","Mumbai");
        //Customer c3 = new Customer("c@a.c","cab","4565677890","Banglore");
        //insertCustomer(c1);
       // insertCustomer(c2);
        //insertCustomer(c3);
    }
    public static void insertCustomer(Customer customer) {
    	Session session = sf.openSession();
    	Transaction ts = session.beginTransaction();
    	session.save(customer);
    	ts.commit();
    	session.close();
    }
    public static void insertProduct(Product product) {
    	Session session = sf.openSession();
    	Transaction ts = session.beginTransaction();
    	session.save(product);
    	ts.commit();
    	session.close();
    }
    public static List<Customer> getCustomersByCity(String city) {
    	Session session = sf.openSession();
    	Transaction ts = session.beginTransaction();
    	Query query = session.createQuery("from Customer where city = : city");
    	query.setParameter("city", city);
    	List<Customer> customers = query.list();
    	ts.commit();
    	session.close();
		return customers;
    	
    }
    public static void updateProduct(Product product) {
    	Session session = sf.openSession();
    	try {
    		Transaction ts = session.beginTransaction();
    		session.update(product);
    		ts.commit();
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	finally {
    		session.close();
    	}
    		System.out.println("Product updated");
    	}
    public static void deleteProduct(Product product) {
    	Session session = sf.openSession();
    	try {
    		Transaction ts = session.beginTransaction();
    		session.delete(product);
    		ts.commit();
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	finally {
    		session.close();
    	}
    	System.out.println("product deleted");
    }
    public static Product getProductById(int id) {
    	Session session = sf.openSession();
    	Product product = session.get(Product.class,id);
    	session.close();
		return product;
    	
    }
    public static List<Product> getProducts() {
    	Session session = sf.openSession();
    	List<Product> products = session.createQuery("from Product").list();
    			session.close();
		return products;
    	
    }
}
