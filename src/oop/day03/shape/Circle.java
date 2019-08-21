package oop.day03.shape;

/**
 * Circle
 */
public class Circle extends Shape {

    private double r;

    public Circle() {
    }

    public Circle(Point point, double r) {
        super(point);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    // @Override
    // public boolean contains(Point point) {
    Point p = this.getPoint();
    // Point center = new Point(p.getX() + r, p.getY() + r);
    // return center.distance(point) <= r;

    @Override
    public boolean contains(Point point) {
        return false;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }
}
