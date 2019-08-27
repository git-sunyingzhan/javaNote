package se01.day03;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//以默认种子创建Random
		//Random r = new Random();
		
		//以指定种子创建Random
		Random r = new Random(1008611);
		
		//生成10个[1,100]随机数
		for (int i = 0; i < 10; i++) {
			int n = r.nextInt(100)+1;
			System.out.println(n);
		}
	}

}
