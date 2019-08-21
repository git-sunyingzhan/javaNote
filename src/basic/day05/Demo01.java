package basic.day05;

/**
 * 打印输出四行五列的*图案 ***** ***** ***** *****
 */
public class Demo01 {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            // 在同一行打印输出五个*
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}