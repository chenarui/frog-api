package com.frog.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ExchangeInfo implements Serializable{
	private Integer id;
	
	private Integer user_id;
	
	private String good_name;
	
	private BigDecimal balance;
	
	private Date ex_time;
	
	private String order_id;

	private String good_image;
	
	
	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getGood_name() {
		return good_name;
	}

	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Date getEx_time() {
		return ex_time;
	}

	public void setEx_time(Date ex_time) {
		this.ex_time = ex_time;
	}

	public String getGood_image() {
		return good_image;
	}

	public void setGood_image(String good_image) {
		this.good_image = good_image;
	}
}
