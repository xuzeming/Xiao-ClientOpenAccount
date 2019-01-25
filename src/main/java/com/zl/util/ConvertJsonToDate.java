package com.zl.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将身份证上的日期转换成yyyy-MM-dd
 * @author THINK
 *
 */
public class ConvertJsonToDate {
	public static Date convertJsonStrToDate(String jsonStr) throws ParseException {
		String year = jsonStr.substring(0,4); 
		String month = jsonStr.substring(4,6);
		String day = jsonStr.substring(6,8);
		String date = year+"-"+month+"-"+day;
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		return simple.parse(date);
	}
}
