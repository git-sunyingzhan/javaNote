package se02.day01;

import java.util.Scanner;

class ScoreException extends RuntimeException{
	public ScoreException() {
		super();
	}
	//通过一个异常信息构造一个异常现象
	public ScoreException(String message) {
		super(message);
	}
}

class Teacher{
	public static void check(int score) {
		if(score<0||score>100) {
//			throw new ScoreException("分数只能在0～100");
			throw new RuntimeException("分数只能在0～100");
		}else {
			System.out.println(score);
		}
	}
}

public class MyexceptionDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Teacher t = new Teacher();
		t.check(sc.nextInt());
	}

}
