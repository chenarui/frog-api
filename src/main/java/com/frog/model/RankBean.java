package com.frog.model;

import java.io.Serializable;

public class RankBean implements Serializable{
	private String name;
	private int ordernum;
	private int totaltasknum;
	private String pic;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(int ordernum) {
		this.ordernum = ordernum;
	}
	public int getTotaltasknum() {
		return totaltasknum;
	}
	public void setTotaltasknum(int totaltasknum) {
		this.totaltasknum = totaltasknum;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
}
