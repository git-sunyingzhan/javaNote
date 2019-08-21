package oop.day02;

/**
 * ExtendsDemo01
 */

class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println("吃");
    }

    public void show() {
        System.out.println("name=" + name + ",age=" + age);
    }
}

// 子类继承父类，可以使用父类里面的属性和行为
class Cat extends Animal {
    public Cat() {
        this.name = "猫";
    }
}

class Dog extends Animal {

}

public class ExtendsDemo01 {
    public static void main(String[] args) {
        Cat c = new Cat();
        // c.name = "花花";
        c.age = 1;
        c.show();
        c.eat();
        Dog d = new Dog();
        d.name = "小灰";
        d.age = 2;
        d.show();
        d.eat();
    }
}