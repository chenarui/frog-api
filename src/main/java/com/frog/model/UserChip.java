package com.frog.model;

import java.io.Serializable;
import java.util.Date;

public class UserChip implements Serializable{
	
	private int id;
	
	private Integer user_id;
	
	private int chip_one;
	
	private int chip_two;
	
	private int chip_thr;
	
	private int chip_for;
	
	private int chip_fiv;
	
	private int chip_compose;
	
	public int getChip_compose() {
		return chip_compose;
	}

	public void setChip_compose(int chip_compose) {
		this.chip_compose = chip_compose;
	}

	private Date update_time;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public int getChip_one() {
		return chip_one;
	}

	public void setChip_one(int chip_one) {
		this.chip_one = chip_one;
	}

	public int getChip_two() {
		return chip_two;
	}

	public void setChip_two(int chip_two) {
		this.chip_two = chip_two;
	}

	public int getChip_thr() {
		return chip_thr;
	}

	public void setChip_thr(int chip_thr) {
		this.chip_thr = chip_thr;
	}

	public int getChip_for() {
		return chip_for;
	}

	public void setChip_for(int chip_for) {
		this.chip_for = chip_for;
	}

	public int getChip_fiv() {
		return chip_fiv;
	}

	public void setChip_fiv(int chip_fiv) {
		this.chip_fiv = chip_fiv;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	
}
