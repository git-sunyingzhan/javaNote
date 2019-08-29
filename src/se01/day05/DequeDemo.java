package se01.day05;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//双端队列
		Deque<String> deque = new LinkedList<String>();
		//压入元素
		deque.push("one");
		deque.push("two");
		deque.push("three");
		deque.push("four");
		System.out.println(deque);
		
		//获取元素
		System.out.println(deque.peek());//four
		
		//弹出元素
		while(deque.size()!=0) {
			System.out.println(deque.pop());
		}
		
	}

}
