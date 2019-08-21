package oop.day02;

/**
 * ExtendsDemo03
 */
class Fu {
    public void dc() {
        System.out.println("骑三轮车");
    }

    public static void method() {
        System.out.println("fu static");
    }
}

class Zi extends Fu {
    public void dc() {
        System.out.println("开四咕噜的车");
    }

    // 不是重写
    public static void method() {
        System.out.println("zi static");
    }
}

public class ExtendsDemo03 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.dc();

        Zi.method();
    }
}