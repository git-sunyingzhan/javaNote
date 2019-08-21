package oop.day03.animal;

/**
 * AnimalTest
 */
public class AnimalTest {

    public static void main(String[] args) {
        // 抽象类不可以实例化
        // Animal a = new Animal();

        // Animal a = new Cat("小花", 1, '母');
        // a.show();
        // a.eat();
        // a.sleep();

        // a = new Cat("小白", 2, '母');
        // a.show();
        // a.eat();
        // a.sleep();

        // a = new Dog("小黄", 2, '公');
        // a.show();
        // a.eat();
        // a.sleep();

        // AnimalTool.showCat(new Cat("小花", 1, '母'));
        // AnimalTool.showDog(new Dog("小黄", 2, '公'));

        Cat c = new Cat("小花", 1, '母');
        AnimalTool.showAnimal(c);
        c.catchMouse();

        Animal a = new Dog("小黄", 2, '公');
        AnimalTool.showAnimal(a);
        Dog d = (Dog) a;
        d.lookDoor();
    }
}