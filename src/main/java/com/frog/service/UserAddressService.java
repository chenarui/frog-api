package com.frog.service;

import java.util.Date;
import java.util.List;

import com.frog.model.UserAddress;

public interface UserAddressService extends BaseService<UserAddress>{
	public int insertAddress(Integer user_id,String name,String phone,String address,Date create_date);
	
	public List<UserAddress> selectAddressfromUser(Integer user_id);
	
}
