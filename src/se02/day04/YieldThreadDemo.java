package se02.day04;

class MyYield extends Thread{
	public MyYield(String name) {
		super(name);
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+"-"+i);
			Thread.yield();
		}
	}
}
public class YieldThreadDemo {

	public static void main(String[] args) {
		MyYield ms1 = new MyYield("线程1");
		MyYield ms2 = new MyYield("线程2");
		
		ms1.start();
		ms2.start();
	}

}
