package oop.day04;

interface Inter05 {
    void show();

    public static void show2() {
    }// 静态方法

    default void method() {
        // temp();
    }

    default void fun() {
        // temp();
        System.out.println("java");
    }

    // jdk1.9 接口中引入了私有方法
    // private void temp() {
    // System.out.println("hello");
    // System.out.println("world");
    // }
}