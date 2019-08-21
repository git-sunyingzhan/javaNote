package oop.day01;

import java.util.Arrays;

class Book {
    // 成员变量
    String id;// 编号
    String name;// 书名
    double price;// 价格
    String[] authors;// 作者

    // 成员方法
    public void read() {
        System.out.println("读");
    }
}

public class BookDemo {

    public static void main(String[] args) {
        // 创建一个Book对象
        Book book = new Book();
        // 访问成员变量
        System.out.println(book.id + " " + book.name + " " + book.price);
        System.out.println(Arrays.toString(book.authors));
        // 成员变量自定义赋值
        book.id = "3478249";
        book.name = "Java编程思想";
        book.price = 123;
        book.authors = new String[] { "小明", "小芳" };
        // 访问成员变量
        System.out.println(book.id + " " + book.name + " " + book.price);
        System.out.println(Arrays.toString(book.authors));

        // 访问成员方法
        book.read();
    }
}