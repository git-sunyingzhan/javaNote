package se02.day04;

import java.util.ArrayList;
import java.util.List;

//该案例出现了多线程的死锁
class MyList2{
	private static final int MAX_SIZE = 1;
	private List<Integer> list = new ArrayList<>();
	//添加数据
	public synchronized void addSrc(Integer i) {
		//如果集合满了,等待消费者消费
		while(list.size()==MAX_SIZE) {
			try {
				this.wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		list.add(i);
		System.out.println("生产后：list.size"+list.size());
		this.notify();
	}
	
	//删除数据
	public synchronized Integer removeSrc() {
		//如果集合为空，等待生产者生产数据
		while(list.isEmpty()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//如果有数据，消费资源
		int n = list.remove(0);
		System.out.println("消费后：list.size"+list.size());
		this.notify();
		return n;
	}
}

//生产者
class Productor2 extends Thread{
	MyList2 list;
	static int n = 0;
	public Productor2(String name,MyList2 list) {
		super(name);
		this.list = list;
	}
	
	@Override
	public void run() {
		while(true) {
			list.addSrc(n);//生产资源
			System.out.println(getName()+"生产了："+n);
			n++;
		}
	}
}

//消费者
class Consumer2 extends Thread{
	MyList2 list;
	public Consumer2(String name,MyList2 list) {
		super(name);
		this.list = list;
	}
	@Override
	public void run() {
		while(true) {
			int n = list.removeSrc();
			System.out.println(getName()+"消费了"+n);
		}
	}
}
public class PCDemo02 {

	public static void main(String[] args) {
		MyList2 list = new MyList2();
		
		Productor2 p = new Productor2("生产1号", list);
		Consumer2 c = new Consumer2("生产1号", list);
		
		p.start();
		c.start();
	}

}
