package com.company.day_22.task2;

public class DefaultStack implements Stake {

    private final int[] nums;
    private int index;
    private static final int MAX_SIZE = 5;


    public DefaultStack(){

        super();
        this.nums = new int[MAX_SIZE];
    }
    @Override
    public void push(int val) {

        if (this.index == MAX_SIZE){

            throw  new StackIndexOutOfBoundsException(
                    this.index,
                    MAX_SIZE
            );


        }

        this.nums[this.index] = val;
        this.index++;
    }

    @Override
    public int pop() {

        if (this.index == 0){

            throw new EmptyStackException("Stack is empty");
        }

        int val = nums[this.index -1];
        this.nums[this.index-1] = 0;
        this.index--;
        return val;
    }
}
