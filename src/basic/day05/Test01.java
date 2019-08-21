package basic.day05;

/**
 * 打印输出如下图案 * ** *** **** *****
 */
public class Test01 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}