package com.frog.model;

import java.io.Serializable;
import java.util.Date;

public class FrogTask implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer task_id;

	private String task_pic_id;
	

	private String task_info;

	private boolean del;
	
	private Date add_time;
	
	private Date modify_time;
	
	private Double latitude;
	
	private Double longitude;
	
	private Double balance;
	
	private String qr_code_url;
	
	private String qr_code_id;
	
	private String address;
	
	private String qr_address;
	
	private String task_title;
	
   private Double task_distance;
   
   private Short task_type;
   private String award;
   private String task_durtion;
   private Integer next_taskid;
   private Integer award_id;
   
   
   
	
	public Integer getTask_id() {
		return task_id;
	}

	public void setTask_id(Integer task_id) {
		this.task_id = task_id;
	}

	
	public String getTask_pic_id() {
		return task_pic_id;
	}

	public void setTask_pic_id(String task_pic_id) {
		this.task_pic_id = task_pic_id;
	}

	public String getTask_info() {
		return task_info;
	}

	public void setTask_info(String task_info) {
		this.task_info = task_info;
	}

	public boolean isDel() {
		return del;
	}

	public void setDel(boolean del) {
		this.del = del;
	}

	public Date getAdd_time() {
		return add_time;
	}

	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}

	public Date getModify_time() {
		return modify_time;
	}

	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getQr_code_url() {
		return qr_code_url;
	}

	public void setQr_code_url(String qr_code_url) {
		this.qr_code_url = qr_code_url;
	}

	public String getQr_code_id() {
		return qr_code_id;
	}

	public void setQr_code_id(String qr_code_id) {
		this.qr_code_id = qr_code_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQr_address() {
		return qr_address;
	}

	public void setQr_address(String qr_address) {
		this.qr_address = qr_address;
	}

	public String getTask_title() {
		return task_title;
	}

	public void setTask_title(String task_title) {
		this.task_title = task_title;
	}

	public Double getTask_distance() {
		return task_distance;
	}

	public void setTask_distance(Double task_distance) {
		this.task_distance = task_distance;
	}

	public Short getTask_type() {
		return task_type;
	}

	public void setTask_type(Short task_type) {
		this.task_type = task_type;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public String getTask_durtion() {
		return task_durtion;
	}

	public void setTask_durtion(String task_durtion) {
		this.task_durtion = task_durtion;
	}

	public Integer getNext_taskid() {
		return next_taskid;
	}

	public void setNext_taskid(Integer next_taskid) {
		this.next_taskid = next_taskid;
	}

	public Integer getAward_id() {
		return award_id;
	}

	public void setAward_id(Integer award_id) {
		this.award_id = award_id;
	}


	
}
