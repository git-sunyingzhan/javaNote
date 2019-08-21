package oop.day02;

/**
 * ExtendsDemo02
 */

class Father {
    String name;
    private int age;

    // public Father() {

    // }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // setter/getter
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("吃");
    }

    private void sleep() {
        System.out.println("睡");
    }

    public void show() {
        System.out.println("name=" + name + ",age=" + age);
    }
}

class Son extends Father {
    /**
     * Son()
     */

    public Son() {
        // 子类构造会默认调用父类的无参构造
        super("name", 123);
    }

    public Son(String name, int age) {
        // this.name = name;
        // this.setAge(age);

        // 调用父类的有参构造
        super(name, age);
    }
}

public class ExtendsDemo02 {
    public static void main(String[] args) {
        Son s = new Son();
        s.name = "儿子";
        // 子类不能继承父类私有的属性
        // s.age = 12;

        // 但是可以继承getter/setter方法，打破了类的封装性
        s.setAge(12);
        System.out.println(s.getAge());

        s.eat();
        // 子类不能父类的私有的成员的方法
        // s.sleep();

        // 子类不能继承父类的构造方法
        Son s2 = new Son("小儿子", 2);
        s2.show();

    }
}