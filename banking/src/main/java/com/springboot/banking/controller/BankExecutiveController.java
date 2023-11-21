package com.springboot.banking.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enums.Role;
import com.springboot.banking.model.BankExecutive;
import com.springboot.banking.model.User;
import com.springboot.banking.service.BankExecutiveService;
import com.springboot.banking.service.UserService;

@RestController
@RequestMapping("/bankexecutive")
public class BankExecutiveController {
	@Autowired
	private BankExecutiveService bankExecutiveService;
	@Autowired
	private UserService userService;
	@PostMapping("/post")
	public BankExecutive postbankExecutive(@RequestBody BankExecutive bankExecutive) {
		
		User user=bankExecutive.getUser();
		String password=user.getPassword();
		
		user.setRole(Role.EXECUTIVE);
		userService.save(user);
		
		bankExecutive.setUser(user);
		return bankExecutiveService.postBankExecutive(bankExecutive);
	}

}
