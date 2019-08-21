package oop.day02;

import java.util.Arrays;

/**
 * FinalDemo02
 */
public class FinalDemo02 {

    public static void main(String[] args) {
        // final修饰基本数据类型的局部变量，值不可以改变
        final int num = 20;
        // num = 30;

        // 修饰引用数据类型的局部变量，地址值不可以改变
        final int[] arr = { 1, 2, 3, 4, 5 };
        change(arr);
        System.out.println(Arrays.toString(arr));

        // arr = new int[]{11,22};
    }

    private static void change(int[] arr) {
        arr[0] = 20;
    }
}