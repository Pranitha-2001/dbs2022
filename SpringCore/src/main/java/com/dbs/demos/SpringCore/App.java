package com.dbs.demos.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbs.demos.SpringCore.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("spring loaded");
        Product product = (Product) context.getBean("product1");
       System.out.println(product);
      //  Product product1 = context.getBean(Product.class);
       // System.out.println(product1);
       // product.setName("MAC");
      //  System.out.println(product.getName());
      //  System.out.println(product1.getName());
        
    }
}
