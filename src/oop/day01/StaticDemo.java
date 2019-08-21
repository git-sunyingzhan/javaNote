package oop.day01;

/**
 * 静态的特点
 */
class Person {
    String name;
    int age;
    static String country;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String country) {
        this(name, age);
        Person.country = country;
    }

    public void show() {
        System.out.println("姓名：" + name + ",年龄：" + age + ",国籍：" + country);
    }
}

public class StaticDemo {

    public static void main(String[] args) {
        Person p1 = new Person("李小龙", 11, "中国");
        Person p2 = new Person("成龙", 12);
        Person p3 = new Person("罗玉凤", 13);
        p1.show();
        p2.show();
        p3.show();
        Person.country = "美国";
        p1.show();
        p2.show();
        p3.show();
    }
}