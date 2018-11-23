package com.frog.service;

import java.util.List;

import com.frog.model.SysMessage;

public interface SysMessageService extends BaseService<SysMessage>{
	public List<SysMessage> selectSysMessage();
	
	public int insertMessage(SysMessage sysMessage);
	
	public List<SysMessage> selectSysMessageByUser(Integer user_id);
	public int updateAddressType(SysMessage sysMessage);
}
