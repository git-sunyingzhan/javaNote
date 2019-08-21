package oop.day02;

/**
 * ExtendsTest02
 */
class Fu03 {
    static {
        System.out.println("静态代码块fu");
    }
    {
        System.out.println("构造代码块fu");
    }

    public Fu03() {
        System.out.println("构造方法fu");
    }
}

class Zi03 extends Fu03 {
    static {
        System.out.println("静态代码块zi");
    }
    {
        System.out.println("构造代码块zi");
    }

    public Zi03() {
        System.out.println("构造方法zi");
    }

    public void show() {

    }
}

public class ExtendsTest02 {

    public static void main(String[] args) {
        new Zi03();
    }
}