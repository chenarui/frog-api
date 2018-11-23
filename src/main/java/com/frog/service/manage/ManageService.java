package com.frog.service.manage;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.frog.common.Result.ApiResult;
import com.frog.model.FrogGoods;


public interface ManageService{
public ApiResult getAllGoods(String goodsName,Integer page);

public ApiResult delGoods(Integer id);

public ApiResult getGoodsInfo(Integer id);

public ApiResult updateGoods(FrogGoods frogGoods);

public ApiResult insertGoods(String good_name,String path,BigDecimal balance,BigDecimal price,String good_info,String type);

List<FrogGoods> getFrogGoods(String good_name);

ApiResult getGoodsByType(String type);

int updateGoodByNum(FrogGoods frogGoods);


ApiResult selectGoodByNum(FrogGoods frogGoods);
}
