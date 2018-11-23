package com.frog.service;

import java.math.BigDecimal;

import com.frog.model.FrogTaskBalance;

public interface TaskBalanceService {
	public int insertBalance(int user_id, BigDecimal balance);

	public int updateBalance(BigDecimal balance);
	
	public FrogTaskBalance selectBalanceByUserId(Integer user_id);
}
