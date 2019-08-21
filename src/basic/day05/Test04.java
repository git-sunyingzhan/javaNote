package basic.day05;

/**
 * 有一对兔子，从第三个月开始生1对小兔子，小兔子也从第三个月开始生小兔子 问n（n>0）个月后一共有多少对兔子
 * 
 */
public class Test04 {

    public static void main(String[] args) {
        int a = 36;
        System.out.println(getSum(a));
    }

    private static int getSum(int a) {
        if (a == 1 || a == 2) {
            return 1;
        }
        // 从前两个月的兔子数
        int m1 = 1;
        int m2 = 1;
        int sum = 0;
        for (int i = 3; i <= a; i++) {
            // 从第三个月开始，兔子数是前两个月之和
            sum = m1 + m2;
            m1 = m2;
            m2 = sum;
        }

        return sum;
    }
}