package com.company.day_21.task2;

import com.company.day_18.Person;

public class MainTask2 {
    public static void main(String[] args) {

        /**
         * compile time polymorphism
         */
        System.out.println("Sum of to numeric number: "+Child.calculateSum(4,8));
        System.out.println("Sum of to other type number: " + Child.calculateSum(5.85,8));

        Parent obj2 = new Child();

        System.out.print("This method is called of Child object: ");

        /**
         * runtime polymorphism
         */
        obj2.eat();

       new Parent(){
           @Override
           public void methodParent() {

               System.out.println("Method is Parent!");
           }

           @Override
           public void eat() {

               System.out.println("Parent is normal eating !");
           }
       }.methodParent();




    }
}
