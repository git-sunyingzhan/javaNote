package oop.dya04;

/**
 * InterfaceDemo01
 */
interface Inter {
}

interface Fu {
    public abstract void show();

    public abstract void fun();
}

interface Mu {
    public abstract void method();

    public abstract void fun();
}

// 接口可以多继承
interface Zi extends Fu, Mu {
}

// 一个类可以实现多个接口。如果这个类是具体类，需要重写接口里面的所有抽象方法。
class Demo implements Fu, Mu {

    @Override
    public void method() {

    }

    @Override
    public void show() {

    }

    @Override
    public void fun() {

    }
}

// 接口的实现类，如果是抽象类，可以不用重写接口内的抽象方法。
// 如果接口里面的抽象方法，有重名，只需要重写一次
abstract class Foo implements Fu, Mu {
}

public class InterfaceDemo01 {

    public static void main(String[] args) {
        // 接口不可以实例化
        // Inter i = new Inter();
        System.out.println("aaaa");
    }
}