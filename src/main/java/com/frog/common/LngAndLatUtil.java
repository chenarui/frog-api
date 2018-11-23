package com.frog.common;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LngAndLatUtil {
	
	private static double EARTH_RADIUS = 6378.137;

	public static Map<String, Double> getLngAndLat(String address) {
		Map<String, Double> map = new HashMap<String, Double>();
		String url = "http://api.map.baidu.com/geocoder/v2/?address=" + address
				+ "&output=json&ak=F454f8a5efe5e577997931cc01de3974";
		String json = loadJSON(url);
		JSONObject obj = JSONObject.parseObject(json);
		if (obj.get("status").toString().equals("0")) {
			double lng = obj.getJSONObject("result").getJSONObject("location").getDouble("lng");
			double lat = obj.getJSONObject("result").getJSONObject("location").getDouble("lat");
			map.put("lng", lng);
			map.put("lat", lat);
			// System.out.println("经度："+lng+"---纬度："+lat);
		} else {
			// System.out.println("未找到相匹配的经纬度！");
		}
		return map;
	}

	public static String loadJSON(String url) {
		StringBuilder json = new StringBuilder();
		try {
			URL oracle = new URL(url);
			URLConnection yc = oracle.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			String inputLine = null;
			while ((inputLine = in.readLine()) != null) {
				json.append(inputLine);
			}
			in.close();
		} catch (MalformedURLException e) {
		} catch (IOException e) {
		}
		return json.toString();
	}

 /**
  * 计算两点之间的距离
  * @param d
  * @return
  */


	private static double rad(double d) {
		return d * Math.PI / 180.0;
	}

	public static double getDistance(double lat1, double lng1, double lat2, double lng2) {
		double radLat1 = rad(lat1);
		double radLat2 = rad(lat2);
		double a = radLat1 - radLat2;
		double b = rad(lng1) - rad(lng2);
		double s = 2 * Math.asin(Math.sqrt(
				Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
		s = s * EARTH_RADIUS;
		s = Math.round(s * 10000d) / 10000d;
		s = s * 1000;
		return s;
	}
	public static void main(String[] args) {
		Map<String, Double> map = LngAndLatUtil.getLngAndLat("杭州市拱墅区乐富智汇园");
	
		System.out.println("经度：" + map.get("lng") + "---纬度：" + map.get("lat"));
		Map<String, Double> map2 = LngAndLatUtil.getLngAndLat("杭州市江干区宋晨光国际");
		double s=LngAndLatUtil.getDistance(map.get("lat"), map.get("lng"), map2.get("lat"), map2.get("lng"));
		System.out.println(s);
	}

}