package com.company.day_21.task4;

public class Circle implements Shape {

    protected int side;

    public Circle(){

    }

    public Circle(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "side=" + side +
                '}';
    }

    @Override
    public double area() {
        return Math.PI*side*side;
    }

    @Override
    public double area(double side) {
        return Math.PI * side * side;
    }

    @Override
    public double perimeter(double side) {
        return 2 * Math.PI * side;
    }
}
