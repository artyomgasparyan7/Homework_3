package com.company.day_23.ourArrayList;
//Simple is List in arraylist collection
public interface Simple<E> extends Iterable<E>{

    boolean add(E e);

    void delete(int index);

    E get(int index);

    int size();

    void update(int index, E e);



}
