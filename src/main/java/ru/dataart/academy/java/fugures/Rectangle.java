package ru.dataart.academy.java.fugures;

public class Rectangle extends Figure{

    private double bigSide;
    private double smallSide;

    public Rectangle(double bigSide, double smallSide) {
        this.bigSide = bigSide;
        this.smallSide = smallSide;
    }

    public Rectangle() {
    }

    @Override
    public double area() {
        return bigSide * smallSide;
    }

    @Override
    public double perimetr() {
        return 2 * (bigSide + smallSide);
    }

    public double getBigSide() {
        return bigSide;
    }

    public void setBigSide(double bigSide) {
        this.bigSide = bigSide;
    }

    public double getSmallSide() {
        return smallSide;
    }

    public void setSmallSide(double smallSide) {
        this.smallSide = smallSide;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "bigSide=" + bigSide +
                ", smallSide=" + smallSide +
                '}';
    }
}
