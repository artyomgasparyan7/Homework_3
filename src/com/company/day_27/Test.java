package com.company.day_27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

    /**
     * 1. Write a method which takes a list of any type and prints the elements of the list.
     *
     * @param list
     */
    public static void printListElements(List<?> list) {

        for (Object list1 : list) {

            System.out.print(list1 + " ");

        }

    }

    /**
     * 2. Write a method that takes an array of T type and converts it to a list of type T.
     *
     * @param arr
     * @param <T>
     * @return
     */
    public static <T> List<T> convertTTypeArrayOfToTTypeList(T[] arr) {

        List<T> list = new ArrayList<>();

        for (T t : arr) {

            list.add(t);
        }


        return list;
    }

    public static <T> int returnLargestValue(List<T> list, Comparator<T> comparator) {


        //list = new ArrayList<>();

        // Create maxValue variable and initialize with 0
        int maxValue = 0;

        comparator = new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
               // int i = o1 - o2;
                return -1;
            }
        };

return 0;
    }
}
