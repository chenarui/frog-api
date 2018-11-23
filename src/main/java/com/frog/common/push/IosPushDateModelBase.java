package com.frog.common.push;

/**
 * 苹果原生推送信息扩展Model
 * 
 * @author guok
 * @version 2017-01-23
 *
 */
public class IosPushDateModelBase {
//	private IosPushDataBase aps;
	private int t;
	private String d;
	
	private String m;
	
	private Object aps;
	
	private String ok;
	
	public Object getAps() {
		return aps;
	}

	public void setAps(Object aps) {
		this.aps = aps;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
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

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}

}
