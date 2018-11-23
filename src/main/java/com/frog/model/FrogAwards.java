package com.frog.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FrogAwards implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer awards_id;

	private Integer user_id;
   
	private String title;
   
	private String message;
   
	private Double awards;
   
	private Date add_time;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Double getAwards() {
		return awards;
	}

	public void setAwards(Double awards) {
		this.awards = awards;
	}

	public Date getAdd_time() {
		return add_time;
	}

	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}

	public Integer getAwards_id() {
		return awards_id;
	}

	public void setAwards_id(Integer awards_id) {
		this.awards_id = awards_id;
	}


   
   
}
