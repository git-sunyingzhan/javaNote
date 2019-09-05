package se02.day05;

import java.util.Timer;
import java.util.TimerTask;

class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("光头强又来砍树啦。。。。");
	}

}

public class TimerDemo {

	public static void main(String[] args) {
		// 创建定时器
		Timer t = new Timer();
//		t.schedule(new MyTimerTask(), 2000);
//		t.cancel();
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("光头强又来砍树啦。。。。");
			}
		}, 2000, 3000);
	}

}
