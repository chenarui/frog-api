package com.frog.service;

import java.util.List;

import com.frog.model.RankBean;
import com.frog.model.TakeHis;

public interface StatisticsService {
	Integer getTaskNumThisWeek(Integer user_id);
	Double getThisWeekDistance(Integer user_id);
	Double getThisWeekWaCoins(Integer user_id);
	Integer getThisWeekOrder(Integer user_id);
	List<RankBean> getOrderRankBeans();
	List<TakeHis> getAllTakeHiss(Integer user_id,Integer page, Integer status);
}
