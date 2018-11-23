package com.frog.service;

import java.util.List;

import com.frog.model.FrogActivityAward;

public interface FrogActivityAwardService {
	List<FrogActivityAward> getAllAwardsByActivity(Integer activityId);
	void updateAward(FrogActivityAward award);
}
