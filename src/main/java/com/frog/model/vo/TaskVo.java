package com.frog.model.vo;

import java.io.Serializable;
import java.util.List;

public class TaskVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String taskInfo;

	private String task_pic_url;
	// 随机抽取的概率
	private Integer probability;

//	public TaskVo(Integer id, String taskInfo, String task_pic_url, Integer probability) {
//		this.id = id;
//		this.probability = probability;
//		this.task_pic_url = task_pic_url;
//		this.taskInfo = taskInfo;
//	}
	List T;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTaskInfo() {
		return taskInfo;
	}

	public void setTaskInfo(String taskInfo) {
		this.taskInfo = taskInfo;
	}

	public String getTask_pic_url() {
		return task_pic_url;
	}

	public void setTask_pic_url(String task_pic_url) {
		this.task_pic_url = task_pic_url;
	}

	public Integer getProbability() {
		return probability;
	}

	public void setProbability(Integer probability) {
		this.probability = probability;
	}

	public List getT() {
		return T;
	}

	public void setT(List t) {
		T = t;
	}




}
