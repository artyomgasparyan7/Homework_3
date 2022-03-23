package com.company.day_20.task1;

public class MainTask1 {

    public static void main(String[] args) {

        System.out.println("Area of Circle: " + new Circle() {
        }.getArea(4.5F));

        Circle obj = new Circle();

        System.out.println("Perimeter of Circle: " + obj.getPerimeter(2.0f));

        Square square = new Square();

        System.out.println("Area of square: " + square.getArea(4.5f));
        System.out.println("Perimeter of square: " + obj.getPerimeter(2.0f));

    }
}
