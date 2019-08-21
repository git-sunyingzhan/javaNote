package oop.dya04;

interface Inter03 {
    // jdk1.8支持默认方法
    default void method() {
        System.out.println("default method");
    }
}

interface Inter04 {
    // jdk1.8支持默认方法
    default void method() {
        System.out.println("default02 method");
    }
}

class Fu01 {
    public void method() {
        System.out.println("fu method");
    }
}

class Son extends Fu01 implements Inter03 {

}

class Inter03Impl implements Inter03 {
}

class InterImpl implements Inter03, Inter04 {
    // 如果默认方法有重名，实现类必须重写
    @Override
    public void method() {
        System.out.println("method");
    }
}

public class InterfaceDemo03 {
    public static void main(String[] args) {
        // 接口中的默认方法，实现类可以继承使用
        new Inter03Impl().method();
        // 如果一个类的父类和实现的接口中有重名的方法，那这个子类继承使用父类里面的方法
        new Son().method();
    }
}