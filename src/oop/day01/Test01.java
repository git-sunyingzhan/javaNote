package oop.day01;

// 定义一个长方形，里面提供求周长和面积的公式

class Rectangle {
    private double width;
    private double length;

    // 设置周长
    public void setPerimeter(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 获取周长
    public double getPerimeter() {
        return (length + width) * 2;
    }

    // 设置面积
    public void setArea(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 获取面积
    public double getArea() {
        return length * width;
    }
}

public class Test01 {
    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        double width = 1.5;
        double length = 1.5;

        re.setPerimeter(length, width);
        re.setArea(length, width);
        System.out.println(re.getPerimeter());
        System.out.println(re.getArea());
    }
}