package basic.day05;

/**
 * 打印输出如下图案 * ** *** **** *****
 */
public class Test02 {

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + "+" + i + "=" + (i * j) + " ");
            }
            System.out.print("\n");
        }
    }
}