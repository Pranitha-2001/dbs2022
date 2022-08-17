package com.dbs.spring.mvc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dbs.spring.entity.Product;
import com.dbs.spring.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productservice;
	
	@GetMapping("/products")
	public String getProducts(Map<String,List<Product>> map)
	{
		List<Product> products = productservice.getProducts();
		map.put("list", products);
		return "products";
	}
	@GetMapping("/add")
	public String addProduct() {
		System.out.println("get add product");
		return "addproduct";
		
	}
	@PostMapping("/add")
	public String insertProduct(Product product)
	{
		productservice.insertProduct(product);
		return "redirect:/products";
	}
	@GetMapping("/products/delete/{pid}")
	public String deleteProductById(@PathVariable int pid) {
		try {
			productservice.deleteProduct(pid);
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return "redirect:/products";
	}
}

	