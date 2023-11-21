package com.springboot.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.banking.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findbyUsername(String username);

}
