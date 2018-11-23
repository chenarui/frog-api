package com.frog.service;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {
	
	/**
	 * 列表
	 * page和 pageSize不为空，分页查询
	 * @author wangcl
	 * @param params
	 * @return
	 */
	List<T> list(Integer page,Integer pageSize,Map<String, Object> params);
	
	//分页时合计查询
	long count(Map<String, Object> params);

	/**
	 * 通过id查找实体
	 * 
	 * 
	 * @author wangcl
	 * @param id
	 * @return
	 */
	T viewById(int id);

	/**
	 * 通过id删除实体
	 * 
	 * @author wangcl
	 * @param id
	 * @return
	 */
	boolean delete(int id);

	/**
	 * 保存实体
	 * 
	 * @author wangcl
	 * @param t
	 * @return
	 */
	T save(T t);

	/**
	 * 更新实体
	 * 
	 * @author wangcl
	 * @param t
	 * @return
	 */
	boolean update(T t);
	
	//根据文件id取文件url
	String getFilePath(Integer fileid);

}
