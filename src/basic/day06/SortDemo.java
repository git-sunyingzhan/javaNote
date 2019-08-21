package basic.day06;

import java.util.Arrays;

public class SortDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 3, 4, 2, 5, 1 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        // TODO Auto-generated method stub
        // i:比较的轮次
        for (int i = 0; i < arr.length - 1; i++) {
            // j:比较的次数;前面比较元素的下标
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 相邻两个元素进行比较，大的往后放
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
