package com.frog.service;

import java.util.List;

import com.frog.model.FrogActivityUser;
import com.frog.model.UserInfo;

public interface FrogActivityUserService {
	Integer getAllUserCountByActivity(Integer activityid);
	List<UserInfo> getAllUserByActivity(Integer activityid);
	FrogActivityUser getFrogActivityUser(Integer userId,Integer activityId);
	void addFrogActivityUser(FrogActivityUser user);
	void updateUserState(Integer state,Integer userid,Integer activityid);
	FrogActivityUser getFrogActivityByUser(Integer userId);
}
