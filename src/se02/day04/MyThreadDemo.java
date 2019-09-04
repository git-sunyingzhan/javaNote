package se02.day04;
//多线程的实现方式二：
class RunnableImpl implements Runnable{
	
	public RunnableImpl() {
		super();
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
	
}
public class MyThreadDemo {

	public static void main(String[] args) {
		//创建两个线程对象
		Thread t1 = new Thread(new RunnableImpl(), "线程1");
		Thread t2 = new Thread(new RunnableImpl(), "线程2");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
