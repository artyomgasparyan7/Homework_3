package com.company.day_19.task2;

public class Accounting {

    private int countOfEmployers = 1;
    private String departmentName = "Accounting";

    public Accounting(int countOfEmployers, String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }

    public Accounting() {
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void account(){

        System.out.println("countOfEmployers: " + countOfEmployers);
        System.out.println("departmentName: " + departmentName);
    }

    @Override
    public String toString() {
        return "Accounting{" +
                "countOfEmployers=" + countOfEmployers +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
