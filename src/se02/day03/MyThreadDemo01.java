package se02.day03;

/*
 * 线程的实现方式一
 */
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+"-"+i);
		}
	};
}
public class MyThreadDemo01 {

	public static void main(String[] args) {
		MyThread name1 = new MyThread("线程1");
		MyThread name2 = new MyThread("线程2");
		MyThread name3 = new MyThread("线程3");
		
//		name1.run();
//		name2.run();
//		name3.run();
		
		//先启动线程，然后由JVM调用run()
		name1.start();
		name2.start();
		name3.start();
		
		
	}

}
