package se01.day01.string_test;

public class StringDemo02 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1==s2);	//f
		System.out.println(s1.equals(s2));// t
		
		// 如果常量池中不存在“hello”常量，s3需要创建2次对象，s4需要创建1次对象
		// 如果常量池中存在“hello”常量，s3需要创建1次对象，s4直接使用已存在的对象
		String s3 = new String("hello");
		String s4 = "hello";
		System.out.println(s3==s4); //f
		System.out.println(s3.equals(s4));//t
		
		String s5 = "hello";
		String s6 = "hello";
		System.out.println(s5==s6);//t
		System.out.println(s5.equals(s6));//t
	}
}
