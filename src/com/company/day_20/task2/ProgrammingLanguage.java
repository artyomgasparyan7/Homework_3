package com.company.day_20.task2;

public class ProgrammingLanguage implements Language{

    public ProgrammingLanguage() {
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{}";
    }

    @Override
    public void getName(String name) {

        System.out.println("This method is ProgrammingLanguage class: " + name);
    }
}
