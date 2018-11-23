package com.frog.service;

import java.util.Date;
import java.util.List;

import com.frog.model.UserChipInfo;

public interface UserChipInfoService extends BaseService<UserChipInfo>{
	public int insertUserChipInfo(UserChipInfo userChipInfo);
	public List<UserChipInfo> selectUserChipInfoByUser(Integer user_id);
	public int selectCountByDate(Integer user_id,String  add_time);
	public int selectCountByDateOnePerson(Integer user_id,String  add_time,Integer ano_user_id);
}
