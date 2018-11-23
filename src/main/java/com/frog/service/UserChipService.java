package com.frog.service;


import com.frog.model.UserChip;

public interface UserChipService extends BaseService<UserChip>{
	
	public Integer insert(UserChip userChip);
	
	public Integer updateChip(UserChip userChip);
	
	public UserChip selectUserChipByUser(Integer user_id);
	
}
