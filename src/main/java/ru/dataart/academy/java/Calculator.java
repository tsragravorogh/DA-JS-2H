package ru.dataart.academy.java;

import ru.dataart.academy.java.fugures.Figure;

public class Calculator {

    public double calculate(Figure[] figures) {
        double sum = 0;
        for(Figure f: figures) {
            sum += f.area();
        }
        return sum;
    }


}
