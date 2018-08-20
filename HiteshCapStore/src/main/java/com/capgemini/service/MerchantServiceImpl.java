package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.entities.Merchant;
import com.capgemini.repository.MerchantRepo;

public class MerchantServiceImpl implements MerchantService{

	@Autowired
	private MerchantRepo repo;
	
	@Override
	public Merchant merchantSignUp(Merchant merchant) {		
		return repo.save(merchant);
	}

	public MerchantRepo getRepo() {
		return repo;
	}

	public void setRepo(MerchantRepo repo) {
		this.repo = repo;
	}
	
	

}
