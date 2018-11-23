package com.frog.model;

import java.io.Serializable;
import java.util.Date;

public class FrogActivityAward implements Serializable{
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
	private Integer activity_id;
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
	public Integer getAwardnum() {
		return awardnum;
	}
	public void setAwardnum(Integer awardnum) {
		this.awardnum = awardnum;
	}
	public Integer getAwardsurplus() {
		return awardsurplus;
	}
	public void setAwardsurplus(Integer awardsurplus) {
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
	public Integer getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(Integer activity_id) {
		this.activity_id = activity_id;
	}
}
