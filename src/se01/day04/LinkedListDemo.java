package se01.day04;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList li = new LinkedList();
		li.add("B");
		li.add("C");
		
		//添加首元素
		li.addFirst("A");
		
		//添加尾元素
		li.addLast("D");
		System.out.println(li);
		
		//获取第一个元素
		System.out.println(li.getFirst());
		//获取最后一个元素
		System.out.println(li.getLast());
		
		//移除第一个元素
		li.removeFirst();
		//移除最后一个元素
		li.removeLast();
		System.out.println(li);
	}

}
