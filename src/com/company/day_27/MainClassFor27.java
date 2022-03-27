package com.company.day_27;

import java.util.ArrayList;
import java.util.List;

public class MainClassFor27 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("df");
        list.add("qw");
        list.add("hkj");
        list.add("ioui");

        List<Integer> integerList = new ArrayList<>();

        integerList.add(4);
        integerList.add(7);
        integerList.add(9);
        integerList.add(45);
        integerList.add(6);

        Test.printListElements(list);
        System.out.println();
        Test.printListElements(integerList);
        System.out.println();


        Integer[] arr1 = new Integer[]{7,8,9,45,6};
        System.out.println(Test.convertTTypeArrayOfToTTypeList(arr1));

        String [] arrString = new String[]{"Asa","dsfh","sdf"};
        System.out.println(Test.convertTTypeArrayOfToTTypeList(arrString));


    }
}
