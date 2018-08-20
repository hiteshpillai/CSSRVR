package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Product;
import com.capgemini.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService pService;
	
	@RequestMapping(value="/srvProdAdd", method=RequestMethod.POST)
	public Product srvProdAdd(@RequestBody Product product) {
		pService.addProduct(product);
		return product;
	}
	
}
