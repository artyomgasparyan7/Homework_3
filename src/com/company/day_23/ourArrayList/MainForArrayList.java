package com.company.day_23.ourArrayList;

import java.util.Iterator;

public class MainForArrayList {

    public static void main(String[] args) {

        Simple<String> strings = new SimpleArray<>();

        strings.add("First");
        strings.add("Second");
        strings.add("3rd");
        strings.add("4rd");
        strings.add("5rd");

        Iterator<String> iter = strings.iterator();

        while (iter.hasNext()){

            System.out.println(iter.next());
        }
        for (String o:strings) {

            System.out.println(strings);
        }

        //strings.delete(3);

       // strings.update(2,"update");


        //System.out.println(strings.get(3));
        //System.out.println(strings.size());

    }


}
