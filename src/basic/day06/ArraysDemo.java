package basic.day06;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 2, 4 };
        // toString()
        System.out.println(Arrays.toString(arr)); // [3, 1, 5, 2, 4]
        // sort();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
        // binarySearch();
        System.out.println(Arrays.binarySearch(arr, 3));
        // equals();
        char[] chs1 = { 'b', 'b', 'a' };
        char[] chs2 = { 'b', 'b', 'a' };
        char[] chs3 = chs1;
        // 比较两个对象是否相等
        System.out.println(Arrays.equals(chs1, chs2));
        System.out.println(Arrays.equals(chs1, chs3));
        // == 比较两个对象地址值是否相等
        System.out.println(chs1 == chs2);
        System.out.println(chs1 == chs3);

        int[] srcArr = { 1, 2, 3, 4 };
        int[] destArr = { 5, 6, 7, 8 };
        System.arraycopy(srcArr, 1, destArr, 2, 2);
        System.out.println(Arrays.toString(destArr));

        // fill
        double[] dArr = { 1.1, 2.2, 3.3 };
        Arrays.fill(dArr, 1.5);
        System.out.println(Arrays.toString(dArr));

    }
}
