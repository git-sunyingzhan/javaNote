package se01.day03;

import java.math.BigDecimal;

public class BigDecaimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = 3.0;
		double d2 = 2.9;
		System.out.println(d1-d2);	//精度损失
		
		BigDecimal bd1 = new BigDecimal("3.0");
		BigDecimal bd2 = new BigDecimal("2.9");
		System.out.println(bd1.subtract(bd2));//0.1
		
		//ArithmeticException算数异常（结果是无限不循环小数）
//		System.out.println(bd1.divide(bd2));
		
		//保留9位，四舍五入
		System.out.println(bd1.divide(bd2,4,BigDecimal.ROUND_HALF_UP));
		
		BigDecimal[] bds = bd1.divideAndRemainder(bd2);
		System.out.println(bds[0]);
		System.out.println(bds[1]);
	}

}
