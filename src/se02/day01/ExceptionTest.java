package se02.day01;

/*
 * 如果一个finally,又有return。问,finally里面对代码会执行吗？会
 * 如果能够执行，是在teturn前执行还是retrun后执行？能执行，在中间
 */
public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =  method();
		System.out.println(a);
	}

	private static int method() {
		// TODO Auto-generated method stub
		int a = 10;
		try {
			System.out.println(a/0);
			a = 20;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			a = 30;
			return a;
		}finally {
			a = 40;
			//return a;//40
		}
		return a;//30
	}

}
