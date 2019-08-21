package basic.day05;

/**
 * FunctionDemo02
 */
public class FunctionDemo02 {

    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
        System.out.println(getSum(1.3, 1.2));
    }

    private static double getSum(double d, double e) {
        return d + e;
    }

    private static int getSum(int i, int j) {
        return i + j;
    }
}