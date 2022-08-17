package com.dbs.demos.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbs.demos.SpringCore.entity.Product;

public class AppAnno {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-anno.xml");
		System.out.println("spring loaded!");
		Product product = context.getBean(Product.class);
		System.out.println(product);
	}

}
