package com.springboot.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.banking.model.Account;
import com.springboot.banking.service.AccountService;
import com.springboot.financialplanning.dto.HrDto;
import com.springboot.financialplanning.exception.InvalidIdException;
import com.springboot.financialplanning.model.Hr;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService accountService;
	@PostMapping("/post")
	public Account postAccount(@RequestBody Account account) {
		account=accountService.postAccount(account);
		return account;
	}
	
	@PutMapping("/update/{acid}") 
	public ResponseEntity<?> updateAccount(@PathVariable("acid") int acid,
							@RequestBody HrDto newHr) {
		try {
			//validate id
			Hr oldHr = hrService.getByHrId(hid);
			if(newHr.getName() != null)
				oldHr.setName(newHr.getName());
			if(newHr.getEmail() != null) 
				oldHr.setEmail(newHr.getEmail()); 
			if(newHr.getPhoneNumber() != null) 
				oldHr.setPhoneNumber(newHr.getPhoneNumber()); 
			 
			oldHr = hrService.insert(oldHr); 
			return ResponseEntity.ok().body(oldHr);

		} catch (InvalidIdException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}
