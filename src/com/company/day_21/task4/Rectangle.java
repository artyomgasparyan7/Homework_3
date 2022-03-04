package com.company.day_21.task4;

public class Rectangle implements Shape{

    protected static int side1;
    protected static int side2;

    protected  int sideOne;
    protected  int sideTwo;

    public Rectangle() {
    }

    public Rectangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public static int getSide1() {
        return side1;
    }

    public static void setSide1(int side1) {
        Rectangle.side1 = side1;
    }

    public static int getSide2() {
        return side2;
    }

    public static void setSide2(int side2) {
        Rectangle.side2 = side2;
    }

    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double area(){

        return sideOne + sideTwo;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                '}';
    }

    @Override
    public double area(double side) {
        return side1*side2;
    }





    @Override
    public double perimeter(double side) {
        return (side1 + side2)*2;
    }
}
