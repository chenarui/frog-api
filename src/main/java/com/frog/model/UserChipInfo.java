package com.frog.model;

import java.io.Serializable;
import java.util.Date;

public class UserChipInfo implements Serializable{
	private int id;
	
	private int user_id;
	
	public int getAno_user_id() {
		return ano_user_id;
	}

	public void setAno_user_id(int ano_user_id) {
		this.ano_user_id = ano_user_id;
	}

	private String message;
	
	private Date add_time;
	
	private int chip;
	
	private int ano_user_id;
	
	private int type;
	
	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getChip() {
		return chip;
	}

	public void setChip(int chip) {
		this.chip = chip;
	}

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getAdd_time() {
		return add_time;
	}

	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}
}
