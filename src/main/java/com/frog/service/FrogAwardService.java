package com.frog.service;

import java.util.List;

import com.frog.model.FrogAward;

public interface FrogAwardService {
	public List<FrogAward> selectFrogAwardByUser();
	
	public FrogAward selectByAwardId(Integer award_id);
}
