package oop.day03.shape;

public abstract class Shape {
    public Point point;// 坐标

    public Shape() {
    }

    public Shape(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    // 计算面积
    public abstract double area();

    // 判断点是否在图形内
    public abstract boolean contains(Point point);

    public abstract boolean contains(double x, double y);

}