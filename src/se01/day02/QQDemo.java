package se01.day02;

import java.util.Scanner;

/*
 * 校验QQ号码
 * 1）长度只能5～15位
 * 2）不能以0开头
 * 3）都是数字
 */
public class QQDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String qq = "12124324";
		boolean bool = check(qq);
		System.out.println(bool);
		Scanner sc = new Scanner(System.in);
		qqCheck(sc);
	}

	private static void qqCheck(Scanner sc) {
		// TODO Auto-generated method stub
		String qqNumber;
		System.out.println("检查QQ号码格式，输入exit退出。");
		while(true) {
			System.out.println("请输入QQ号码：");
			qqNumber =  sc.next();
			if (qqNumber.equals("exit")) {
				System.out.println("结束！");
				break;
			}
			if(qqNumber.length()<5||qqNumber.length()>15) {
				System.out.println("QQ号码长度在5～15之间。");
				continue;
			}
			if(qqNumber.charAt(0)=='0') {
				System.out.println("不能以0开头！");
				continue;
			}
			for (int i = 0; i < qqNumber.length(); i++) {
				if(qqNumber.charAt(i)<'0'||qqNumber.charAt(i)>'9') {
					System.out.println("必须全部是数字！");
					continue;
				}
			}
			System.out.println("QQ号码格式正确！");
			
		}
	}
	
	public static boolean check(String qq) {
		String regex = "[1-9]\\d{4,14}";
		
		return qq.matches(regex);
	}

}
