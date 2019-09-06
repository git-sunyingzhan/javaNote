package se02.day06.jdk8;


public class LambdaDemo01 {

	public static void main(String[] args) {
		demo02();
	}

	//通过Lambda表达式实现多线程
	private static void demo02() {
		new Thread(()->{System.out.println("多线程任务");}).start();
	}

	//匿名内部类实现多线程
	private static void demo01() {
		Runnable target = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("多线程任务。");
			}
		};
		new Thread(target).start();
	}

}
