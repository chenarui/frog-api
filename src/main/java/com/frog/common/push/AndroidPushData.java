package com.frog.common.push;

public class AndroidPushData {

	private String t;// 消息类型
	private String d;// 消息数据
	private String m;//消息内容
    private String info;//推送消息
    
    private String ok;//是否弹窗
	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}

}
