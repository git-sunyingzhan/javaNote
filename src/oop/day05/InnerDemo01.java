package oop.day05;

import oop.day01.Student;

class Room {
    private int length = 10;
    int width = 5;

    class Student {
        String name = "小明";

        // 内部类可以直接访问外部类的成员，包含私有成员
        public void watch() {
            System.out.println(length);
            System.out.println(width);
            look();
        }
    }

    public void look() {
        // 外部类不可以直接访问内部类的成员
        // System.out.println(name);

        // 如果要访问，必须先创建对象
        Student s = new Student();
        System.out.println(s.name);
        s.watch();
    }
}

/**
 * InnerDemo01
 */
public class InnerDemo01 {

    public static void main(String[] args) {
        // Student s = new Student();

        Room.Student stu = new Room().new Student();
        stu.watch();

    }
}