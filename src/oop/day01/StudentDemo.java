package oop.day01;

public class StudentDemo {

    public static void main(String[] args) {
        // Student对象
        Student s = new Student();

        // 设置成员变量
        // 外界不可以访问被private修饰的变量
        // s.name = "张三";
        // s.age = 10;
        // System.out.println("name=" + s.name + ",age=" + s.age);

        // 通过getter/setter对成员变量进行访问

        s.setName("张三");
        s.setAge(-12);
        System.out.println(s.getName() + "," + s.getAge());

    }
}