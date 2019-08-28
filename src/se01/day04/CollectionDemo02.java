package se01.day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection = new ArrayList();
		collection.add("hello");
		collection.add("world");
		collection.add("java");
		
		//获取集合的迭代器对象
		Iterator i = collection.iterator();
		while(i.hasNext()) {//判断是否有下一个元素
			Object object = i.next();//获取下一个元素
			System.out.println(object);
		}
	}

}
