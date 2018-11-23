package com.frog.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class FrogActivityAwardHis implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer user_id;
	private Integer award_id;
	private Date get_time;
	private String award_name;
	private String award_pic;
	private String state;
	private Integer activity_id;
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
	public Integer getAward_id() {
		return award_id;
	}
	public void setAward_id(Integer award_id) {
		this.award_id = award_id;
	}
	public Date getGet_time() {
		return get_time;
	}
	public void setGet_time(Date get_time) {
		this.get_time = get_time;
	}
	public String getAward_name() {
		return award_name;
	}
	public void setAward_name(String award_name) {
		this.award_name = award_name;
	}
	public String getAward_pic() {
		return award_pic;
	}
	public void setAward_pic(String award_pic) {
		this.award_pic = award_pic;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(Integer activity_id) {
		this.activity_id = activity_id;
	}
}
