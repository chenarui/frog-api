package com.frog.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.frog.common.Result.ApiResult;
import com.frog.model.FrogPlay;

public interface FrogPlayService {

	int saveFrogPlay(String playname,String diff,String theme,String ref,String additional,String wire,Integer price,String address,String pic,Integer status);

	int delFrogPlayById(Integer id);

	List<FrogPlay> getFrogPlay(FrogPlay frogplay);

	int updateFrogPlayById(FrogPlay frogplay);
	
	ApiResult getFrogPlayInfo(Integer id);
}
