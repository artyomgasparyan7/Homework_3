package com.company.day_23;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedList implements List {

    // java.util.LinkedList<String> mna = new java.util.LinkedList<>();
    Node head;
    public int size;

    @Override
    public int size() {

        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;

    }

    @Override
    public boolean isEmpty(Node head, int x) {

        if (head == null)
            return false;
        if (head.data == x)
            return true;


        return isEmpty(head.next, x);
    }

    @Override
    public Object get(int index) {
        return 0;
    }

    @Override
    public void add(int val) {

        Node new_node = new Node(val);


        new_node.next = head;


        head = new_node;

        if (head == null) {
            head = new Node(val);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(val);

    }

    @Override
    public void add(int index, int val) {

    }

    @Override
    public void delete(int index) {

        if (head == null) return;

        Node current = head;
        while (current.next != null) {
            if (current.next.data == index) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        List.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return List.super.spliterator();
    }

    class Node {

        int data;
        Node next;

        public Node(int d) {

            data = d;
            next = null;

        }

    }
}
