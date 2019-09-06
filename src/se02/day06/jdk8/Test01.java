package se02.day06.jdk8;

import java.util.function.Function;

/*
 * String s = "赵丽颖,20"
 * 1）字符串分割获取年龄
 * 2）年龄转成Integer
 * 3）将年龄+100，得到一个整数
 */
public class Test01 {

	public static void main(String[] args) {
		String s = "赵丽颖，20";
		int age = test01(s);
		System.out.println(age);
		int age2 = teat02(a->Integer.parseInt(s.split("，")[1])+100,s);
		System.out.println(age2);
	}

	private static int teat02(Function<String, Integer> a,String s) {
		return a.apply(s);
	}

	private static int test01(String s) {
		return Integer.parseInt(s.split("，")[1])+100;
	}

}
