package com.frog.service;

import java.util.List;

import com.frog.common.Result.ApiResult;
import com.frog.model.FrogTake;
import com.frog.model.FrogTask;

public interface TaskService extends BaseService<FrogTask> {
	
  public ApiResult getTask(String qr_code_id,Integer user_id,Double start_longitude,Double start_latitude,Integer type)throws Exception;
  
  public ApiResult allTaskInfo();
  
  public List<FrogTake> myTask(Integer user_id,Integer page,Integer type);
  
  
  public int operateTakeTask(Integer take_id,Integer type);
  
  public FrogTake selectTakeByTakeId(Integer take_id);
  
  public ApiResult qrCompleteTask(Integer footStep,Integer user_id,Integer take_id,Integer task_id,String qr_code_id,String login_type,Double complete_longitude,Double complete_latitude);

  public FrogTask getTask(Integer task_id);
  
  public int addTask(String task_pic_id,Double qr_longitude,Double qr_latitude,Short task_type,String task_title,String task_info,String task_address,String thingAward,String durtion);
  
  public int deleteTask(Integer task_id,Integer del);
  
  public int updateTask(FrogTask task);
  
  public List<FrogTask> getAllTasks(Integer page);
  
  public List<FrogTask> allTask();
}
