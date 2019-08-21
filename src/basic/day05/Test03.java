package basic.day05;

/**
 * 打印输出所有水仙花数
 */
public class Test03 {

    public static void main(String[] args) {
        int sum = 0;// 每位数的立方和
        int last = 0;// 每位上的数
        int num = 0;
        for (int i = 0; i <= 999; i++) {
            sum = 0;
            last = 0;
            num = i;
            // 获取当前三位数的每位上的数
            while (num != 0) {
                last = i % 10;
                num /= 10;
                sum += last * last * last;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}