package com.company.day_21.task4;

public class MainTask4 {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape square = new Square();
        Shape rectangle = new Rectangle();

        System.out.println("Area of circle: " + circle.area(2.5));
        System.out.println("Perimeter of circle: " + circle.perimeter(4.2));

        System.out.println("Area of square: " + square.area(2.5));
        System.out.println("Perimeter of square: " + square.perimeter(4.2));

        Rectangle.side1 = 7;
        Rectangle.side2 = 5;


        System.out.println("Area of rectangle: " + rectangle.area(Rectangle.side1));
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter(4.2));

        Shape arrShape[] = new Shape[3];

        arrShape[0] = new Rectangle(7,8);
        arrShape[1] = new Square(4,4);
        arrShape[2] = new Circle(8);

        System.out.println("Area of rectangle: "+arrShape[0].area());
        System.out.println("Area of square: "+arrShape[1].area());
        System.out.println("Area of circle: "+arrShape[2].area());



    }

    }

