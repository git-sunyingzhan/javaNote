package se02.day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {			
			method();
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("除数不能为0");
		}
		
		try {
			Date d = parseTime("sfs");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("字符串不能解析");
		}
	}

	//编译期间出现的异常，调用者一定要处理
	private static Date parseTime(String s) throws ParseException {
		// TODO Auto-generated method stub
		return new SimpleDateFormat().parse(s);
	}

	//运行期间出现的异常，调用者可以不处理
	private static void method() throws ArithmeticException {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}

}
