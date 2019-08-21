package basic.day06;

import java.util.Arrays;

public class ArgsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("change前，a=" + a + ",b=" + b);
        change(a, b);
        System.out.println("change后，a=" + a + ",b=" + b);

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("change前，arr=" + Arrays.toString(arr));
        change(arr);
        System.out.println("change后，arr=" + Arrays.toString(arr));
    }

    private static void change(int[] arr) {
        // TODO Auto-generated method stub
        arr[0] = 10;
    }

    private static void change(int a, int b) {
        // TODO Auto-generated method stub
        int temp = a;
        a = b;
        b = temp;
    }
}
