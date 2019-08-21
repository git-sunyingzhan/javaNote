package basic.day04;

import java.util.Scanner;

//输入成绩，输出等级    0~59D   60~79C   80~89B    99~100A（switch）
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = sc.nextInt();
        sc.close();

        if (score < 0 || score > 100) {
            System.out.println("输入成绩有误！");
            return;
        }

        int temp = score / 10;

        switch (temp) {
        case 10:
            System.out.println("A");
            break;
        case 9:
            System.out.println("A");
            break;
        case 8:
            System.out.println("B");
            break;
        case 7:
            System.out.println("C");
            break;
        case 6:
            System.out.println("C");
            break;
        default:
            System.out.println("D");
            break;
        }

    }
}
