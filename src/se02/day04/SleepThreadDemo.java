package se02.day04;

class MySleep extends Thread{
	public MySleep(String name) {
		super(name);
	}
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+"-"+i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName()+"--"+"next");
		}
	}
}

public class SleepThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MySleep ms1 = new MySleep("线程1");
		MySleep ms2 = new MySleep("线程2");
		
		ms1.start();
		ms1.join();
		ms2.start();
	}

}
