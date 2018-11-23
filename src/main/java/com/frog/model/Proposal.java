package com.frog.model;

import java.io.Serializable;
import java.util.Date;

public class Proposal implements Serializable{
	private int user_id;
	private String message;
	private Date time;
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
