package com.frog.common;

public class Constant {
	
	// 微信端请求接口的appid和appkey
	public static String WX_FROG_APPID = "walucky_frog_wx";
	public static String WX_FROG_APPKEY = "1f8bcb22b633c72adf3d1e8bcf9bc1d4";

	// 用户端IOS请求接口的appid和appkey
	public static String IOS_FROG_APPID = "walucky_frog_ios";
	public static String IOS_FROG_APPKEY = "9a1b69eded91766c4ec27856309889a4";
	
	// 用户端android请求接口的appid和appkey
		public static String ANDROID_FROG_APPID = "walucky_frog_android";
		public static String ANDROID_FROG_APPKEY = "9a1b69eded91766c4ec27856309889a4";
	
	public static int DAY_MAX_SMS_COUNT = 10;//一天一个手机号码允许获取验证码最大的次数
	
	//分页取得，每页的记录条数
	public static int PAGE_SIZE = 10;
	
	public static String SMS_ACCOUNT_SID = "8a216da85c09e9ba015c101a10fa0419";
	public static String SMS_ACCOUNT_TOKEN = "5f55c11fa1f54338811d6b0484f3e918";
	public static String SMS_APPID = "8a216da8635e621f0163901549d11983";
	//语音服务
	  //产品名称:云通信语音API产品,开发者无需替换
    static final String product = "Dyvmsapi";
    //产品域名,开发者无需替换
    static final String domain = "dyvmsapi.aliyuncs.com";
    // 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
    static final String accessKeyId = "LTAI7xtDijO4s5Ek";
    static final String accessKeySecret = "A227MjWmgBQVuwCr5sSa3IeYCBLUmY";
	
	public final static String  SMS_VCODE_ID = "230525";
	//审核成功
	public final static String SMS_SUS_MESSAGE_ID="248080";
	//审核失败
	public final static String SMS_FAIL_MESSAGE_ID="248087";
	
	public final static String  SMS_PASSWORD_ID = "203902";
	
	public final static String  baidu_ak = "KbBLmAUkVRWycZQIhpdMhbzGBxtEIj3b";
	
	public final static String IP_LIMIT_KEY_SUFFIX="_pz_ip_sms_count ";
	
	public final static String USER_LIMIT_KEY_SUFFIX="_pz_user_sms_count";
	
	public final static String USER_WEB_REDIS_CACHE_USER_ID="user_web_";
	
	public final static String USER_WEB_REDIS_CACHE_USER_NAME="user_web_";
	
	public final static String USER_WEB_REDIS_CACHE_PHONE="user_web_";
	
	public final static String PHONE_NUMBER="057128092186";
	
	public final static String SMS_FROG_LUCKY_CODE_MESSAGE_ID="251397";
	
	public final static String SMS_CODE_DATE="10";
//redis 过期时间	
	public final static long REDIS_OUT_CODE_DATE=600;
	
	public final static int USER_SCAN_COUNT=50000;
	
	public final static String USER_DAY_COUNT_KEY="count";
	//微信小程序
	public final static String AppID="wx999d353e35a440a6";
	public final static String AppSecret="a0cb65e01e75b19b7699a12280059d05";
	//微信小程序URL地址 appid secret js_code grant_type=authorization_code
	public final static String wxUrl="https://api.weixin.qq.com/sns/jscode2session";
	
	//微信获取accessToken https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code
	public final static String autho_url="https://api.weixin.qq.com/sns/oauth2/access_token";
	
	public final static double most_wa_coin=3;
	
	public final static double minute=3*1000*60;
	
	public final static String USERID_LIST="mlist";
	
	public final static String  qiniu_key="9PvoVcDWYGzSNfvl6nOxJoCAmkd2jY3mHWBfV2_O";
	
	public final static String  qiniu_seret="i5ewIFp_O82X0_pwLNXdnzIzyKZLfFUvjxXMXFCK";
	
	public final static String qiniu_scope="wuliu";
	//300步一蛙币
	public final static Integer FROG_UNIT=300;
	//健康币
	public final static Double FROG_HEA_COIN_1KM=7.0;
	//任务币
	public final static Double FROG_COIN_1KM_WALK=3.0;
	
	public final static Double FROG_COIN_1KM_RUN=2.0;
	
	public final static Double FROG_COIN_1KM_DRIVE=1.0;
	
	public final static Double OVER_LENGTH=50.0;
	//演唱会
//	public final static String vocal_concert;
//	public final static String VOCAL_PATH="http://192.168.0.104:8887/upload/ticket_award.png.jpg";
	public final static String VOCAL_PATH="http://47.97.186.182:8091/upload/ticket.jpg";
	   public static void main(String[] args) {
		   System.out.println(MD5Util.MD5Encode("walucky_frog_android", "UTF-8"));
	   }
	
}
