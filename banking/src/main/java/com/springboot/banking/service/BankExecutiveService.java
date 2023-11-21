package com.springboot.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.banking.model.BankExecutive;
import com.springboot.banking.repository.BankExecutiveRepository;

@Service
public class BankExecutiveService {
	@Autowired
	private BankExecutiveRepository bankExecutiveRepository;
	public BankExecutive postBankExecutive(BankExecutive bankExecutive) {
		return bankExecutiveRepository.save(bankExecutive);
	}

}
