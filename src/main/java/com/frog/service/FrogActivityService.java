package com.frog.service;

import com.frog.model.FrogActivityBean;

public interface FrogActivityService{
	FrogActivityBean getNowFrogActivity();
	FrogActivityBean getFrogActivityById(Integer id);
}
