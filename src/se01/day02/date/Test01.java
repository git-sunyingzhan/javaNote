package se01.day02.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的出生日期：");
		String mydate = scanner.nextLine();
//		System.out.println(mydate.replaceAll("\\D+", "-"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date s = sdf.parse(mydate.replaceAll("\\D+", "-"));
		Date now = new Date();
		System.out.println((now.getTime()-s.getTime())/24/60/60/1000/365);
	}

}
