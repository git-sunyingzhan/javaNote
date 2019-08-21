package basic.day05;

/**
 * 数组逆序：{1,2,3,4,5}-->{5,4,3,2,1}
 */
public class Test07 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        show(arr);
        System.out.println("\n");
        reverse(arr);
        show(arr);
    }

    private static void reverse(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    private static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}