package com.frog.service;

import java.util.List;

import com.frog.model.TaskAward;

public interface TaskAwardService {
	List<TaskAward> getAllTaskAward(Integer page);
	TaskAward getTaskAwardById(Integer id);
	void deleteTaskAward(Integer id);
	void upDateTaskAward(TaskAward award);
	List<TaskAward> getAllActivityAwardsByActivityId(Integer activityid);
}
