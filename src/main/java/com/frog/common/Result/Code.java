package com.frog.common.Result;

/**
 * 返回code定义类，通用返回异常定义
 * @author WangCL
 *
 */
public enum Code {

	/**
	 * 接口返回常量CODE,1:请求成功  100:会话超时需要重新登录 101:缺少参数值 102:系统异常 103:签名错误
	 */
	Success(1), NoSession(100),MissParam(101), Exception(102),SignError(103),CODE_COMMON_FAILED(403),NoAuth(300);

	private int value;

	private Code(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
