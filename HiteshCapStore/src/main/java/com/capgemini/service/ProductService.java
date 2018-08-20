package com.capgemini.service;

import org.springframework.stereotype.Service;

import com.capgemini.entities.Product;

@Service
public interface ProductService {

	public Product addProduct(Product product);
	
}
