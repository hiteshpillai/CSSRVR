package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.entities.Customer;
import com.capgemini.repository.CustomerRepo;

public class CustomerServiceImpl implements CostumerService{

	@Autowired
	private CustomerRepo repo;
	
	@Override
	public Customer customerSignUp(Customer customer) {
		return repo.save(customer);
	}

	public CustomerRepo getRepo() {
		return repo;
	}

	public void setRepo(CustomerRepo repo) {
		this.repo = repo;
	}
	
	
	
}
