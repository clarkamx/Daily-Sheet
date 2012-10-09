package com.dwood.lynkf.common.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import com.dwood.lynkf.common.Constants;

public final class Utils implements Constants {
	/**
	 * 获取配置参数
	 * @param propName
	 * @return
	 */
	public static String getProp(String propName) {
		Properties prop = new Properties();
		InputStream is = null;
		try {
			is = Utils.class.getClassLoader().getResourceAsStream("config.properties");
			prop.load(is);
			return prop.getProperty(propName, "");
		} catch (Exception e) {
			return "";
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
			}
		}
	}

	/**
	 * 保存配置参数
	 * @param propName
	 * @param PropValue
	 */
	public static void saveProp(String propName, String PropValue) {
		Properties prop = new Properties();
		InputStream is = null;
		OutputStream os = null;
		try {
			is = Utils.class.getClassLoader().getResourceAsStream("config.properties");
			prop.load(is);
			is.close();
			os = new FileOutputStream(Utils.class.getClassLoader().getResource("config.properties").toURI().getPath());
			prop.setProperty(propName, PropValue);
			prop.store(os, null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * 当前时间, 精确到秒
	 * @return
	 */
	public static String getTimeNow() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(Calendar.getInstance().getTime());
	}
	
	/**
	 * 当前日期
	 * @return
	 */
	public static String getDateNow() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(Calendar.getInstance().getTime());
	}
	
	/**
	 * 之后日期
	 * @return
	 */
	public static String getDatePlus(int plusDay) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, plusDay);
		return format.format(calendar.getTime());
	}
}
