package com.springboot.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.banking.model.BankExecutive;

public interface BankExecutiveRepository extends JpaRepository<BankExecutive, Integer> {

}
