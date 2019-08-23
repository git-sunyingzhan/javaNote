package se01.day01.scannerTest;

import java.util.Scanner;

/**
 * ScannerDemo01
 */
public class ScannerDemo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println(a);
        } else {
            System.out.println("你眼瞎阿");
        }
        sc.close();
    }
}