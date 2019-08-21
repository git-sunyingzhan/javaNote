package basic.day05;

/**
 * y = 3x + 2
 */
public class FunctionDemo01 {

    public static void main(String[] args) {
        int x = 4;
        // 这里的x称为实际参数（实参），需要定义具体值
        int y = getY(x);
        System.out.println(y);
    }

    // 这里的x称为形式参数（形参），之规定参数的个数和类型
    private static int getY(int x) {
        return 3 * x + 2;
    }
}