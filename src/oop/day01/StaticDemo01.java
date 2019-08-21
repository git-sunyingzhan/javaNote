package oop.day01;

/**
 * 静态与非静态的访问区别
 */
class Foo {
    int num = 10;
    static int num2 = 20;

    public void show1() {
    }

    public static void show2() {
    }

    // 非静态成员方法可以访问任意成员
    public void function() {
        System.out.println(num);
        System.out.println(num2);
        show1();
        show2();
    }

    // 静态方法只能访问静态成员
    public static void method() {
        // System.out.println(num);
        System.out.println(num2);
        // show1();
        show2();
    }
}

public class StaticDemo01 {

}