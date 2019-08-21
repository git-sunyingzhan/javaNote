package basic.day06;

import java.util.Arrays;

public class SortDemo1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 3, 4, 2, 5, 1 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 选择排序
    public static void bubbleSort(int[] arr) {
        // TODO Auto-generated method stub
        // i:比较的轮次；前面需要比较元素下标
        for (int i = 0; i < arr.length - 1; i++) {
            // j:比较的次数;前面比较元素的下标
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 相邻两个元素进行比较，小的往前放
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
