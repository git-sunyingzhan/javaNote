package se01.day01;

/**
 * @author Administrator 定义一个学习的接口Study，里面定义学习的方法Study(),
 *         采用匿名内部类在测试类进行测试，控制台打印输出： “java从入门到放弃需要多久？只需要4个月+1部手机”
 */

interface Study {
    void Study();
}

public class Test01 {

    public static void main(String[] args) {
        new Study() {

            @Override
            public void Study() {
                System.out.println("java从入门到放弃需要多久？只需要4个月+1部手机");
            }
        }.Study();
    }
}