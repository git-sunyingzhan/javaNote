package se02.day04;

//票池
class TicketPool{
	private int tickets;
	public TicketPool(int tickets) {
		this.tickets = tickets;
	}
	//打印票号
	public synchronized int printTicketNo() {
		return tickets--;
	}
}

class SellTicket04 implements Runnable {
	private TicketPool tp;
	public SellTicket04(TicketPool tp) {
		this.tp = tp;
	}
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while(true) {
			//取票
			int tickNo = tp.printTicketNo();
			
			if(tickNo>0) {
				System.out.println(name+"售出第"+tickNo+"张票");
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
	
}

public class ThreadDemo04 {

	public static void main(String[] args) {
		TicketPool tp = new TicketPool(100);
		Runnable target = new SellTicket04(tp);
		
		Thread t1 = new Thread(target,"窗口1");
		Thread t2 = new Thread(target,"窗口2");
		Thread t3 = new Thread(target,"窗口3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
