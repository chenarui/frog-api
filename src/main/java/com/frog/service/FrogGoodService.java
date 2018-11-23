package com.frog.service;

import java.util.List;

import com.frog.model.FrogGoods;

public interface FrogGoodService extends BaseService<FrogGoods>{
	public FrogGoods selectGoodByGoodId(Integer good_id);
	public List<FrogGoods> selectGoods();
}
