package basic.day03;

public class Test01 {
    public static void main(String[] args) {
        int a = 2;
        a = a++ + a + ++a + --a - a - a++ + a + --a + a++ + --a + a + a++ + a;
        System.out.println(a); // 29

    }
}
