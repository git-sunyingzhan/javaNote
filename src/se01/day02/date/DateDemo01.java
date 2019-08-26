package se01.day02.date;

import java.util.Date;

public class DateDemo01 {
	public static void main(String[] args) {
		//当前日期
		Date now = new Date();
		System.out.println(now);//Mon Aug 26 17:18:49 CST 2019
		//以指定毫秒值创建Date对象
		//时间从1970-01-01 00:00:00 
		Date date = new Date(1000);
		System.out.println(date); //Thu Jan 01 08:00:01 CST 1970
		//获取当前时间毫秒值
		long ct = now.getTime();
		System.out.println(ct);
		//计算明天这个时候到毫秒值
		long tt = ct+24*60*60*1000;
		System.out.println(tt);
		//获取明天这个时候到日期
		//1)
		Date td = new Date(tt);
		System.out.println(td);
		//2)
		date.setTime(tt);
		System.out.println(date);
	}
}
