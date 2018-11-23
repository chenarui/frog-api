package com.frog.service;

import java.util.HashMap;

public interface PushService {
	void sendAndroidBrocast(String ticker,String title,String text,boolean isDebug,HashMap<String,String> extraData);
	void sendIOSBrocast(String alert);
}
