package com.company.day_17;

public class HomeWorkTest17 {
    public static void main(String[] args) {


        System.out.println(Test.print(new int[]{1,8,2,9,7,5}));
        System.out.println(Test.print(new float[]{1.5f,5,9f,6,8,1}));
        System.out.println(Test.print(new double[]{1.2,8.5,4,9,6}));

        System.out.println(Test.search(new int[]{1,7,8,6,5,4,4}));
        System.out.println(Test.search(new int[]{1,7,8,6,5,4,4},5));
        System.out.println(Test.search(new int[]{1,7,8,6,5,4,4},5,6));

        System.out.println(Test.area(9));
        System.out.println(Test.area(2.5f));
        System.out.println(Test.area(2.5f,5f));

        System.out.println(Test.max(71,9));
        System.out.println(Test.max(41,52,52));
        System.out.println(Test.max(41,62,21,62));

        System.out.println(Test.distance(3,4,5,4));

        System.out.println(Test.remainder(-548));
        System.out.println(Test.remainder(-548,7));
        




    }
}
