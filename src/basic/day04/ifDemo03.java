package basic.day04;

import java.util.Scanner;

//输入成绩，输出等级    0~59D   60~79C   80~89B    99~100A
public class ifDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score = sc.nextInt();
        sc.close();

        if (score < 0 || score > 100) {
            System.out.println("成绩输入有误！");
            return; // 结束方法
        }

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
