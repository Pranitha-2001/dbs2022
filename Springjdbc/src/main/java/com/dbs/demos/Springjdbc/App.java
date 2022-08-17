package com.dbs.demos.Springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dbs.demos.Springjdbc.database.ProductDB;
import com.dbs.demos.Springjdbc.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context = new AnnotationConfigApplicationContext(DBConfig.class);
        ProductDB productDB = context.getBean(ProductDB.class);
        System.out.println(productDB.getJdbcTemplate());
        System.out.println(productDB.getFruits());
        Product product = new Product();
        product.setProdid(5);
        product.setName("Red Pen");
        product.setPrice(20);
        System.out.println(productDB.insertProduct(product));
       // System.out.println(productDB.getProducts());
        //System.out.println(productDB.getProductById(1));
       // System.out.println(productDB.deleteProduct(3));
        
        product.setName("Blue Pen");
        product.setPrice(50);
        System.out.println(productDB.updateProduct(product));
        
    }
}
