package se02.day06.jdk8;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		System.out.println(method(s->s.length()>5,"abcdfe"));
		
		System.out.println(andFun(one->one.contains("h"),two->two.contains("o"),"hello"));
		
		System.out.println(orFun(one->one.contains("h"),two->two.contains("w"),"hello"));
		
		System.out.println(negateFun(one->one.length()>5, "abcdef"));
		
	}
	public static boolean method(Predicate<String> pre,String s) {
		return pre.test(s);
	}
	
	public static boolean andFun(Predicate<String> one,Predicate<String> two,String s) {
		return one.and(two).test(s);
	}
	
	public static boolean orFun(Predicate<String> one,Predicate<String> two,String s) {
		return one.or(two).test(s);
	}
	
	public static boolean negateFun(Predicate<String> one,String s) {
		return one.negate().test(s);
	}
}
