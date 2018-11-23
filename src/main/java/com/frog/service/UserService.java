package com.frog.service;

import java.math.BigDecimal;
import java.util.List;


import com.frog.common.Result.ApiResult;
import com.frog.model.FrogAwards;
import com.frog.model.UserInfo;

public interface UserService extends BaseService<UserInfo> {

	public UserInfo selectUserInfoByPhone(String phone);

	public int login(UserInfo userInfo);

	public UserInfo getUserInfoByOpenId(String openId);
	
	public UserInfo getUserInfoByUnionId(String unionId);
	
	public int updateBalance(BigDecimal balance,Integer usre_id);

	public UserInfo selectUserByUserId(Integer user_id);
	
	public int buildPhone(String phone,Integer user_id);
	
	public UserInfo getUserInfo(Integer user_id);
	
	public String getCode(String phone)throws Exception;
	
	public List<FrogAwards> getMyWaCoinDesc(Integer user_id,Integer page);
	
	public ApiResult userLoginInfo(String phone,Integer type);
	
	public UserInfo getUserInfoByPhone(String phone);
	
	public List<FrogAwards> selectUserAwardsByDate(String add_time);
	
	public UserInfo selectUserInfoByInviteId(Integer invite_id);
	
	public int updateInviteID(Integer invite_id,Integer user_id);
	
	public int updateLoginType(Integer first_login,Integer user_id);
	
	public int updateUserNextQrCode(Integer user_id,String qrCode);
	
	public int updateUserNickName(String nickName,Integer user_id);
	public int updateUserPhone(String phone,Integer user_id);
}
