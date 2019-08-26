package se01.day01.string_test;
/*
 * 判断字符串是否是回文字符串
 * 上海自来水来自海上    abcba
 */

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "上海自来水来自海上";
		boolean bool = check(s);
		System.out.println(bool);

	}

	private static boolean check(String s) {
		for (int i = 0; i < s.length()/2; i++) {
			char bs = s.charAt(i);
			char as = s.charAt(s.length()-1-i);
			if (bs!=as) {
				return false;
			}
		}
		return true;
	}

}
