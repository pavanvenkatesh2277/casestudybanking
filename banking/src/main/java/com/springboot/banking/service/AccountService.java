package com.springboot.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.banking.model.Account;
import com.springboot.banking.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	public Account postAccount(Account account) {
		return accountRepository.save(account);
	}

}
