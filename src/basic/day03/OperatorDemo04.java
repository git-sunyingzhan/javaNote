package basic.day03;

public class OperatorDemo04 {
    public static void main(String[] args) {
        int a = 10; // 将10赋值给一个int类型的变量a

        // 复合赋值运算符

        a += 2;
        System.out.println(a); // 12

        short s = 3;
        s += 2; // 等价于 s = (s的数据类型)（s+2）
        System.out.println(s); // 5

        a = 1;
        a += 2.8; // a = (int)3.9=8 double转int,向下取整
        System.out.println(a); // 3

        short sh = 5;
        sh /= 2.0; // sh = (short)(sh/2.0)
        System.out.println(sh); // 2

        System.out.println(5 / 2.0); // 2.5
        System.out.println(5 / 2); // 2
    }
}
