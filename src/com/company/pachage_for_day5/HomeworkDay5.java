package com.company.pachage_for_day5;

/**
 * . Define a Person class which
 *  Has fields name, age, address
 *  define no argument constructor
 *  define all argument constructor
 *  write method which will print all information about person
 *  create 2 person objects, print all info about them
 */
public class HomeworkDay5 {

     String name;
     int age;
     String address;

    public HomeworkDay5(String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;
    }

    public HomeworkDay5(){


    }

    public void setPerson(String name, int age, String addres) {

        this.name = name;
        this.age = age;
        this.address = addres;

    }

    public String getString(String name, String addres) {

        return name + addres;
    }

    public int getAge(int age) {

        return age;
    }

    public void allInform() {

        System.out.println("My name is: " + name + ", My old is: " + age + ", My addres: " + address);

    }
}
