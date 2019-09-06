package se02.day06.jdk8;

import java.util.function.Consumer;

public class CobsumerDemo {

	public static void main(String[] args) {
		String s = "heLlo";
		prints(con->System.out.println(con),s);
		
		//先将一个字符串转成大写输出，然后再将这个字符串转成小写输出
		printSS(one->System.out.println(one.toUpperCase()),two->System.out.println(two.toLowerCase()),s);
	}

	private static void prints(Consumer<String> con, String s) {
		con.accept(s);
	}
	
	private static void printSS(Consumer<String> one,Consumer<String> two,String s) {
		one.andThen(two).accept(s);
	}
}
