package com.company.day_19.task1;

public class Dog extends Animal {

    public Dog(String singer, int age) {
        super(singer, age);
    }

    @Override
    protected void voice() {
        //super.voice();

        System.out.println("Dog is guf guf!!!");
    }

    @Override
    protected void eat() {

        //super.eat();
        System.out.println("Dog is eatinq: chyp-chyp");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        Animal obj = new Dog("Dog",65);
        System.out.println(obj);

        obj.voice();
        obj.eat();

        Animal anim = new Animal("Animal",7);
        System.out.println(anim);
    }
}
