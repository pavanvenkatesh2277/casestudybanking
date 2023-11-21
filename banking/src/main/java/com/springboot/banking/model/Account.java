package com.springboot.banking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String type;
	private double rateofintrest;
	private String balance;
	private double accountcol;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRateofintrest() {
		return rateofintrest;
	}

	public void setRateofintrest(double rateofintrest) {
		this.rateofintrest = rateofintrest;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public double getAccountcol() {
		return accountcol;
	}

	public void setAccountcol(double accountcol) {
		this.accountcol = accountcol;
	}

	

	
	
	

}
