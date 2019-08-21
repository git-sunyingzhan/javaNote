package oop.day03.shape;

/**
 * 圆有属性：圆心center和半径r 提供合理的构造器 提供一个方法计算圆的面积 Math.PI
 * 提供contains方法，判断指定定点是否在圆内，并根据实际需求提供重载方法
 */
class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x) {
        this(x, x);
    }

    // getter/setter
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    // 求两点之间的间距
    public double distance(Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(int x, int y) {
        return distance(new Point(x, y));
    }

}

class Circle01 {
    private Point center;
    private double r;

    // 构造方法
    public Circle01() {
    }

    public Circle01(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    // getter/setter
    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    // 求面积
    public double area() {
        return Math.PI * r * r;
    }

    // 判断指定点是否在圆内
    public boolean contains(Point p) {
        return center.distance(p) <= r;
    }

    public boolean contains(int x, int y) {
        // return center.distance(p) <= r;
        return contains(new Point(x, y));
    }

}