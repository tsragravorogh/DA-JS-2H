package ru.dataart.academy.java;

import ru.dataart.academy.java.fugures.Circle;
import ru.dataart.academy.java.fugures.Figure;
import ru.dataart.academy.java.fugures.Rectangle;

public class Main{
    public static void main(String[] args) {
        Figure[] figures = new Figure[] {new Circle(3), new Circle(5), new Rectangle(3, 5)};

        double sumOfAreasFigures = new Calculator().calculate(figures);
        String stringOfSum = String.format("%.2f", sumOfAreasFigures);
        System.out.println(stringOfSum);
    }
}