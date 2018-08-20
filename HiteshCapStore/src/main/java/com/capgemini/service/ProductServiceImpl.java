package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.entities.Product;
import com.capgemini.repository.ProductRepo;

public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private ProductRepo repo;

	@Override
	public Product addProduct(Product product) {
		return repo.save(product);
	}
	
	
	
}
