package com.springboot.banking.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.springboot.banking.model.User;
import com.springboot.banking.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void save(User user) {
		userRepository.save(user);
		
	}
	

	
}