package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Merchant;
import com.capgemini.service.MerchantService;

@RestController
public class MerchantController {

	@Autowired
	private MerchantService mService;
	
	@RequestMapping(value="/srvMerchSignUp", method=RequestMethod.POST)
	public Merchant srvMerchSignUp(@RequestBody Merchant merchant) {
		mService.merchantSignUp(merchant);
		return merchant;
	}
	
}
