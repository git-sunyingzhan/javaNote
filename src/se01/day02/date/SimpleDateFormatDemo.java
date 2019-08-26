package se01.day02.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date now = new Date();
		//默认模式
		SimpleDateFormat sdf = new SimpleDateFormat();
		//格式化
		String s = sdf.format(now);
		System.out.println(s);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss");
		System.out.println(sdf2.format(now));
		
		//解析字符串必须要是表示日期的字符串,且字符串模式必须要和格式器模式保持一致
		String time = "2019年08月26日 18：08：23";
		//解析
		Date date = sdf2.parse(time);
		System.out.println(date);
	}

}
