package se02.day04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SellTicket03 implements Runnable{

	private static int tickets = 100;
	private Lock lock = new ReentrantLock();
	
	@Override
	public void run() {
		//当前线程对象的名称
		String name = Thread.currentThread().getName();
		while(true) {
			lock.lock();
			if(tickets>0) {
				System.out.println(name+"售出的第"+tickets+"张票。");
			}else {
				return;
			}
			lock.unlock();
		}
	}
	
}
public class ThreadDemo03 {

	public static void main(String[] args) {
		Runnable target = new SellTicket03();
		
		Thread t1 = new Thread(target,"窗口1");
		Thread t2 = new Thread(target,"窗口2");
		Thread t3 = new Thread(target,"窗口3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
