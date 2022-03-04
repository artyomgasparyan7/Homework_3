package com.company.day_21.task1;

import com.company.day_21.task1.Animal;
import com.company.day_21.task1.Cat;
import com.company.day_21.task1.Horse;

public class MainTask1 {

    public static void main(String[] args) {

        Animal horse = new Horse();
        System.out.print("Horse sound is : ");
        horse.sound();
        System.out.println();

        Animal cat = new Cat();
        System.out.print("Cat sound is: ");
        cat.sound();
    }
}
