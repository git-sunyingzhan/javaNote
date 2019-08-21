package oop.day01;

class Doo {
    int num = 10;
    static int num2 = 20;

    public void show() {
        System.out.println("非静态方法");
    }

    public static void method() {
        System.out.println("静态方法");
    }
}

/**
 * 静态的访问方式
 */
public class StaticDemo02 {

    public static void main(String[] args) {
        Doo doo = new Doo();
        System.out.println(doo.num);
        // System.out.println(doo.num2);
        doo.show();
        // doo.method();

        // 静态成员需要通过静态的方式来访问
        System.out.println(Doo.num2);
        Doo.method();
    }
}