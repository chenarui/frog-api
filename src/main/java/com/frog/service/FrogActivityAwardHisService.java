package com.frog.service;

import java.util.List;

import com.frog.model.FrogActivityAwardHis;

public interface FrogActivityAwardHisService {
	public void updateFAAHS(FrogActivityAwardHis his);
	public int insertFAAHS(FrogActivityAwardHis his);
	List<FrogActivityAwardHis> getFAAHSByUseridAndState(Integer user_id,String state);
}
