package com.dbs.demos.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dbs.demos.SpringCore.entity.Product;

@Configuration
@ComponentScan
public class AppConfig {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("spring loaded");
		Product product = context.getBean(Product.class);
		System.out.println(product);
		

	}

}
