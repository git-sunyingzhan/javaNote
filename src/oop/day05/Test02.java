package oop.day05;

/**
 * Test02
 */
abstract class People {
    public abstract void show();
}

class Outer03 {
    // 补齐代码
    public static People method() {
        return new People() {

            @Override
            public void show() {
                System.out.println("HelloWord");
            }
        };
    }
}

public class Test02 {
    public static void main(String[] args) {
        Outer03.method().show();// HelloWord
    }
}