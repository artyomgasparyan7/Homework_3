package com.company.day_27;

import java.util.*;

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

    /**
     * 3. Write a method which takes a List of T type and Comparator of type
     * T. Return the largest value in the list.
     *
     * @param list
     * @param comparator
     * @param <T>
     * @return
     */
    public static <T> T returnLargestValue(List<T> list, Comparator<T> comparator) {


        T max = list.get(0);
        for (T t : list) {
            if (comparator.compare(t, max) > 0) {

                max = t;

            }

        }
        return max;
    }

    /**
     * 4. Define a method copy(dest, src) which will copy from src to dest. src
     * and dest are lists. (use wildcards for this problem)
     * Method should work for this example`
     * @param src
     * @param dest
     * @param <T>
     */
    public static <T> void copy(Collection<? extends Integer> src,
                             Collection<? super Integer> dest) {

        Iterator<? extends Integer> iter = src.iterator();
        while (iter.hasNext())
            dest.add(iter.next());

    }
}
