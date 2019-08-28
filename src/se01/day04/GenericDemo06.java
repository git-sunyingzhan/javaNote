package se01.day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list1 = new ArrayList<Object>();
		List<Number> list2 = new ArrayList<Number>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<String> list4 = new ArrayList<String>();
		
		show(list1);
		show(list2);
		show(list3);
		show(list4);
		
//		fun(list1);
		fun(list2);
		fun(list3);
//		fun(list4);
		
		method(list1);
		method(list2);
//		method(list3);
//		method(list4);

	}
	
	public static void show(Collection<?> c) {}
	public static void fun(Collection<? extends Number> c) {}
	public static void method(Collection<? super Number> c) {}
}
