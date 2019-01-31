package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
	/**
	 * 得到给定日期30天后的日期
	 */
	@SuppressWarnings("static-access")
	public static String getToDate(String date) throws ParseException {// 得到當前日期num天后的日期
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");
		Date str = simpleDateFormat.parse(date);
		Calendar cl = Calendar.getInstance();// 创建了calendar对象
		cl.setTime(str);// 获取当前时间来设置cl的时间
		cl.add(cl.DATE, +30);
		// 创建日期格式化对象
		// SimpleDateFormat simpleDateFormat = new
		// SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		return simpleDateFormat.format(cl.getTime());// 以字符串返回num天后的日期
	}

	/**
	 * 求今天到之前某个日期的天数
	 */
	public static int getToDays(String date) throws ParseException {
		SimpleDateFormat simple = new SimpleDateFormat("yy-MM-dd");
		Date toDate = null;
		toDate = simple.parse(date);
		Date date2 = new Date();

		// System.out.println((System.currentTimeMillis()-toDate.getTime())/1000/60/60/24);

		int days = -(int) ((System.currentTimeMillis() - toDate.getTime()) / 1000 / 60 / 60 / 24);
		return days;
	}

	public static void main(String[] args) throws Exception {
		int i = getToDays("17-8-13");
		System.out.println("i:" + i);

	}

	/**
	 * 获取当前日期
	 */
	public static String getThisDay() {
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yy-MM-dd");
		String time = format.format(date);
		return time;
	}

}
