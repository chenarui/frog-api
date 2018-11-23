package com.frog.model;

import java.io.Serializable;
import java.util.Date;

public class FrogTake implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer take_id;

	private Integer task_id;

	private Integer user_id;

	private Short status;
	
	private Date add_time;
	
	private Date complete_time;
	
	private Date give_up_time;
	
	private Integer foot_step;
	
	private Double distance;
	
	private Date hand_task_time;
	
	private String task_name;
	
	private String task_info;
	
	private Double start_longitude;
	
	private Double start_latitude;
	
	private Double final_longitude;
	
	private Double final_latitude;
	
	private Double task_price;
	
	private Double hea_price;
	
	private Double total_price;
	private Integer last_taskid;
	private String qr_code_id;
	
	
	public Double getHea_price() {
		return hea_price;
	}

	public void setHea_price(Double hea_price) {
		this.hea_price = hea_price;
	}

	public Double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}

	private int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Double getTask_price() {
		return task_price;
	}

	public void setTask_price(Double task_price) {
		this.task_price = task_price;
	}

	public Integer getTake_id() {
		return take_id;
	}

	public void setTake_id(Integer take_id) {
		this.take_id = take_id;
	}

	public Integer getTask_id() {
		return task_id;
	}

	public void setTask_id(Integer task_id) {
		this.task_id = task_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Date getAdd_time() {
		return add_time;
	}

	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}

	public Date getComplete_time() {
		return complete_time;
	}

	public void setComplete_time(Date complete_time) {
		this.complete_time = complete_time;
	}

	public Date getGive_up_time() {
		return give_up_time;
	}

	public void setGive_up_time(Date give_up_time) {
		this.give_up_time = give_up_time;
	}

	public Integer getFoot_step() {
		return foot_step;
	}

	public void setFoot_step(Integer foot_step) {
		this.foot_step = foot_step;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Date getHand_task_time() {
		return hand_task_time;
	}

	public void setHand_task_time(Date hand_task_time) {
		this.hand_task_time = hand_task_time;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public String getTask_info() {
		return task_info;
	}

	public void setTask_info(String task_info) {
		this.task_info = task_info;
	}

	public Double getStart_longitude() {
		return start_longitude;
	}

	public void setStart_longitude(Double start_longitude) {
		this.start_longitude = start_longitude;
	}

	public Double getStart_latitude() {
		return start_latitude;
	}

	public void setStart_latitude(Double start_latitude) {
		this.start_latitude = start_latitude;
	}

	public Double getFinal_longitude() {
		return final_longitude;
	}

	public void setFinal_longitude(Double final_longitude) {
		this.final_longitude = final_longitude;
	}

	public Double getFinal_latitude() {
		return final_latitude;
	}

	public void setFinal_latitude(Double final_latitude) {
		this.final_latitude = final_latitude;
	}

	public Integer getLast_taskid() {
		return last_taskid;
	}

	public void setLast_taskid(Integer last_taskid) {
		this.last_taskid = last_taskid;
	}

	public String getQr_code_id() {
		return qr_code_id;
	}

	public void setQr_code_id(String qr_code_id) {
		this.qr_code_id = qr_code_id;
	}
}
