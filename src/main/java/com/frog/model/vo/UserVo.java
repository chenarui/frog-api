package com.frog.model.vo;

import java.io.Serializable;

public class UserVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer driver_id;

	private Integer avatar_url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(Integer driver_id) {
		this.driver_id = driver_id;
	}

	public Integer getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(Integer avatar_url) {
		this.avatar_url = avatar_url;
	}

}
