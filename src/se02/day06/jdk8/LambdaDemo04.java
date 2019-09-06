package se02.day06.jdk8;

interface Calculator{
	int calc(int a,int b);
}

public class LambdaDemo04 {

	public static void main(String[] args) {
		int sum = invokeCalc((a,b)->a+b,1,2);
		System.out.println(sum);
		
		System.out.println(invokeCalc((a,b)->a>b?a:b, 1, 2));
	}

	private static int invokeCalc(Calculator c,int a,int b) {
		return c.calc(a, b);
	}

}
