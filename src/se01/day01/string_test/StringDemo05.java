package se01.day01.string_test;

import java.util.Arrays;

import oop.day03.animal.Cat;

public class StringDemo05 {
	public static void main(String[] args) {
		String s = "ab哈哈";
		//String转byte[]
		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));
		//String转char[]
		char[] chs = s.toCharArray();
		System.out.println(Arrays.toString(chs));
		
		//转大写
		String bString = s.toUpperCase();
		System.out.println(bString);
		
		//转小写
		String aString = s.toLowerCase();
		System.out.println(aString);
		
		//链接
		String ns = bString.concat(aString);
		System.out.println(ns);
		
		//其他类型转字符串类型
		String s1 = String.valueOf(chs);
		System.out.println(s1);
		String s2 = String.valueOf(100);
		System.out.println(s2);
		String s3 = String.valueOf(new Cat("小花",1,'母'));
		System.out.println(s3);
	}
}
