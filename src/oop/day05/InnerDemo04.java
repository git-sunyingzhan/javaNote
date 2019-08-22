package oop.day05;

class Outer02 {
    private int num = 10;

    public void show() {
        final int num2 = 20;

        // 局部内部类
        class Inner02 {
            public void method() {
                // 局部内部类可以直接访问外部类成员，
                System.out.println(num);
                // 局部内部类成员想要访问其所在方法内的局部变量。
                // 该局部变量需要添加final修饰符（可能存在内部类对象存在，而局部变量以销毁）
                // 常量：存储在常量值池中，只要程序运行，常量一直存在
                // jdk1.8，final可以省略，JVM在编译的时候会自动添加final
                System.out.println(num2);
            }
        }
        // 局部内部类对象只能在其所在的方法内部创建
        Inner02 i = new Inner02();
        i.method();
    }
}

/**
 * InnerDemo04
 */
public class InnerDemo04 {

    public static void main(String[] args) {
        Outer02 o = new Outer02();

    }
}