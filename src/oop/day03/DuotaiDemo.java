package oop.day03;

class KZD {
    String name = "孔子爹";
    int age = 55;

    public void eat() {
        System.out.println("吃大白菜");
    }

    public static void show() {
        System.out.println("fu show");
    }

}

class KZ extends KZD {
    String name = "孔子";
    int age = 25;
    String hobby;

    public void eat() {
        System.out.println("吃猪肉");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }

    public static void show() {
        System.out.println("zi show");
    }
}

/**
 * DuotaiDemo
 */
public class DuotaiDemo {
    public static void main(String[] args) {
        // 多态（父类引用子类对象）
        KZD kzd = new KZ();
        // 访问成员变量
        // 访问的是父类的成员变量
        System.out.println(kzd.name);
        System.out.println(kzd.age);
        // 如果子类有的成员变量而父类没有，不能访问
        // System.out.println(kzd.hobby);

        // 访问成员方法
        // 访问的是子类的成员方法
        kzd.eat();
        // 子类有的成员方法而父类没有的，不能访问
        // kzd.playGame();

        // 访问静态方法
        // 访问的是父类的成员方法，（这是静态方法的重写不是真的重写的原因）
        // 如果静态方法的重写是真的重写，那么应该访问的是子类里面的方法
        kzd.show();

        // 向下转型
        KZ kz = (KZ) kzd;
        kz.playGame();

    }
}