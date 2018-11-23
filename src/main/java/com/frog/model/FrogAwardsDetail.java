package com.frog.model;

import java.io.Serializable;

public class FrogAwardsDetail implements Serializable{
	private int id;
	private int user_id;
	private String address;
	private int type;
	private String name;
	private String phone;
	private String award_info;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAward_info() {
		return award_info;
	}
	public void setAward_info(String award_info) {
		this.award_info = award_info;
	}
	
}
