package oop.day02;

final class Foo {
}

// final修饰类，类不可以被继承
// class FooSon extends Foo{}

class Demo {
    int num = 10;
    // final修饰成员变量，变量变成了常量
    final int fnum = 20;
    // 常量一般用大写表示，多个单词用下划线隔开
    // 开发中，常量一般和static一起使用
    public final static int MAX_VALUE = 100;
    public static final int MIN_VALUE = 1; // 推荐

    // final修饰成员方法
    // 子类不可以重写父类中被final修饰的方法
    final public void show() {
        System.out.println("fu show");
    }
}

class DemoSon extends Demo {
    // public void show() {
    // System.out.println("zi show");
    // }
}

/**
 * FinalDemo01
 */
public class FinalDemo01 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.num = 20;
        // d.fnum = 30;
    }
}