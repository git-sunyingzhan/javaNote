package oop.day05;

class Outer {
    static int num1 = 10;
    int num2 = 20;

    // 静态成员内部类
    static class Inner {
        public void show() {
            System.out.println(num1);
            // System.out.println(num2);
        }

        public static void fun() {
            System.out.println(num1);
            // System.out.println(num2);
        }
    }
}

/**
 * InnerDemo03
 */
public class InnerDemo03 {

    public static void main(String[] args) {
        // 创建静态成员内部类对象
        Outer.Inner oi = new Outer.Inner();
    }
}