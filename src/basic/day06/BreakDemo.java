package basic.day06;

public class BreakDemo {
    public static void main(String[] args) {
        bf: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // 打印10行5列的*图案
                // if(j==5) {
                // break sf;
                // }
                // 打印1行5列的*图案
                if (j == 5)
                    break bf;

                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
