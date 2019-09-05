package se02.day05;

/*
 * 猴子摘若干桃子，当即吃了一般，感觉不过瘾，又多吃了一个，
 * 第二天把剩下的桃子吃了一半零一个，以后每天都这样吃，到第十天发现只剩下一个桃子，求第一天小猴子一共摘了多少桃子
 */
public class Test01 {

	public static void main(String[] args) {
		int count = 1;
		for (int i = 0; i < 10; i++) {
			count = count*2+1;
		}
		System.out.println(count);
	}

}
