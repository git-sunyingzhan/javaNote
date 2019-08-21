package basic.day06;

/*
 * 二分法查找，查找指定元素在指定数组的索引值
 */
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index = binarySearch(arr, 10);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int ele) {
        // TODO Auto-generated method stub
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;
        while (arr[mid] != ele) {
            if (ele < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
            mid = (min + max) / 2;
            // 如果指定ele不在数组中
            if (min > max) {
                return -1;
            }
        }
        return mid;
    }
}
