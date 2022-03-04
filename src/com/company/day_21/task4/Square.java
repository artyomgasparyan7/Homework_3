package com.company.day_21.task4;

public class Square implements Shape{

    protected int sideOne,sideTwo;

   public Square(){
       super();
   }
    public Square(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
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

    @Override
    public double area() {
        return sideOne*sideTwo;
    }

    @Override
    public double area(double side) {
        return Math.pow(side,2);
    }

    @Override
    public double perimeter(double side) {
        return 4*side;
    }
}
