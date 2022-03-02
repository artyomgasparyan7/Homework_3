package com.company.day_19.task1;

public class Animal {

    private String sort;
    private  int age;

    public Animal(String singer, int age) {
        this.sort = singer;
        this.age = age;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void voice(){

        System.out.println("Singer :" + sort);
        System.out.println("Age is: " + age);
    }

    protected void eat(){

        System.out.println("Eat animal");
    }



    @Override
    public String toString() {
        return "Animal{" +
                "sort='" + sort + '\'' +
                ", age=" + age +
                '}';
    }
}
