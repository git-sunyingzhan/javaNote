package basic.day05;

/**
 * 求数组内元素的最大值和最小值
 */
public class Test06 {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 2 };
        boolean a = true;
        getSum(arr, a);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static void getSum(int[] arr, boolean a) {
        if (a) {
            System.out.println(getMax(arr));
        } else {
            System.out.println(getMin(arr));
        }
    }
}