package oop.day02;

class Code {

    // 构造代码块,所有构造方法公共的代码
    {
        System.out.println("hello");
        System.out.println("world");
    }

    public Code() {
    }

    public Code(String s) {
        System.out.println(s);
    }
}

public class CodeDemo01 {

    public static void main(String[] args) {
        // 局部代码块
        {
            int num = 10;
            System.out.println(num);
        }
        // 在外部不可调用局部代码块里面的代码
        // System.out.println(num);

        // 匿名对象。（对象仅仅使用1次/0次）
        new Code();
        System.out.println("-------------");
        new Code("java");
    }
}