package com.company.day_21.task2;

public class Child extends Parent{


    @Override
    public void methodParent() {

    }

    /**
     * this is runtime polymorphism example
     */
    @Override
    public void eat() {
        System.out.println("Child is eating nyam-nyam!");
    }

    public static int  calculateSum(int a , int b) {
        return a + b;
    }

    public static double calculateSum(double a, int b){

        return a + b;
    }


}
