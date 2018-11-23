package com.frog.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class FrogTaskBalance implements Serializable{

	private int id;
	private int user_id;
	private BigDecimal balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "FrogTaskBalance [id=" + id + ", user_id=" + user_id + ", balance=" + balance + "]";
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}
