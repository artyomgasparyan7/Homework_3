package com.company.day_23.ourArrayList;

import java.util.Iterator;

//ArrayIterator is iterator of list
public class ArrayIterator<E> implements Iterator<E> {

    private int index = 0;
    private E[] values;


    ArrayIterator(E[] values) {

        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
