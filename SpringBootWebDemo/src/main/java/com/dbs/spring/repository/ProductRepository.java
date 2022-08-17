package com.dbs.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbs.spring.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {


	

}
