package oop.day02;

/**
 * ExtendsTest03
 */

class X {
    Y y = new Y();

    X() {
        System.out.println("x");
    }
}

class Y {
    Y() {
        System.out.println("y");
    }
}

class Z extends X {
    Y y = new Y();

    Z() {
        System.out.println("z");
    }

    public static void main(String[] args) {
        new Z();// y x y z
    }
}
