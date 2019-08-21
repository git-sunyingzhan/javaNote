package oop.day01;

/**
 * 构造方法（函数）
 */
public class Point {

    public int x = 4; // 显示初始化
    public int y;

    // 构造方法
    // 无参构造
    public Point() {
        System.out.println("无参构造");
    }

    // 构造方法可以重载
    public Point(int x, int y) {
        // 属性的构造方法初始化
        this.x = x;
        this.y = y;
        System.out.println("有参构造");
    }

    public Point(int x) {
        // 调用上面的有参构造
        this(x, x);
    }

    // 显示对象信息
    public void show() {
        System.out.println("x=" + x + ",y+" + y);
    }
}