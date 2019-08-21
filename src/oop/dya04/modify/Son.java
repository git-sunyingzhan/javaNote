package oop.dya04.modify;

/**
 * Son
 */
public class Son extends Father {
    public void method() {
        // 被private修饰的成员，只能在当前类中访问
        // System.out.println(this.num1);
        System.out.println(this.num2);
        System.out.println(this.num3);
        System.out.println(this.num4);
    }
}