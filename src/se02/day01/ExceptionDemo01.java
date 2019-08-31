package se02.day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo01 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int[] arr = {1,2,3};
		
		try {
			//ArithmeticException算数异常
			System.out.println(a/b);
			//异常发后，下面的代码不会执行
			
			//ArrayIndexOutOfBoundsException数组下标越界异常
			System.out.println(arr[3]);
			
			System.out.println("未知异常");
		}catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("除数不能为零");
		}catch (ArrayIndexOutOfBoundsException abe) {
			// TODO: handle exception
			System.out.println("下标超出范围");
		}catch(Exception e) {
			System.out.println("未知异常的处理方案");
		} finally {
			System.out.println("over");
		}
		

		
	}

}
