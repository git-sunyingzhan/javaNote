package oop.day03.animal;

/**
 * Cat
 */
public class Cat extends Animal {

    private char gender;

    public Cat(String name, int age, char gender) {
        super(name, age);
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // 重写eat
    public void eat() {
        System.out.println("吃鱼");
    }

    // 重写sleep
    public void sleep() {
        System.out.println("蜷缩着睡");
    }

    // 重写show
    public void show() {
        super.show();// 调用父类的show()
        System.out.println("gender:" + gender);
    }

    // 捉老鼠
    public void catchMouse() {
        System.out.println("捉老鼠");
    }

}