package oop.day03.animal;

/**
 * Dog
 */
public class Dog extends Animal {

    private char gender;

    public Dog() {
    }

    public Dog(String name, int age, char gender) {
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
        System.out.println("啃骨头");
    }

    // 重写sleep
    public void sleep() {
        System.out.println("侧着睡");
    }

    // 重写show
    public void show() {
        super.show();// 调用父类的show()
        System.out.println("gender:" + gender);
    }

    // 捉看家
    public void lookDoor() {
        System.out.println("看门");
    }

}