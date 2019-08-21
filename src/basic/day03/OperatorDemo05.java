package basic.day03;

import java.util.Scanner;

public class OperatorDemo05 {
    public static void main(String[] args) {
        // int a = 10;
        // int b = a > 10 ?1+2:3+4;
        // System.out.println(b);

        // 控制台录入商品的总数count，和每页商品的个数size，输出页数pages
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品总数：");
        int count = sc.nextInt();
        System.out.println("请输入每页商品的个数：");
        int size = sc.nextInt();

        int pages = count % size == 0 ? count / size : count / size + 1;

        System.out.println("一共有：" + pages + "页商品。");
        sc.close();
    }
}
