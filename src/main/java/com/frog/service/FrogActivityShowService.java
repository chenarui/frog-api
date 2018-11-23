package com.frog.service;

import com.frog.model.FrogActivityShow;

public interface FrogActivityShowService {
	FrogActivityShow selectUserShowed(Integer user_id,Integer activityid);
	void insertFrogActivityShow(FrogActivityShow show);
}
