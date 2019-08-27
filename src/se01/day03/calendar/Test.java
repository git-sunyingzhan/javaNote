package se01.day03.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 超市商品的促销方案
 * 在过期日期前的第二周的星期三开始促销（保质期至少一个月）
 * 根据商品的生产日期和保质期，求出商品的促销日期
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入生产日期(yyyy-MM-dd)：");
		String pt = scanner.nextLine();
		System.out.println("请输入保质期（天）");
		int day = scanner.nextInt();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//获取生产日期
		Date pd = sdf.parse(pt);
		
		
		Calendar calendar = Calendar.getInstance();
		//商品生产日期的日历
		calendar.setTime(pd);
		
		//获取保质期的最后一天的日历
		calendar.add(Calendar.DATE, day);
		
		//前两周的星期三
		calendar.add(Calendar.WEEK_OF_MONTH, -2);
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		
		//获取促销日期
		Date date = calendar.getTime();
		System.out.println(date);
		
	}

}
