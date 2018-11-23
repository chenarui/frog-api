package com.frog.service;

import java.util.List;

import com.frog.model.SysConfig;

public interface SysConfigService {
	public List<SysConfig>selectSysConfByKey(String key);
	public int updateSysConf(SysConfig sysConfig);
}
