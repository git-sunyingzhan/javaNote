package basic.day03;

public class OperatorDemo03 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // &
        System.out.println(10 > 10 & 10 < 20); // f
        System.out.println(10 == 10 & 10 < 20); // t

        // |
        System.out.println(10 > 10 | 10 < 20); // t
        System.out.println(10 == 10 | 10 < 20); // t

        // !
        System.out.println(!false); // t
        System.out.println(!true); // f

        // &&
        System.out.println(10 > 10 && 10 < 20); // f
        System.out.println(10 == 10 && 10 < 20); // t

        // ||
        System.out.println(10 > 10 || 10 < 20); // t
        System.out.println(10 == 10 || 10 < 20); // t
    }
}
