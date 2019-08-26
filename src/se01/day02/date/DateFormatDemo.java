package se01.day02.date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		//日期格式器
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.CHINA);
		Date now = new Date();
		//格式化
		String s = df.format(now);
		System.out.println(s);
	}

}
