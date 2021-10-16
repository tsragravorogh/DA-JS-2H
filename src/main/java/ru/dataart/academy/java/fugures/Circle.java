package ru.dataart.academy.java.fugures;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
