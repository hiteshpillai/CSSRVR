package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Customer;
import com.capgemini.service.CostumerService;

@RestController
public class CustomerController {

	@Autowired
	private CostumerService cService;

	@RequestMapping(value = "srvCustSignUp", method = RequestMethod.POST)
	public Customer srvCustSignUp(@RequestBody Customer customer) {
		cService.customerSignUp(customer);
		return customer;
	}
}
