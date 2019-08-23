package se01.day01.scannerTest;

import java.util.Scanner;

/**
 * ScannerDemo02
 */
public class ScannerDemo02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个int数据：");
        int n1 = sc.nextInt();
        System.out.println("请再输入一个int数据：");
        int n2 = sc.nextInt();
        System.out.println("请输入一个String数据：");
        // 接收的是‘\r’
        // 解决方案
        // 1）先录入字符串，再录入int
        // 2）再new一个新的Scanner对象，负责录入String数据
        String s = sc.nextLine();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(s);

    }
}