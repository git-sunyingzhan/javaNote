package se01.day02.stringbuilder;

public class StringBuilderDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo03();
	}

	//StackOverflowError（栈内存溢出）
	private static void demo02() {
		// TODO Auto-generated method stub
		//死递归
		while(true) {
			demo02();
		}
	}

	//OutofMemoryError(堆栈溢出出错)
	private static void demo01() {
		// TODO Auto-generated method stub
		String s = new String("hello");
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s += "word";
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);//10446

	}
	
	public static void demo03() {
		StringBuilder sbBuilder = new StringBuilder("hello");
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sbBuilder.append("world");
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);//9
	}

}
