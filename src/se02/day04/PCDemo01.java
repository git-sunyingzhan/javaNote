package se02.day04;

import java.util.ArrayList;
import java.util.List;

//资源类
class MyList {
	private static final int MAX_SIZE = 10;//资源最大量
	private List<Integer> list = new ArrayList<>();//资源存储的集合
	
	//添加数据到集合
	public void addSrc(Integer i) {
		while(true) {
			synchronized (list) {
				//集合没满的适合添加资源
				if(list.size()<10) {
					list.add(i);
					System.out.println("add后集合长度："+list.size());
					return;
				}
			}
		}
	}
	
	//删除集合内的首元素
	public Integer removeSrc() {
		while(true) {
			synchronized (list) {	
				//集合里面有数据
				if(!list.isEmpty()) {
					System.out.println("remove后集合的长度："+(list.size()-1));
					return list.remove(0);
				}
			}
		}
	}
}

//生产者
class Productor extends Thread{
	MyList list;
	static int n = 0;
	public Productor(MyList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("生产了："+n);
			list.addSrc(n);//生产资源
			n++;
		}
	}
}

//消费者
class Consumer extends Thread{
	MyList list;
	public Consumer(MyList list) {
		this.list = list;
	}
	@Override
	public void run() {
		while(true) {
			int n = list.removeSrc();
			System.out.println("消费了"+n);
		}
	}
}

public class PCDemo01 {

	public static void main(String[] args) {
		MyList ml = new MyList();
		//生产者
		Productor p = new Productor(ml);
		Consumer consumer = new Consumer(ml);
		
		p.start();
		consumer.start();
	}

}
