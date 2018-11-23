package com.frog.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class TaskAward implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String awardname;
	private String awardpic;
	private Integer awardnum;
	private Integer awardsurplus;
	private Date addtime;
	private Date endtime;
	private Integer probability;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAwardname() {
		return awardname;
	}
	public void setAwardname(String awardname) {
		this.awardname = awardname;
	}
	public String getAwardpic() {
		return awardpic;
	}
	public void setAwardpic(String awardpic) {
		this.awardpic = awardpic;
	}
	public int getAwardnum() {
		return awardnum;
	}
	public void setAwardnum(Integer awardnum) {
		this.awardnum = awardnum;
	}
	public Integer getAwardsurplus() {
		return awardsurplus;
	}
	public void setAwardsurplus(int awardsurplus) {
		this.awardsurplus = awardsurplus;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public Integer getProbability() {
		return probability;
	}
	public void setProbability(Integer probability) {
		this.probability = probability;
	}
}
