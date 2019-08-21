package basic.day03;

public class OperatorDemo01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println(a / b); // 2
        System.out.println(a % b); // 1

        long l = a + b; // 先计算，然后将结果值转换成long类型

        l = 5L + b; // 先将b由int默认转换成long，然后再进行+运算

        l = Integer.MAX_VALUE + 1;
        System.out.println(l); // 溢出：-2147483648

        l = Integer.MAX_VALUE + 1L;
        System.out.println(l); // 2147483648

        /*
         * +的用法 1）加法 2）正号 3）连接符：将字符串和其他类型的数据连接，返回一个新的字符串
         * 
         */

        System.out.println("hello" + "a" + 1); // helloa1
        System.out.println('a' + 1 + "hello"); // 98hello
        System.out.println("5+5=" + 5 + 5); // 5+5=55
        System.out.println(5 + 5 + "=5+5"); // 5+5=55

    }
}
