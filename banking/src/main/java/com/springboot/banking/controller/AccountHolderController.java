package com.springboot.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.banking.model.AccountHolder;
import com.springboot.banking.service.AccountHolderService;

@RestController
@RequestMapping("/accountholder")
public class AccountHolderController {
	@Autowired
	private AccountHolderService accountHolderService;
	@PostMapping("/post")
	public  AccountHolder postAccountHolder(@RequestBody AccountHolder accountHolder) {
		accountHolder = accountHolderService.postAccountHolder(accountHolder);
		return accountHolder;
	}

}
