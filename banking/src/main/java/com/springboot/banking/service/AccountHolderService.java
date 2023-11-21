package com.springboot.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.banking.model.AccountHolder;
import com.springboot.banking.repository.AccountHolderRepository;

@Service
public class AccountHolderService {
	@Autowired
	private AccountHolderRepository accountHolderRepository;
	public AccountHolder postAccountHolder(AccountHolder accountHolder) {
		return accountHolderRepository.save(accountHolder);
	}

}
