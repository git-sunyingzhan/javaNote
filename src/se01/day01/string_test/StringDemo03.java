package se01.day01.string_test;

/*
 * 字符串连接操作
 * 如果是两个变量进行连接，先开辟空间，后进行链接
 * 如果是两个常量进行链接，先连接获取链接的结果值。然后在常量池里面查找是否存在这个
 * 结果值。如果存在，直接使用存在的值；如果不存在，就开辟空间
 */
public class StringDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "java";

		String s3 = "hellojava";
		System.out.println(s3==s1+s2);//f
		System.out.println(s3.equals(s1+s2));//t
		
		System.out.println(s3=="hello"+"java");//t
		System.out.println(s3.equals("hello"+"java"));//t
	}

}
