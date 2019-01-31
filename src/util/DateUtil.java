package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
	/**
	 * �õ���������30��������
	 */
	@SuppressWarnings("static-access")
	public static String getToDate(String date) throws ParseException {// �õ���ǰ����num��������
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");
		Date str = simpleDateFormat.parse(date);
		Calendar cl = Calendar.getInstance();// ������calendar����
		cl.setTime(str);// ��ȡ��ǰʱ��������cl��ʱ��
		cl.add(cl.DATE, +30);
		// �������ڸ�ʽ������
		// SimpleDateFormat simpleDateFormat = new
		// SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		return simpleDateFormat.format(cl.getTime());// ���ַ�������num��������
	}

	/**
	 * ����쵽֮ǰĳ�����ڵ�����
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
	 * ��ȡ��ǰ����
	 */
	public static String getThisDay() {
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yy-MM-dd");
		String time = format.format(date);
		return time;
	}

}
