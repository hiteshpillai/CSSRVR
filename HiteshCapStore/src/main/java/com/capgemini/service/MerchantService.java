package com.capgemini.service;

import org.springframework.stereotype.Service;

import com.capgemini.entities.Merchant;

@Service
public interface MerchantService {

	public Merchant merchantSignUp(Merchant merchant);
	
}
