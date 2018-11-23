package com.frog.model.vo;

import java.io.Serializable;

public class frogLuckyDraw implements Serializable{

	private Integer id;
	private String name;
	private double prob;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getProb() {
		return prob;
	}
	public void setProb(double prob) {
		this.prob = prob;
	}
	
}
