package se01.day03;

/*
 * 随机获取一个0到100随机小数，
 * 保留两位小数
 */
public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f1 = Math.round(Math.random()*10000);
		double f = f1/100.0;
		System.out.println(f1);
		System.out.println(f);
	}

}
