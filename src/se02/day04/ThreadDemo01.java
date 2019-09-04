package se02.day04;

/*
 * 三个售票窗口，一共100张，模拟卖票操作
 */

class SellTicket extends Thread {
	static int tickets = 100;// 100张票

	//	锁对象，所有线程共享同一锁对象
	private static Object object = new Object();

	public SellTicket(String name) {
		super(name);
	}

	public void run() {
		// 同步代码快
		while (true) {
			//取票
			int tickNo = getTicket();
			if(tickNo>0) {
				System.out.print(getName()+"售出的第"+tickNo+"张票");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				return;
			}
		}
	}

	//取票
	private int getTicket() {
		//同步代码快
		synchronized (object) {
			return tickets--;
		}
	}
	
}

public class ThreadDemo01 {

	public static void main(String[] args) throws InterruptedException {
		SellTicket st1 = new SellTicket("窗口1");
		SellTicket st2 = new SellTicket("窗口2");
		SellTicket st3 = new SellTicket("窗口3");

		st1.start();
		st2.start();
		st3.start();
	}

}
