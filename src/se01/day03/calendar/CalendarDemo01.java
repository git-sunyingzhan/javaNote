package se01.day03.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 日历对象
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		// 获取日期（当前日期）
		Date d = calendar.getTime();
		System.out.println(d);
		
		//设置日期
		calendar.setTime(new Date(1000*60*60)); //1970-01-01 09:00:00
		System.out.println(calendar.getTime());
		
		//获取年
		int year = calendar.get(Calendar.YEAR);
		//获取月,月份从0开始，0表示一月份
		int month = calendar.get(Calendar.MONTH)+1;
		//获取日
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"-"+month+"-"+day);
		
		//星期中的天
		int wd = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(wd);
	}

}
