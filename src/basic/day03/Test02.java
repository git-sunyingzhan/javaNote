package basic.day03;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入三位数整数：");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        sc.close();
        int ge = sum % 10;
        int shi = sum / 10 % 10;
        int bai = sum / 100 % 10;
        System.out.println("百位：" + bai);
        System.out.println("十位：" + shi);
        System.out.println("个位：" + ge);

        // 方式1
        int max = (ge > shi ? ge : shi) > bai ? (ge > shi ? ge : shi) : bai;
        System.out.println("最大值：" + max);
        // 方式2
        max = ge > shi && ge > bai ? ge : (shi > bai ? shi : bai);
        System.out.println("最大值：" + max);
    }
}
