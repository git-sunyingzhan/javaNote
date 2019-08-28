package se01.day04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 泛型的使用
 */
public class GenericDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<String>集合里面只能存储字符串类型数据
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}
		
	}

}
