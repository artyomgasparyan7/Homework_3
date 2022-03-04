package com.company.day_21.task3;

public class MainTask3 {

    public static void main(String[] args) {

        Animal anim = new Cat(15, "Bear");

        System.out.println(anim);

        Cat cat = new Cat(7, "Kitty");

        System.out.println("Cat age is : " + cat.getAge());
        System.out.println("Cat name is : " + cat.getName());
        anim.sound();//this ref  and cat  ref return same !!!
        cat.sound();
    }
}
