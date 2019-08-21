package oop.day03.shape;

/**
 * Rectangle
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double x, double y) {
        this.length = x;
        this.width = y;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public boolean contains(Point point) {
        return contains(point.getX(), point.getY());
    }

    @Override
    public boolean contains(double x, double y) {
        double dx = x - this.getPoint().getX();
        double dy = y - this.getPoint().getY();
        return (dx >= 0 && dx <= length) && (dy >= 0 && dy <= width);
    }

}