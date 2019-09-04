package se02.day04;

class SellTicket02 implements Runnable{

	private static int tickets = 100;
	
	@Override
	public void run() {
		//当前线程对象的名称
		String name = Thread.currentThread().getName();
		while(true) {
			int tickNo = getTicket();//取票
			if(tickNo>0) {
				System.out.println(name+"售出的第"+tickNo+"张票");
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

	//	取票(同步代码块)
	private synchronized int getTicket() {
		return tickets--;
	}
	
}
public class ThreadDemo02 {

	public static void main(String[] args) {
		Runnable target = new SellTicket02();
		
		Thread t1 = new Thread(target,"窗口1");
		Thread t2 = new Thread(target,"窗口2");
		Thread t3 = new Thread(target,"窗口3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
