package se01.day04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//world后添加“javase”
		list.add(2,"javase");
		System.out.println(list);
		
		//删除最后一个元素
		list.remove(list.size()-1);
		System.out.println(list);
		
		//将第二个元素改为“china”
		list.set(1, "china");
		System.out.println(list);
		
		//获取第一个元素
		System.out.println(list.get(0));
		
		System.out.println("----------------");
		//遍历方式1：	Iterator
		Iterator i = list.iterator();
		while(i.hasNext()) {
			String s = (String) i.next();
			System.out.println(s);
		}
		
		System.out.println("----------------");
		//遍历方式2: for
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
		System.out.println("----------------");
		//遍历方式3: ListIterator逆向遍历
		ListIterator li = list.listIterator();
		
		//先正向遍历，指针指向最下面
		while(li.hasNext()) {
			li.next();
		}
		
		//然后再进行逆向遍历
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
