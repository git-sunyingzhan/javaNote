package se01.day02.regex;

import java.util.Arrays;

/*
 * 现有字符串“78 34 65 43 56”
 * 输出字符串“34 43 56 65 78”
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "78 34 65 43 56";
		String[] ss = str.split("\\s");
		Arrays.sort(ss);
		String ns = "";
		for (int i = 0; i < ss.length; i++) {
			ns+=ss[i]+" ";
		}
		ns = ns.trim();
		System.out.println(ns);
		StringBuilder name = new StringBuilder();
		
		
	}
}
