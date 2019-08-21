package oop.day02;

class Code02 {
    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println("构造代码块");
    }

    public Code02() {
        System.out.println("构造代码块");
    }
}

/**
 * CodeDemo02
 */
public class CodeDemo02 {

    public static void main(String[] args) {
        new Code02();
    }
}