package oop.day05;

interface Inter {
    void show1();

    void show2();
}

// class InterImpl implements Inter {

// @Override
// public void show1() {
// System.out.println("show1");
// }

// @Override
// public void show2() {
// System.out.println("show2");
// }

// }

class Outter {
    void fun() {
        // 匿名内部类
        Inter i = new Inter() {
            @Override
            public void show1() {
                System.out.println("abc");
            }

            @Override
            public void show2() {
                System.out.println("aba");
            }
        };
        i.show1();
        i.show2();
    }
}

public class AnonymousDemo01 {

    public static void main(String[] args) {
        // InterImpl i = new InterImpl();
        // i.show1();
        // i.show2();

        new Outter().fun();
    }
}