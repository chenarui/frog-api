package com.frog.service;

import com.frog.model.FrogAwardsDetail;

public interface FrogAwardsDetailService {
	
	public int insertAwardDetail(FrogAwardsDetail frogAwardsDetail);
	
	public FrogAwardsDetail selectAwardDetail(Integer user_id);
	
	public int updateDetail(FrogAwardsDetail frogAwardsDetail);
}
