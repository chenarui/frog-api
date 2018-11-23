package com.frog.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.frog.model.FrogTask;
import com.qiniu.util.Auth;


/**
 * @author wangcl
 * 
 */
public class CommonUtils {

	/**
	 * 读取配置文件
	 * 
	 * 
	 */
	
	private static final String MAC_NAME = "HmacSHA1";
	private static final String ENCODING = "UTF-8";

	public static Properties properties = new Properties();

	static {
		try {
			String path = "config/config.properties";
			InputStream inStream = CommonUtils.class.getClassLoader().getResourceAsStream(path);
			if (inStream == null) {
				inStream = CommonUtils.class.getClassLoader().getResourceAsStream("/" + path);
			}
			properties.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//上传文件的目录
	public static String getLocationPath() {
		return properties.getProperty("uploadFilePath");
	}
	public static String getTicket(){
		return properties.getProperty("ticket");
	}
	//保存路径
	public static String getSavePath(String app_type, Integer type) {
		if ("1".equals(app_type)) {
			if (type == 1) {
				return properties.getProperty("PathUserLicense");
			} else if (type == 2) {
				return properties.getProperty("PathUserAvatar");
			} else if (type == 3) {
				return properties.getProperty("PathOrder");
			}else if (type==4) {//type==4为用户身份证正面
				 return properties.getProperty("PathUserFaceID");
			}else if (type==5) {//tyep ==5 是用户身份证背面
				return properties.getProperty("PathUserBackID");
			}else if (type==6) {//type==用户的营业执照
				return properties.getProperty("PathUserBusinessLicense");
			}
			
		} else if ("2".equals(app_type)) {
			if (type == 1) {
				return properties.getProperty("PathDriverID");
			} else if (type == 2) {
				return properties.getProperty("PathDriverLicense");
			} else if (type == 3) {//营业执照
				return properties.getProperty("PathDriverAvatar");
			} else if (type == 4){
				return properties.getProperty("PathDriverCar");
			}else if (type ==5) {
				return properties.getProperty("PathStationPic");
			}else if (type ==6){//司机身份证正面
				return properties.getProperty("PathDriverFaceID");
			}else if (type ==7){//司机身份证反面
				return properties.getProperty("PathDriverBackID");
			}
		}else if ("3".equals(app_type)) {
			if (type == 1) {
				return properties.getProperty("PathCompanyID");
			} else if (type == 2) {
				return properties.getProperty("PathCompanyLicense");
			}
		}
		return "";
	}
	
	// 苹果推送证书密码
	public static String getIosUserPushPath() {
		return properties.getProperty("ios_user_push_file_path");
	}

	// 苹果推送证书密码
	public static String getIosDriverPushPath() {
		return properties.getProperty("ios_driver_push_file_path");
	}

	// 容联云短信平台
	public static String getSMSBaseUrl() {
		return properties.getProperty("sms_base_url");
	}

	public static String getSMSServerPort() {
		return properties.getProperty("sms_server_port");
	}
	
	//上传文件的root url
	public static String getFileRootUrl() {
		return properties.getProperty("fileRootUrl");
	}

	/**
	 * 检查路径是否存在，不存在则创建路径
	 * 
	 * @param path
	 */
	public static void checkPath(String path) {
		String[] paths = null;
		if (path.contains("/")) {
			paths = path.split(File.separator);
		} else {
			paths = path.split(File.separator + File.separator);
		}
		if (paths == null || paths.length == 0) {
			return;
		}
		String pathdir = "";
		for (String string : paths) {
			pathdir = pathdir + string + File.separator;
			File file = new File(pathdir);
			if (!file.exists()) {
				file.mkdir();
			}
		}
	}

	/**
	 * 判断String是否为空
	 * 
	 */
	public static boolean isEmptyString(String value) {
		if (value == null || value.length() == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 只判断多个String是否为空(无论有没全角或半角的空格) 若非空则返回true,否则返回false
	 * 
	 * @param str
	 * @return boolean
	 */
	public static boolean isEmptyAllString(String... str) {
		if (null == str)
			return true;
		for (String s : str) {
			if (isEmptyString(s)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * String -> int
	 * 
	 * @param String
	 * @return int
	 */
	public static int parseInt(String string, int def) {
		if (isEmptyString(string))
			return def;
		int num = def;
		try {
			num = Integer.parseInt(string);
		} catch (Exception e) {
			num = def;
		}
		return num;
	}

	/**
	 * String -> short
	 * 
	 * @param String
	 * @return int
	 */
	public static short parseShort(String string, short def) {
		if (isEmptyString(string))
			return def;
		short num = def;
		try {
			num = Short.parseShort(string);
		} catch (Exception e) {
			num = def;
		}
		return num;
	}

	/**
	 * String -> long
	 * 
	 * @param String
	 * @return long
	 */
	public static long parseLong(String string, long def) {
		if (isEmptyString(string))
			return def;
		long num;
		try {
			num = Long.parseLong(string);
		} catch (Exception e) {
			num = def;
		}
		return num;
	}

	/**
	 * String -> double
	 * 
	 * @param String
	 * @return long
	 */
	public static double parseDouble(String string, double def) {
		if (isEmptyString(string))
			return def;
		double num;
		try {
			num = Double.parseDouble(string);
		} catch (Exception e) {
			num = def;
		}
		return num;
	}

	/**
	 * String -> float
	 * 
	 * @param String
	 * @return long
	 */
	public static float parseFloat(String string, float def) {
		if (isEmptyString(string))
			return def;
		float num;
		try {
			num = Float.parseFloat(string);
		} catch (Exception e) {
			num = def;
		}
		return num;
	}

	/**
	 * String -> float
	 * 
	 * @param String
	 * @return long
	 */
	public static float parseFloat(String string, float def, int digit) {
		if (isEmptyString(string))
			return def;
		float num;
		try {
			num = Float.parseFloat(string);
		} catch (Exception e) {
			num = def;
		}
		if (digit > 0 && num != def) {
			BigDecimal bigDecimal = new BigDecimal(num);
			float twoDecimalP = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
			return twoDecimalP;
		} else {
			return num;
		}
	}

	/**
	 * @param date
	 * @param string
	 * @return
	 */
	public static String getTimeFormat(Date date, String string) {
		SimpleDateFormat sdFormat;
		if (isEmptyString(string)) {
			sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		} else {
			sdFormat = new SimpleDateFormat(string);
		}
		try {
			return sdFormat.format(date);
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * 格式化时间 String转换Date "yyyy-MM-dd HH:mm:ss"
	 * 
	 * @param 需要格式化的时间和格式
	 * @return 格式化之后的时间
	 */
	public static Date getDateFormat(String date, String format) {
		if (isEmptyString(date))
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static int hasNext(List<?> a) {
		if (a != null && a.size() > 0) {
			return 1;
		}
		return 0;
	}

	/**
	 * 过滤字符串中的可能存在XSS攻击的非法字符
	 * 
	 * @param value
	 * @return
	 */
	public static String cleanXSS(String value) {
		value = value.replaceAll("<", "& lt;").replaceAll(">", "& gt;");
		value = value.replaceAll("\\(", "& #40;").replaceAll("\\)", "& #41;");
		value = value.replaceAll("'", "& #39;");
		value = value.replaceAll("eval\\((.*)\\)", "");
		value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
		value = value.replaceAll("script", "");
		value = value.replaceAll(" ", "");
		return value;
	}

	/**
	 * 获取随机6位验证码
	 * 
	 * @return
	 */
	public static String getRandomVcode() {
		Random random = new Random();
		String result = "";
		for (int i = 0; i < 6; i++) {
			result += random.nextInt(10);
		}
		return result;
	}

	/**
	 * 计算地球上任意两点(经纬度)距离
	 * 
	 * @param long1
	 *            第一点经度
	 * @param lat1
	 *            第一点纬度
	 * @param long2
	 *            第二点经度
	 * @param lat2
	 *            第二点纬度
	 * @return 返回距离 单位：米
	 */
	public static double Distance(double long1, double lat1, double long2, double lat2) {
		double a, b, R;
		R = 6378137; // 地球半径
		lat1 = lat1 * Math.PI / 180.0;
		lat2 = lat2 * Math.PI / 180.0;
		a = lat1 - lat2;
		b = (long1 - long2) * Math.PI / 180.0;
		double d;
		double sa2, sb2;
		sa2 = Math.sin(a / 2.0);
		sb2 = Math.sin(b / 2.0);
		d = 2 * R * Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1) * Math.cos(lat2) * sb2 * sb2));
		return d;
	}

	// 工程访问路径
	public static String getWebRootUrl() {
		return properties.getProperty("webRootUrl");
	}

	// 苹果推送证书密码
	public static String getIosPushPsw() {
		return properties.getProperty("ios_push_file_psw");
	}


	/**
	 * 将传入的时间转换成 **小时前 ***几天前的格式
	 * 
	 * @param date
	 * @return
	 */
	public static final String getTimeDiff(Date date) {
		Calendar currentDate = Calendar.getInstance();// 获取当前时间
		long diff = currentDate.getTimeInMillis() - date.getTime();
		if (diff <= 0) {
			return 1 + "秒钟前";
		} else if (diff < 60000) {
			int second = (int) (diff / 1000);
			if (second == 0) {
				return 1 + "秒钟前";
			} else {
				return second + "秒钟前";
			}

		} else if (diff < 3600000) {
			int minute = (int) (diff / 60000);
			if (minute == 0) {
				return 1 + "分钟前";
			} else {
				return minute + "分钟前";
			}

		} else if (diff < 86400000) {
			int hour = (int) (diff / 3600000);
			if (hour == 0)
				hour = 1;
			return hour + "小时前";
		} else if (diff < 864000000) {
			int day = (int) (diff / 86400000);
			if (day == 0)
				day = 1;
			return day + "天前";
		} // 十天以内

		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdFormat.format(date);
	}

	public static boolean checkSession(String accesstoken, String userToken) {
		return !CommonUtils.isEmptyString(accesstoken) && accesstoken.equals(userToken);
	}

	public static int getAge(Date startDate, Date endDate) {
		if (startDate == null)
			return 0;
		Calendar calendarStart = Calendar.getInstance();
		Calendar calendarEnd = Calendar.getInstance();
		calendarStart.setTime(startDate);
		calendarEnd.setTime(endDate);
		int endYear = calendarEnd.get(Calendar.YEAR);
		int startYear = calendarStart.get(Calendar.YEAR);
		return endYear - startYear;

	}

	/**
	 * 获得该月第一天
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public static String getFirstDayOfMonth(int year, int month) {
		Calendar cal = Calendar.getInstance();
		// 设置年份
		cal.set(Calendar.YEAR, year);
		// 设置月份
		cal.set(Calendar.MONTH, month);
		// 获取某月最小天数
		int firstDay = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
		// 设置日历中月份的最小天数
		cal.set(Calendar.DAY_OF_MONTH, firstDay);
		// 格式化日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String firstDayOfMonth = sdf.format(cal.getTime());
		return firstDayOfMonth;
	}

	/**
	 * 获得该月最后一天
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public static String getLastDayOfMonth(int year, int month) {
		Calendar cal = Calendar.getInstance();
		// 设置年份
		cal.set(Calendar.YEAR, year);
		// 设置月份
		cal.set(Calendar.MONTH, month);
		// 获取某月最大天数
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 设置日历中月份的最大天数
		cal.set(Calendar.DAY_OF_MONTH, lastDay);
		// 格式化日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String lastDayOfMonth = sdf.format(cal.getTime());
		return lastDayOfMonth;
	}

	/**
	 * 计算两个日期之间相差的天数
	 * 
	 * @param smdate
	 *            较小的时间
	 * @param bdate
	 *            较大的时间
	 * @return 相差天数
	 * @throws ParseException
	 */
	public static int daysBetween(Date smdate, Date bdate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		smdate = sdf.parse(sdf.format(smdate));
		bdate = sdf.parse(sdf.format(bdate));
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}

	public Date parse(String strDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(strDate);
	}

	// 由出生日期获得年龄
	public static int getAge(Date birthDay) throws Exception {
		if (birthDay == null)
			return 0;

		Calendar cal = Calendar.getInstance();

		if (cal.before(birthDay)) {
			throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!");
		}
		int yearNow = cal.get(Calendar.YEAR);
		int monthNow = cal.get(Calendar.MONTH);
		int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
		cal.setTime(birthDay);

		int yearBirth = cal.get(Calendar.YEAR);
		int monthBirth = cal.get(Calendar.MONTH);
		int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

		int age = yearNow - yearBirth;

		if (monthNow <= monthBirth) {
			if (monthNow == monthBirth) {
				if (dayOfMonthNow < dayOfMonthBirth)
					age--;
			} else {
				age--;
			}
		}
		return age;
	}

	public static String getTimeDiff(String startTime, String endTime) {
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date begin;
		java.util.Date end;
		String str = "";
		try {
			begin = dfs.parse(startTime);
			end = dfs.parse(endTime);
			long between = (end.getTime() - begin.getTime()) / 1000;// 除以1000是为了转换成秒
			long day1 = between / (24 * 3600);
			long hour1 = between % (24 * 3600) / 3600;
			long minute1 = between % 3600 / 60;
			long second1 = between % 60 / 60;
			str += day1 + "天" + hour1 + "小时" + minute1 + "分" + second1 + "秒";
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	public static Long getTimeDiff1(String startTime, String endTime) {
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date begin;
		java.util.Date end;
		try {
			begin = dfs.parse(startTime);
			end = dfs.parse(endTime);
			long between = (end.getTime() - begin.getTime()) / (1000*60);// 除以1000是为了转换成秒
			return between;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0L;
	}

	/**
	 * 获取当前时间 yyyyMMddHHmmss
	 * 
	 * @return String
	 */
	public static String getCurrTime() {
		Date now = new Date();
		SimpleDateFormat outFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String s = outFormat.format(now);
		return s;
	}

	/**
	 * 取出一个指定长度大小的随机正整数.
	 * 
	 * @param length
	 *            int 设定所取出随机数的长度。length小于11
	 * @return int 返回生成的随机数。
	 */
	public static int buildRandom(int length) {
		int num = 1;
		double random = Math.random();
		if (random < 0.1) {
			random = random + 0.1;
		}
		for (int i = 0; i < length; i++) {
			num = num * 10;
		}
		return (int) ((random * num));
	}

	/**
	 * 创建md5摘要,规则是:按参数名称a-z排序,遇到空值的参数不参加签名。
	 */
	public static String createSign(Map<String, String> packageParams,String app_secert) {
		StringBuffer sb = new StringBuffer();
		Set<Entry<String, String>> es = sortMapByKey(packageParams).entrySet();
		Iterator<Entry<String, String>> it = es.iterator();
		while (it.hasNext()) {
			Entry<String, String> entry = it.next();
			String k = (String) entry.getKey();
			String v = (String) entry.getValue();
			if (null != v && !"".equals(v) && !"sign".equals(k) && !"app_secert".equals(k)&&!"file".equals(k)&&!"qr_code_id".equals(k)) {
				sb.append(k + "=" + v + "&");
			}
		}
//		System.out.println("md5 sb:" + sb.toString());
		sb.append("app_secert=" + app_secert);
		System.out.println("md5 sb:" + sb.toString());
		String sign = MD5Util.MD5Encode(sb.toString(), "UTF-8").toUpperCase();
//		System.out.println("packge签名:" + sign);
		System.out.println(sign);
		return sign;
	}

	/**
	 * MD5加密
	 * 
	 * @param 要加密的String
	 * @return 加密后String(大写)
	 */
	public final static String MD5(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			byte[] strTemp = s.getBytes();
			// 使用MD5创建MessageDigest对象
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte b = md[i];
				str[k++] = hexDigits[b >> 4 & 0xf];
				str[k++] = hexDigits[b & 0xf];
			}
			return new String(str).toUpperCase();
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * MD5加密
	 * 
	 * @param 要加密的String
	 * @return 加密后String(大写)
	 */
	public final static String md5(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			byte[] strTemp = s.getBytes();
			// 使用MD5创建MessageDigest对象
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte b = md[i];
				str[k++] = hexDigits[b >> 4 & 0xf];
				str[k++] = hexDigits[b & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			return null;
		}
	}
	
	 /** 
     * 使用 Map按key进行排序 
     * @param map 
     * @return 
     */  
    public static Map<String, String> sortMapByKey(Map<String, String> map) {  
        if (map == null || map.isEmpty()) {  
            return null;  
        }  
        Map<String, String> sortMap = new TreeMap<String, String>(new MapKeyComparator());  
        sortMap.putAll(map);  
        return sortMap;  
    }  
	
	/**
	 * 获取请求所有参数
	 * @param request
	 * @return
	 */
	public static Map<String,String> getAllParams(HttpServletRequest request) {
		Map<String,String> map = new HashMap<String,String>();
		Enumeration paramNames = request.getParameterNames();
		while (paramNames.hasMoreElements()) {
			String paramName = (String) paramNames.nextElement();

			String[] paramValues = request.getParameterValues(paramName);
			if (paramValues.length == 1) {
				String paramValue = paramValues[0];
				if (paramValue.length() != 0) {
					map.put(paramName, paramValue);
				}
			}
		}
		return map;
	};

	public static String caculTime2(Date date) {
		String time = "";
		try {
			long diff = System.currentTimeMillis() - date.getTime();
			if (diff > 0) {
				long day = diff / (3600 * 1000 * 24);
				long hour = (diff - day * (3600 * 1000 * 24)) / (3600 * 1000);
				long minute = (diff - day * (3600 * 1000 * 24) - hour * (3600 * 1000)) / (60 * 1000);
				if (hour < 1 && day < 1) {
					// 一小时内
					if (minute == 0)
						time = "刚刚";
					else
						time = minute + "分钟前";
				} else if (hour >= 1 && day < 1) {
					// 一天内
					time = hour + "小时前";
				} else {
					// 大于一周
					time = getTimeFormat(date, "yyyy-MM-dd");
				}
			} else
				time = "";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return time;
	}
	
	public static String nameHide(String name){
		if(!isEmptyString(name)){
			return name.substring(0, 1)+"**";
		}
		return null;
	}
	
	/**
	 * 发起https请求
	 * 
	 * @param requestUrl
	 *            请求地址
	 * @param requestMethod
	 *            请求方式（GET、POST）
	 * @param outputStr
	 *            提交的数据
	 * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
	 */
	public static JSONObject httpRequestali(String requestUrl, String requestMethod,
			String outputStr) {
		JSONObject jsonObject = null;
		StringBuffer buffer = new StringBuffer();
		try {
			// 创建SSLContext对象
			TrustManager[] tm = { (TrustManager) new MyX509TrustManager() };
			SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
			sslContext.init(null, tm, new java.security.SecureRandom());
			// 从上述SSLContext对象中得到SSLSocketFactory对象
			SSLSocketFactory ssf = sslContext.getSocketFactory();
			URL url = new URL(requestUrl);
			HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();
			httpUrlConn.setSSLSocketFactory(ssf);
			httpUrlConn.setDoOutput(true);
			httpUrlConn.setDoInput(true);
			httpUrlConn.setUseCaches(false);
			// 设置请求方式（GET/POST）
			httpUrlConn.setRequestMethod(requestMethod);
			if ("GET".equalsIgnoreCase(requestMethod))
				httpUrlConn.connect();
			// 当有数据需要提交时
			if (null != outputStr) {
				OutputStream outputStream = httpUrlConn.getOutputStream();
				// 编码格式
				outputStream.write(outputStr.getBytes("UTF-8"));
				outputStream.close();
			}
			// 将返回的输入流转换成字符串
			InputStream inputStream = httpUrlConn.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
			bufferedReader.close();
			inputStreamReader.close();
			// 释放资源
			inputStream.close();
			inputStream = null;
			httpUrlConn.disconnect();

			jsonObject = JSONObject.parseObject(buffer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonObject;
	}
	
	public static  HashMap<String,Object>  getLocationByName(String name){
		HashMap<String,Object> map = new HashMap<String,Object>();
		String requestUrl = "https://api.map.baidu.com/geocoder/v2/";
		String method = "GET";
		String output = "address="+name+"&output=json&ak="+Constant.baidu_ak;
		JSONObject jsonObject = null;
		int state = -1;
		Double lng = null;
		Double lat = null;
		do{
			jsonObject = httpRequestali(requestUrl,method,output);
			if(jsonObject!=null){
				state = jsonObject.getIntValue("status");
				if(state==0){
					JSONObject location = jsonObject.getJSONObject("result").getJSONObject("location");
					lng = location.getDouble("lng");
					lat = location.getDouble("lat");
				}
			}
		}while(jsonObject==null||state!=0);
		map.put("lng", lng);
		map.put("lat", lat);
		return map;
	}
	
	public static String getStringName(String name,String phone){
		if(!CommonUtils.isEmptyString(name))
			return name;
		if(!CommonUtils.isEmptyString(phone))
			return getxphone(phone);
		return "";
	}
	
	public static String getxphone(String username) {
		String mobiletop = username.substring(0, 3);
		String mobilebottom = username.substring(7, 11);
		String name = mobiletop+"****"+mobilebottom;
		return name;
	}
	  /**
     * @function:从list中随机抽取若干不重复元素
     *
     * @param paramList:被抽取list
     * @param count:抽取元素的个数
     * @return:由抽取元素组成的新list
     */
    public static List<FrogTask> getRandomList(List<FrogTask> paramList,int count){
        if(paramList.size()<count){
            return paramList;
        }
        Random random=new Random();
        List<Integer> tempList=new ArrayList<Integer>();
        List<FrogTask> newList=new ArrayList<FrogTask>();
        int temp=0;
        for(int i=0;i<count;i++){
            temp=random.nextInt(paramList.size());//将产生的随机数作为被抽list的索引
            if(!tempList.contains(temp)){
                tempList.add(temp);
                newList.add(paramList.get(temp));
            }
            else{
                i--;
            }   
        }
        return newList;
    }
    /**double 小数进一
     * 
     * @param d
     * @return
     */
    public static int changeDoubleToInt(double d) {

        DecimalFormat dfi = new DecimalFormat("#");

        RoundingMode roundingMode = RoundingMode.UP;

        dfi.setRoundingMode(roundingMode);

        int parseInt = Integer.parseInt(dfi.format(d));

        return parseInt;
    }
    /**
     * 获取key
     * @param user_id
     * @return
     */
	public static String getDayKey(Integer user_id){
		StringBuffer buffer = new StringBuffer();
		buffer.append(String.valueOf(user_id));
		buffer.append(Constant.USER_DAY_COUNT_KEY);
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		buffer.append(dateFormat.format(new java.util.Date()));
		return buffer.toString();
	}
	public static String hashKey(){
		StringBuffer buffer= new StringBuffer();
		buffer.append(Constant.USER_DAY_COUNT_KEY);
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		buffer.append(dateFormat.format(new java.util.Date()));
		return buffer.toString();
		
	}
	//获取七牛token

	
	public static byte[] HmacSHA1Encrypt(String encryptText, String encryptKey)
	        throws Exception {
	    byte[] data = encryptKey.getBytes(ENCODING);
	    // 根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
	    SecretKey secretKey = new SecretKeySpec(data, MAC_NAME);
	    // 生成一个指定 Mac 算法 的 Mac 对象
	    Mac mac = Mac.getInstance(MAC_NAME);
	    // 用给定密钥初始化 Mac 对象
	    mac.init(secretKey);
	    byte[] text = encryptText.getBytes(ENCODING);
	    // 完成 Mac 操作
	    return mac.doFinal(text);
	}
	public static String getUpToken(){
		String accessKey = Constant.qiniu_key;
		String secretKey = Constant.qiniu_seret;
		String bucket =Constant.qiniu_scope;
		Auth auth = Auth.create(accessKey, secretKey);
		String upToken = auth.uploadToken(bucket);
		System.out.println(upToken);
		return upToken;
	}

//	public static void main(String[] args) {
//		System.out.println(getUpToken());
//	}
	
}
