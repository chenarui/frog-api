package com.frog.model;

import java.io.Serializable;
import java.util.Date;

public class FrogActivityUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int userid;
	private int state;
	private int noweventid;
	private Date addtime;
	private int activityid;
	private int eventstep;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getNoweventid() {
		return noweventid;
	}
	public void setNoweventid(int noweventid) {
		this.noweventid = noweventid;
	}
	public Date getTime() {
		return addtime;
	}
	public void setTime(Date time) {
		this.addtime = time;
	}
	public int getActivityid() {
		return activityid;
	}
	public void setActivityid(int activityid) {
		this.activityid = activityid;
	}
	public int getEventstep() {
		return eventstep;
	}
	public void setEventstep(int eventstep) {
		this.eventstep = eventstep;
	}
}
