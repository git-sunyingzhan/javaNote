package basic.day05;

/**
 * 有一对兔子，从第三个月开始生1对小兔子，小兔子也从第三个月开始生小兔子 问n（n>0）个月后一共有多少对兔子
 * 
 */
public class Test05 {

    public static void main(String[] args) {
        int a = 36;
        System.out.println(getSum(a));
    }

    private static int getSum(int a) {
        if (a == 1 || a == 2) {
            return 1;
        }
        int[] arr = new int[a];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[arr.length - 1];
    }
}