package com.frog.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class UserInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer user_id;
	
	private Integer invite_id;
	
	private String open_id;

	public Integer getInvite_id() {
		return invite_id;
	}

	public void setInvite_id(Integer invite_id) {
		this.invite_id = invite_id;
	}

	private String pic_url;

	private String nick_name;

	private String union_id;

	private String phone;

	private String sex;

	private Date add_time;

	private Date update_time;

	private String pasword;

	private BigDecimal wallet;

	private BigDecimal balance;
	
	private UserChip userChip;
	
	private int first_login;
	
	public int getFirst_login() {
		return first_login;
	}

	public void setFirst_login(int first_login) {
		this.first_login = first_login;
	}

	public BigDecimal getTotal_balance() {
		return total_balance;
	}

	public void setTotal_balance(BigDecimal total_balance) {
		this.total_balance = total_balance;
	}

	private BigDecimal total_balance;
	
	private String next_qr_code;
	// 非数据库字段
	private Double longitude;
	private Double latitude;
	private Short task_type;
	private Integer task_id;
	private Integer take_id;
	// 0 暂无进行任务 1 进行任务
	private Integer tasking;
	private String address;

	private UserInfo userInfoTask;

	public UserInfo getUserInfoTask() {
		return userInfoTask;
	}

	public UserChip getUserChip() {
		return userChip;
	}

	public void setUserChip(UserChip userChip) {
		this.userChip = userChip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setUserInfoTask(FrogTake frogTake, FrogTask frogTask) {
		this.longitude = frogTask.getLongitude();
		this.latitude = frogTask.getLatitude();
		this.task_type = frogTask.getTask_type();
		this.task_id = frogTask.getTask_id();
		this.take_id = frogTake.getTake_id();
		this.address = frogTask.getAddress();
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getOpen_id() {
		return open_id;
	}

	public void setOpen_id(String open_id) {
		this.open_id = open_id;
	}

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getUnion_id() {
		return union_id;
	}

	public void setUnion_id(String union_id) {
		this.union_id = union_id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getAdd_time() {
		return add_time;
	}

	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public BigDecimal getWallet() {
		return wallet;
	}

	public void setWallet(BigDecimal wallet) {
		this.wallet = wallet;
	}

	public String getNext_qr_code() {
		return next_qr_code;
	}

	public void setNext_qr_code(String next_qr_code) {
		this.next_qr_code = next_qr_code;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Short getTask_type() {
		return task_type;
	}

	public void setTask_type(Short task_type) {
		this.task_type = task_type;
	}

	public Integer getTask_id() {
		return task_id;
	}

	public void setTask_id(Integer task_id) {
		this.task_id = task_id;
	}

	public Integer getTake_id() {
		return take_id;
	}

	public void setTake_id(Integer take_id) {
		this.take_id = take_id;
	}

	public Integer getTasking() {
		return tasking;
	}

	public void setTasking(Integer tasking) {
		this.tasking = tasking;
	}

}