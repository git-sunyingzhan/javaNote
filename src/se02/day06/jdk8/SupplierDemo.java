package se02.day06.jdk8;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		String s = getStr(()->"abc".concat("df"));
		System.out.println(s);
	}
	public static String getStr(Supplier<String> sup) {
		return sup.get();
	}
}
