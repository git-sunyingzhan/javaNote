package oop.day01;

/**
 * PointDemo
 */
public class PointDemo {

    public static void main(String[] args) {
        // 1)通过无参构造创建Point对象
        Point p = new Point();
        p.show(); // x=4,y=0

        // 2)通过有参构造创建Point对象
        Point p2 = new Point(3, 2);
        p2.show(); // x=3,y=2

        // 3）
        Point p3 = new Point(3);
    }
}