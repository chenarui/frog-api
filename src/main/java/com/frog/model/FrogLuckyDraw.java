package com.frog.model;

import java.io.Serializable;

public class FrogLuckyDraw implements Serializable{

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
	@Override
	public String toString() {
		return "FrogLuckyDraw [id=" + id + ", name=" + name + ", prob=" + prob + "]";
	}
	
	
}
