package com.frog.service;

import java.util.List;

import com.frog.model.ExchangeInfo;

public interface ExchangeInfoService extends BaseService<ExchangeInfo>{
	public List<ExchangeInfo> selectExchangeInfoUserID(Integer user_id);
	
	public Integer insertExchangeInfo(ExchangeInfo exchangeInfo); 
}
