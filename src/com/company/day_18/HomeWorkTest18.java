package com.company.day_18;

import com.company.valid.PersonValid;

import java.util.Scanner;

public class HomeWorkTest18 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    /*    Person person = new Person();
       Person person1 = new Person("Artyom","Gasparyan",
               "AP777777",22,"male","Armenia");

       person1.display();
        person.display();*/

       /* Triangle triangle = new Triangle(12,5,16);


       triangle.check(triangle);
        */

       // Store store = new Store(6,"asa",new int[]{7,8});
        Person person = new Person("Asatur","Maxaqyan",
                "AN04545",22,"male","Arab");
        while (true){

            String str = sc.next();

            if (!PersonValid.isFirstName(str)){

                System.out.println("InValid !!");   //person.setFirstName(str);


            }
            person.setFirstName(str);
           System.out.println(person.getFirstName());

           person.display();
        }

    }
}
