package oop.day03.animal;

/**
 * Pig
 */
public class Pig extends Animal {

    public Pig() {
    }

    public Pig(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃糠");
    }

    @Override
    public void sleep() {
        System.out.println("躺着睡");
    }

    public void gdc() {
        System.out.println("拱大白菜");
    }

}