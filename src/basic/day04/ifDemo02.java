package basic.day04;

import java.util.Scanner;

//录入年份，判断是否是闰年
public class ifDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = sc.nextInt();
        sc.close();
        // 判断
        // 能被4整除且不能被100整除，或者能被400整除
        if (year % 4 == 0 && year % 100 != 4 || year % 400 == 0) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
