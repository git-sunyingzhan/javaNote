package oop.day01;

public class Student {

    // 属性私有化
    // 目的：为了不让外界对属性进行随意的访问修改
    // 被private修饰的成员只能在当前类中被访问
    private String name;
    private int age;

    // 属性被私有化之后，外界不论什么情况下都不能访问到被private修饰的成员
    // 这种做法不可取。为了能够让外界按照某个规则访问被private修饰的成员变量
    // Java提供了其公共的方法方式（getter/setter方法）

    public void setName(String name) {
        // Java存在就近原值,导致局部变量隐藏了局部变量
        // 这里的两个name都是局部变量的name
        // name = name;

        // Java提供了this关键字，可以用它来访问成员变量和成员方法
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            this.age = -1;
            System.out.println("看清楚了再敲。");
        }
    }

    public int getAge() {
        return age;
    }

    public void study() {
        System.out.println("学习");
    }

    public void eat() {
        System.out.println("吃");
    }

    public void show() {
        System.out.println("name=" + name + ",age=" + age);
    }
}