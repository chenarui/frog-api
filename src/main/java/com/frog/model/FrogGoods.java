package com.frog.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FrogGoods implements Serializable{

	private Integer good_id;
	
	private String good_name;
	
	private String path;
	
	private BigDecimal balance;
	
	private BigDecimal price;
	
	private Date add_time;
	
	private Boolean del;
	
	private Integer haveMore;
	
	private Date update_time;
	
	private String good_info;
	
	private String type;
	
	private Integer num;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getGood_id() {
		return good_id;
	}

	public void setGood_id(Integer good_id) {
		this.good_id = good_id;
	}

	public String getGood_name() {
		return good_name;
	}

	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
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

	public Integer getHaveMore() {
		return haveMore;
	}

	public void setHaveMore(Integer haveMore) {
		this.haveMore = haveMore;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getGood_info() {
		return good_info;
	}

	public void setGood_info(String good_info) {
		this.good_info = good_info;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
	
	
}
