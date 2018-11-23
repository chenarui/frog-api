package com.frog.model;

import java.io.Serializable;

public class FrogActivityEvent implements Serializable{
	private int id;
	private String eventname;
	private String des;
	private int completeawardid;
	private int activityid;
	private String diff;
	private String theme;
	private String event_pic;
	private String event_ref;
	private String additional;
	private Double event_price;
	private String address;
	private String event_wire;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEventname() {
		return eventname;
	}
	
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	
	public String getDes() {
		return des;
	}
	
	public void setDes(String des) {
		this.des = des;
	}
	
	public int getCompleteawardid() {
		return completeawardid;
	}
	
	public void setCompleteawardid(int completeawardid) {
		this.completeawardid = completeawardid;
	}

	public int getActivityid() {
		return activityid;
	}

	public void setActivityid(int activityid) {
		this.activityid = activityid;
	}

	

	public String getDiff() {
		return diff;
	}

	public void setDiff(String diff) {
		this.diff = diff;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getEvent_pic() {
		return event_pic;
	}

	public void setEvent_pic(String event_pic) {
		this.event_pic = event_pic;
	}

	public String getEvent_ref() {
		return event_ref;
	}

	public void setEvent_ref(String event_ref) {
		this.event_ref = event_ref;
	}

	public String getAdditional() {
		return additional;
	}

	public void setAdditional(String additional) {
		this.additional = additional;
	}

	public Double getEvent_price() {
		return event_price;
	}

	public void setEvent_price(Double event_price) {
		this.event_price = event_price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEvent_wire() {
		return event_wire;
	}

	public void setEvent_wire(String event_wire) {
		this.event_wire = event_wire;
	}
	
	
	
}
