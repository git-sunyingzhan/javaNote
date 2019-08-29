package se01.day05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		queue.offer("one");
		queue.offer("two");
		queue.offer(null);
		queue.offer("four");
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println("-----------");
		
		//迭代器遍历
		Iterator<String> i = queue.iterator();
		while(i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		
		//增强for遍历
		for(String s:queue) {
			System.out.println(s);
		}
		
		System.out.println("-----------");
			
		//出队操作遍历
		while(queue.size()!=0) {
			//queue.offer("four");	//出队的同时也可以进行进队操作
			System.out.println(queue.poll());
		}
	}

}
