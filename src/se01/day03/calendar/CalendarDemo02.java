package se01.day03.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		
		//设置年月日为2012-12-12
		calendar.set(Calendar.YEAR, 2012);
		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.DAY_OF_MONTH, 12);//2012-12-12
		
		//设置的值超出了范围，会自动进位
		calendar.set(Calendar.DATE, 32);//2013-01-01
		
		//年份加2
		calendar.add(Calendar.YEAR, 2);//2015-01-01
		//月份减5
		calendar.add(Calendar.MONTH, -5);//2014-08-01
		
		Date d = calendar.getTime();
		System.out.println(d);
		
		Calendar calendar2 = Calendar.getInstance();
		//设置下个月的第一天
		calendar2.add(Calendar.MONTH, 1);
		calendar2.add(Calendar.DATE, 1);
		//前一天
		calendar2.add(Calendar.DATE, -1);
		//当前月份的最后一天
		Date now = calendar2.getTime();
		System.out.println(now);
	}

}
