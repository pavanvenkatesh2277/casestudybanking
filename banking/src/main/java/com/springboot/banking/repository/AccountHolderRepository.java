package com.springboot.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.banking.model.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer> {

}
