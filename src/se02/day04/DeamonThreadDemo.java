package se02.day04;

import java.util.Date;

class KTVRoom extends Thread{
	private String no;
	private int time;
	
	public KTVRoom(String no,int time) {
		this.no = no;
		this.time = time;
	}
	
	@Override
	public void run() {
		System.out.println(no+"房间有人在唱歌。");
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(no+"房间客人买单。");
	}
}

class Waiter extends Thread{
	@Override
	public void run() {
		//每隔一秒报一次时间
		while(true) {
			System.out.println(new Date());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class DeamonThreadDemo {

	public static void main(String[] args) {
		KTVRoom r = new KTVRoom("no1",5000);
		Waiter w = new Waiter();
		
		//设置守护线程
		w.setDaemon(true);
		r.start();
		w.start();
		
		
	}

}
