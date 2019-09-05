package se02.day05;

/*
 * 多线程匿名内部类使用
 */
public class ThreadDemo {

	public static void main(String[] args) {
		//方式一
		Thread t1 = new Thread("线程1") {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(getName()+"--"+i);
				}
			}
		};
		
		//方式二
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+"--"+i);
				}
			}
		},"线程2");
		
		t1.start();
		t2.start();
	}

}
