package se01.day03.packytpe;

public class IntegerDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建Integer对象
		Integer i = new Integer(10);
		Integer i2 = new Integer("20");
		System.out.println(i);
		System.out.println(i2.toString());
		
		Integer t1 = Integer.valueOf(127);
		Integer t2 = Integer.valueOf("127");
		Integer t3 = Integer.valueOf(127);
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		
		//Integer-->int,类似doubleValue()
		int a = t1.intValue();
		double d = new Double("1.23").doubleValue();
		
		//String-->int,其他包装类类似还有parseFloat(String s)
		int b = Integer.parseInt("100");
		float f = new Float("1.23").floatValue();
	}

}
