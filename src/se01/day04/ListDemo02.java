package se01.day04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * 判断集合里面是否存在“world”，如果存在就在集合里面添加“javase”元素
 */
public class ListDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//方式1
//		demo01(list);
		
		//方式2
//		demo02(list);
		
		//方式3
		demo3(list);
		
		System.out.println(list);
		
	}

	private static void demo3(List list) {
		// TODO Auto-generated method stub
		ListIterator li = list.listIterator();
		while(li.hasNext()) {
			String s = (String)li.next();
			if(s.equals("world")) {
				li.add("javase");
			}
		}
		
	}

	private static void demo02(List list) {
		// TODO Auto-generated method stub
		Iterator i = list.iterator();
		while(i.hasNext()) {
			//	ConcurrentModificationException并发修改异常
			String s = (String)i.next();
			//判断
			if (s.equals("world")) {
				list.add("javase");
				break;
			}
		}
		
	}

	private static void demo01(List list) {
		// TODO Auto-generated method stub
		if (list.contains("world")) {
			list.add("javase");
		}
		System.out.println(list);
	}

}
