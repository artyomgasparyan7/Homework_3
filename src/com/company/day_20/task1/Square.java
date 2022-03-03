package com.company.day_20.task1;

import com.company.day_20.task1.Shape;

public class Square extends Shape {
    @Override
    protected double getArea(double radius) {
        return radius*radius;
    }

    @Override
    protected double getPerimeter(double radius) {
        return 4*radius;
    }
}
