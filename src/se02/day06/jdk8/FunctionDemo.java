package se02.day06.jdk8;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		String s = fun((a->String.valueOf(a)),10);
		System.out.println(s);
		
		int a = method(str->Integer.parseInt(str),n->n+5,"100");
		System.out.println(a);
	}

	public static String fun(Function<Integer, String> func,Integer i) {
		return func.apply(i);
	}
	
	public static int method(Function<String, Integer> one,Function<Integer, Integer> two,String s) {
		return one.andThen(two).apply(s);
	}
}
