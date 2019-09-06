package se02.day06.jdk8;

import java.util.Arrays;
import java.util.Comparator;

public class LamdbaDemo06 {

	public static void main(String[] args) {
		startThread(()->System.out.println("多线程任务"));
		
		String[] arr = {"Tom","jerry","Tony"};
		Arrays.sort(arr,compare());
		System.out.println(Arrays.toString(arr));
	}
	
	//Lamdba作为参数
	public static void startThread(Runnable target) {
		new Thread(target).start();
	}
	
	//Lamdba作为返回值
	public static Comparator<String> compare(){
		return (a,b)->a.compareTo(b);
	}
}
