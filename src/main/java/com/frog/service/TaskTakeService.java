package com.frog.service;

import java.util.List;

import com.frog.model.FrogTake;

public interface TaskTakeService {

	public int save(Integer user_id, Integer task_id, String task_info, String address, String task_title,Double QR_longitude,Double QR_latitude,Double task_price,Double hea_price,Double total_price,Integer type,Integer last_taskid,String codeid,Double distance);

	// 根据任务状态查找任务数量
	public int takeTaskCount(Integer user_id, Integer status);

	FrogTake getTakeInfo(Integer take_id);
	
	List<FrogTake> getAllTakes(Integer user_id,short status,Integer page);
}
