package com.dbs.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dbs.spring.entity.Product;
import com.dbs.spring.repository.ProductRepository;

@SpringBootApplication
public class SpringBootWebDemoApplication {
	@Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebDemoApplication.class, args);
		
	}

	
	@Bean
	public void addProduct() {
		Product p1 = new Product();
		p1.setPid(1);
		p1.setName("Laptop");
		p1.setPrice(50000);
		Product p2 = new Product();
		p2.setPid(2);
		p2.setName("Mouse");
		p2.setPrice(80000);
			productRepository.save(p1);
			productRepository.save(p2);
			
		
	}


	
}
