package com.frog.common.push;


import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;

public class JPushUtils {
	
	//极光推送
	public final static String JIGUANG_USER_SECRET = "dc12276a8f336e2edb4777d5";
	public final static String JIGUANG_USER_KEY = "2b5b8f7eb8a6e560e4194629";
	
	public final static String JIGUANG_DRIVER_SECRET = "5dd230e09f9cf87f8ea7f722";
	public final static String JIGUANG_DRIVER_KEY = "5b8f2f5981bb937752097eae";
	
	public final static int USER_CLIENT = 1;
	
	public final static int DRIVER_CLIENT = 2;

	// 全部推送
	public static void pushObjectAndroid(String msg_content,int type) {
//		String jiguang_secret = "";
//		String jiguang_key = "";
//		if(type == USER_CLIENT){
//			jiguang_secret = JIGUANG_USER_SECRET;
//			jiguang_secret = JIGUANG_USER_KEY;
//		}else if(type == DRIVER_CLIENT){
//			jiguang_secret = JIGUANG_DRIVER_SECRET;
//			jiguang_secret = JIGUANG_DRIVER_KEY;
//		}

		JPushClient jpushClient = new JPushClient(JIGUANG_USER_SECRET, JIGUANG_USER_KEY, null,
				ClientConfig.getInstance());
		Message message = Message.content(msg_content);
//		PushPayload payload = PushPayload.newBuilder().setPlatform(Platform.android()).setAudience(Audience.all()).setMessage(message).build();
		PushPayload payload = PushPayload.alertAll(msg_content);
		try {
			PushResult result = jpushClient.sendPush(payload);
			System.out.println("Got result -" + result);
		} catch (APIConnectionException e) {
			// Connection error, should retry later
			e.printStackTrace();
			return;

		} catch (APIRequestException e) {
			// Should review the error, and fix the request
			e.printStackTrace();
			return;
		}
	}

	// 根据别名推送
	public static void pushToAndroidByAlias(String msg_content, String alias,int type) {
		String jiguang_secret = "";
		String jiguang_key = "";
		if(type == USER_CLIENT){
			jiguang_secret = JIGUANG_USER_SECRET;
			jiguang_secret = JIGUANG_USER_KEY;
		}else if(type == DRIVER_CLIENT){
			jiguang_secret = JIGUANG_DRIVER_SECRET;
			jiguang_secret = JIGUANG_DRIVER_KEY;
		}

		JPushClient jpushClient = new JPushClient(jiguang_secret, jiguang_key, null,
				ClientConfig.getInstance());
		Message message = Message.content(msg_content);
		PushPayload payload = PushPayload.newBuilder().setPlatform(Platform.android())
				.setAudience(Audience.alias(alias)).setMessage(message).build();
		try {
			PushResult result = jpushClient.sendPush(payload);
			System.out.println("Got result -" + result);

		} catch (APIConnectionException e) {
			// Connection error, should retry later
			e.printStackTrace();
			return;

		} catch (APIRequestException e) {
			// Should review the error, and fix the request
			e.printStackTrace();
			return;
		}
	}

	// 根据ID推送
	public static void pushToAndroidById(String msg_content, String registration_id,int type) {
		String jiguang_secret = "";
		String jiguang_key = "";
		if(type == USER_CLIENT){
			jiguang_secret = JIGUANG_USER_SECRET;
			jiguang_key = JIGUANG_USER_KEY;
		}else if(type == DRIVER_CLIENT){
			jiguang_secret = JIGUANG_DRIVER_SECRET;
			jiguang_key = JIGUANG_DRIVER_KEY;
		}

		JPushClient jpushClient = new JPushClient(jiguang_secret, jiguang_key, null,
				ClientConfig.getInstance());
		Message message = Message.content(msg_content);
		PushPayload payload = PushPayload.newBuilder().setPlatform(Platform.android())
				.setAudience(Audience.registrationId(registration_id)).setMessage(message).build();
		try {
			PushResult result = jpushClient.sendPush(payload);
			System.out.println("Got result -" + result);

		} catch (APIConnectionException e) {
			// Connection error, should retry later
			e.printStackTrace();
			return;

		} catch (APIRequestException e) {
			// Should review the error, and fix the request
			e.printStackTrace();
			return;
		}
	}

	/** Demo **/
	/*
	 * AndroidPushData data = new AndroidPushData(); data.setT("3");
	 * data.setM("您的 " + name + " 订单由于错过上门时间未被接单已经取消"); data.setD("orderid:" +
	 * orderaunt.getOrderid()); JPushUtils.pushToAndroidById(new
	 * Gson().toJson(data), auntPush.getPushKey(),
	 * Constant.JIGUANG_PUSH_USER_SECRET, Constant.JIGUANG_PUSH_USER_KEY);
	 */
		public static void main(String[] args){
			System.out.println("start push");
			pushObjectAndroid("hello", 1);
		}
}
