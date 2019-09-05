package se02.day05;

import java.util.ArrayList;
import java.util.List;

/*
 * 熊吃蜂蜜
 * 100只蜜蜂，每只蜜蜂一次可以生产1ml蜜。
 * 现有一个蜜罐，容量为20毫升。熊（2只）等蜜罐装满后吃掉所有的蜜。
 */

class HoneyPool {
	private static int source = 1;
	private static final int MAX_SIZE = 20;
	private List<Integer> list = new ArrayList<Integer>();

	// 生产蜂蜜
	public synchronized void add() {
		//如果
		while (list.size() == MAX_SIZE) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String name = Thread.currentThread().getName();
		//蜜罐没满  添加
		list.add(source);
		System.out.println(name+":生产"+source);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		source++;
		notifyAll();
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//消费蜜
	public synchronized void clear() {
		//当蜜罐没满
		while(list.size()<MAX_SIZE) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String name = Thread.currentThread().getName();
		System.out.println("吃光前，"+list.toString());
		list.clear();
		System.out.println(name+":消费后"+list.toString());
		notifyAll();
	}

}

//蜜蜂
class Bee extends Thread{
	private HoneyPool hp;
	public Bee(String name,HoneyPool hp) {
		super(name);
		this.hp = hp;
	}
	@Override
	public void run() {
		while(true) {
			hp.add();
		}
	}
}

//熊
class Bear extends Thread{
	private HoneyPool hp;
	public Bear(String name,HoneyPool hp) {
		super(name);
		this.hp = hp;
	}
	@Override
	public void run() {
		while(true) {
			hp.clear();
		}
	}
}

public class Test02 {

	public static void main(String[] args) {
		HoneyPool hp = new HoneyPool();
		for (int i = 0; i < 100; i++) {
			Bee bee = new Bee("蜜蜂"+i,hp);
			bee.start();
		}
		Bear bear = new Bear("熊大", hp);
		Bear bear2 = new Bear("熊二", hp);
		bear.start();
		bear2.start();
	}

}
