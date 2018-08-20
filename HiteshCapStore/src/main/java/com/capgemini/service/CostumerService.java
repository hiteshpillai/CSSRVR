package com.capgemini.service;

import org.springframework.stereotype.Service;

import com.capgemini.entities.Customer;

@Service("ICostumerService")
public interface CostumerService {

	public Customer customerSignUp(Customer customer);
}
