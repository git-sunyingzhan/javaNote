package se02.day01;

public class ExceptionDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			//JVM对异常对默认处理方案（打印异常名、异常信息、异常发生对位置）
			//ae.printStackTrace();
			
			System.out.println("除数不能为0");
		}
	}

	private static void method() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		if (b==0) {
			//抛出异常对象
			throw new ArithmeticException();
		}else {
			System.out.println(a/b);
		}
	}

}
