package com.company.day_22.task2;

public class StackIndexOutOfBoundsException extends RuntimeException{

    public StackIndexOutOfBoundsException(int index,int size){

        super(index + "index is out of diapazon " + size);
    }
}
