package basic.day04;

import java.util.Scanner;

//控制台录入两个整数，按照由大到小顺序输出
public class ifDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        // 补齐下面代码
        if (a < b) {
            // 实现两个变量的值相互交换
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a + "," + b);

    }
}
