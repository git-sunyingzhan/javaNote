package oop.dya04.animal;

/**
 * AnimalTest
 */
public class AnimalTest {

    public static void main(String[] args) {
        Animal a = new Dog("大黄", 2);
        a.eat();
        Dog d = (Dog) a;

        Animal a2 = new GuideDog("小白", 1);
        a2.eat();
        GuideDog gd = (GuideDog) a2;
        gd.lookDoor();
        gd.guide();

        // 接口引用指向实现类对象（多态）
        Skill skill = new GuideDog("旺财", 3);
        skill.guide();
    }
}