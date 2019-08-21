package oop.day02;

/**
 * ExtendsTest01
 */

class Fu02 {
    public int num = 10;

    public Fu02() {
        System.out.println("fu");
    }
}

class Zi02 extends Fu02 {
    public int num = 20;

    public Zi02() {
        System.out.println("zi");
    }

    public void show() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}

public class ExtendsTest01 {

    public static void main(String[] args) {
        Zi02 zi = new Zi02();
        zi.show();
    }
}