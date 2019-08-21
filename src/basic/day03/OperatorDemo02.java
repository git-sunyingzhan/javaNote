package basic.day03;

public class OperatorDemo02 {
    public static void main(String[] args) {
        int a = 1;
        a++;
        System.out.println("a=" + a); // a=2
        --a;
        System.out.println("a=" + a); // a=1

        int b = 0;
        System.out.println("b=" + b); // b=0
        System.out.println("b=" + b++); // a=0
        System.out.println("b=" + b); // b=1

        int x = 1;
        int y = x++ + 2;
        System.out.println("x=" + x + ",y=" + y); // x = 2,y = 3

        x = 1;
        y = ++x + 2;
        System.out.println("x=" + x + ",y=" + y); // x = 2,y = 4

        int m = 10;
        m = m++ + ++m;
        System.out.println(m); // 10 + 12 = 22

    }
}
