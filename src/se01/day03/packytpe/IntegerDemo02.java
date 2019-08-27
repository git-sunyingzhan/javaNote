package se01.day03.packytpe;

public class IntegerDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//自动装箱：有基本数据类型默认转换成对应的包装类类型
		Integer i = 10;//Integer i = Integer.valueOf(10);
		
		Integer i2 = 20;
		//先自动拆箱，后自动装箱
		i2 += 30;//
		System.out.println(i2);
	}

}
