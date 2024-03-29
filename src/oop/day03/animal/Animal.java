package oop.day03.animal;

/**
 * 抽象父类
 */
public abstract class Animal {

    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 抽象方法
    public abstract void eat();

    public abstract void sleep();

    public void show() {
        System.out.println("name=" + name + ",age=" + age);
    }

}