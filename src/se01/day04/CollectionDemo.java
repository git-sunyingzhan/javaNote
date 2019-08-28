package se01.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection
		Collection c = new ArrayList();
		//添加元素
		c.add("a");
		c.add(100);
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		
		//将c2作为元素添加到c里面
		//c.add(c2); //[a, 100, [a, b]]
		
		//将c2里面的元素添加到c里面
		c.addAll(c2);//[a, 100, a, b]
		
		//删除指定元素
		//c.remove("a"); //[100, a, b]
		
		//删除集合元素
		//c.removeAll(c2); //[100]
		
		//清空
		//c.clear();//[]
		
		//获取集合大小
		System.out.println(c.size());
		
		//判读集合是否为空
		System.out.println(c.isEmpty());
		
		//是否包含“c”
		System.out.println(c.contains("c"));
		
		//是否包含c2
		System.out.println(c.contains(c2));
		System.out.println(c.containsAll(c2));
		
		System.out.println(c);
		//集合转数组
		Object[] objs = c.toArray();
		System.out.println(Arrays.toString(objs));
		
		Collection cl1 = new ArrayList();
		cl1.add("a");
		cl1.add("b");
		cl1.add("c");
		Collection cl2 = new ArrayList();
		cl2.add("a");
		cl2.add("b");
		cl2.add("d");
		
		/*
		 * 集合交集
		 * 交集给了cl1，如果cl1发生改变，返回true；否则返回false
		 */
		boolean bool = cl1.retainAll(cl2);
		System.out.println(bool);
		System.out.println(cl1);
		System.out.println(cl2);
	}

}
