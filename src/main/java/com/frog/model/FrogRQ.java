package com.frog.model;

import java.io.Serializable;
import java.util.Date;

public class FrogRQ implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String qr_code_id;
	
	private String qr_code_address;
	
	private Double qr_longitude;
	
	private Double qr_latitude;
	
	private Date add_time;
	
	private Boolean del;

	

	public String getQr_code_id() {
		return qr_code_id;
	}

	public void setQr_code_id(String qr_code_id) {
		this.qr_code_id = qr_code_id;
	}

	public String getQr_code_address() {
		return qr_code_address;
	}

	public void setQr_code_address(String qr_code_address) {
		this.qr_code_address = qr_code_address;
	}

	public Double getQr_longitude() {
		return qr_longitude;
	}

	public void setQr_longitude(Double qr_longitude) {
		this.qr_longitude = qr_longitude;
	}

	public Double getQr_latitude() {
		return qr_latitude;
	}

	public void setQr_latitude(Double qr_latitude) {
		this.qr_latitude = qr_latitude;
	}

	public Date getAdd_time() {
		return add_time;
	}

	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}

	public Boolean getDel() {
		return del;
	}

	public void setDel(Boolean del) {
		this.del = del;
	}
	
	

}
