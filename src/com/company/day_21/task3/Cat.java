package com.company.day_21.task3;

public class Cat extends Animal{


    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat(){
        super();
    }

    @Override
    public void sound() {

        System.out.println("miau");
    }


}
