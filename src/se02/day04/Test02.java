package se02.day04;

import java.util.ArrayList;
import java.util.List;

/*
 * 熊吃蜂蜜
 * 100只蜜蜂，每只蜜蜂一次可以生产1ml蜜。
 * 现有一个蜜罐，容量为20毫升。熊（2只）等蜜罐装满后吃掉所有的蜜。
 */

//蜜罐
class Honeypt {
	// 蜜罐最大容量
	static final int MAX_CAPACITY = 20;
	// 蜜罐
	List<Boolean> honeypt = new ArrayList<Boolean>();
	// 蜜蜂
	Bee[] bees = null;
	// 熊
	Bear[] bears = null;

	public Honeypt() {

	}

	public Honeypt(Bee[] bees, Bear[] bears) {
		this.bees = bees;
		this.bears = bears;
	}

	public Bee[] getBees() {
		return bees;
	}

	public void setBees(Bee[] bees) {
		this.bees = bees;
	}

	public Bear[] getBears() {
		return bears;
	}

	public void setBears(Bear[] bears) {
		this.bears = bears;
	}

	// 添加蜂蜜
	public synchronized void addHoney() {
		// 如果蜜罐没有满
		if (honeypt.size() < MAX_CAPACITY) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			honeypt.add(true);
			System.out.println(Thread.currentThread() + "向蜜罐里面添加了1ml蜂蜜。现在有" + honeypt.size() + "蜂蜜。");
			try {
				bears.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			// 如果蜜罐满了
			System.out.println("蜜罐满了，蜜蜂们等一会再添加。熊大熊二开吃了。");
			// 通知熊准备吃
			bears.notifyAll();
			
			// 通知蜜蜂等待生产
			try {
				for (Bee bee : bees) {
					bee.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// 吃蜂蜜
	public synchronized void eatHoney() {
		if (honeypt.size() == MAX_CAPACITY) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			honeypt.clear();
			// 通知蜜蜂准备生产
			bees.notifyAll();
			// 通知熊等待吃蜜蜂
			try {
				for (Bear bear : bears) {
					bear.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread() + "吃光了蜂蜜。");
		}
	}

}

//蜜蜂
class Bee extends Thread {
	Honeypt honeypt;

	public Bee(String name, Honeypt honeypt) {
		super(name);
		this.honeypt = honeypt;
	}

	@Override
	public void run() {
		while (true) {
			honeypt.addHoney();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//熊
class Bear extends Thread {
	Honeypt honeypt;

	public Bear(String name, Honeypt honeypt) {
		super(name);
		this.honeypt = honeypt;
	}

	@Override
	public void run() {
		while (true) {
			honeypt.eatHoney();
		}
	}
}

public class Test02 {

	public static void main(String[] args) {
		// 创建蜜罐
		Honeypt honeypt = new Honeypt();
		// 创建蜜蜂
		Bee[] bees = new Bee[100];
		for (int i = 0; i < 100; i++) {
			bees[i] = new Bee("蜜蜂" + i, honeypt);
		}
		// 创建熊
		Bear[] bears = new Bear[2];
		bears[0] = new Bear("熊大", honeypt);
		bears[1] = new Bear("熊二", honeypt);

		honeypt.bees = bees;
		honeypt.bears = bears;

		Thread[] t = new Thread[102];
		for (int i = 0; i < 100; i++) {
			t[i] = bees[i];
		}
		t[100] = bears[0];
		t[101] = bears[1];

		for (Thread thread : t) {
			thread.start();
		}

	}
}
