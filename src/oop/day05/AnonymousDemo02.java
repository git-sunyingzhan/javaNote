package oop.day05;

/**
 * 匿名内部类在开发中的用法
 */

interface Person {
    void study();
}

class Tool {
    public static void show(Person p) {
        p.study();
    }
}

// class PersonImpl implements Person{

// @Override
// public void study() {

// }

// }

public class AnonymousDemo02 {
    public static void main(String[] args) {
        Tool.show(new Person() {

            @Override
            public void study() {
                System.out.println("学Java");
            }
        });
    }
}