package com.frog.common.Result;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

public class ApiResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int c;

	private String m;

	private String r;
	
	public ApiResult() {
		this.c = Code.Success.getValue();
		this.m = Msg.SUCCESS;
	}

	public ApiResult(Code code, String msg) {
		this.c = code.getValue();
		this.m = msg;
	}

	public ApiResult(int c) {
		this.c = c;
	}

	public ApiResult(int c, String m) {
		this.c = c;
		this.m = m;
	}

	public int getC() {
		return c;
	}

	public void setCode(int c) {
		this.c = c;
	}

	public void setMessage(String m) {
		this.m = m;
	}

	public String getM() {
		return m;
	}

	public String getR() {
		return r;
	}

	public void setResult(Object r) {
		this.r = JSONObject.toJSONString(r);
	}

}
