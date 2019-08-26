package se01.day02.regex;

public class RegexDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo01();

	}

	//将字符串的每组数字替换成"数字"
	private static void demo01() {
		// TODO Auto-generated method stub
		String s = "fds423hj532jb2hj4b2j4j54b";
		String ns = s.replaceAll("\\d+", "数字");
		System.out.println(ns);
	}

}
