package com.company.day7;
import com.company.pachage_for_day5.Author;

import java.util.*;
import java.sql.*;

 /*class BirthdayManager {

    //private Date rob = new Date();
 private java.util.Date sharon = new java.util.Date();
 }*/

 class JavaBasic {
     private static int yesterday = 1;
int tomorrow = 10;


     int birds = 10;


     int instance1 = 45;
    static String s = "name";

  /*  public static String staticString(){

        return s;
    }*/



   // static String classInstance1 ;

    public static  void main(String[] args) {

        int tomorrow1 = new JavaBasic().tomorrow;
        JavaBasic tolls = new JavaBasic();
         int today=20, tomorrow = 40;
        System.out.println(tomorrow1);
        System.out.print(today + tolls.tomorrow +
                tolls.yesterday + tomorrow);


        /*if (tree.equals("pine")) {
            int height = 55;
            count = count + 1;
        }
        System.out.print(height + count);*/



    }
}
