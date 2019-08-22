package oop.day04.animal;

/**
 * Dog
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    public void lookDoor() {
        System.out.println("看门");
    }
}