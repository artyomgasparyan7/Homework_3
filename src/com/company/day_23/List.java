package com.company.day_23;

public interface List {

    public int size();
    public boolean isEmpty(LinkedList.Node head, int x);
    public Object get(int index);
    public void add(int val);
    public void add(int index,int val);
    public void delete(int index);
}
