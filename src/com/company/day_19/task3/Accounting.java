package com.company.day_19.task3;

public class Accounting extends ItCompany{

    int countOfEmployers = 2;
    String departmentName = "Accounting IT";


    public Accounting(){

    }
    public Accounting(int countOfEmployers, String companyName) {
        //super(countOfEmployers, companyName);
        this.countOfEmployers = countOfEmployers;
        this.departmentName = companyName;
    }

    @Override
    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    @Override
    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void account() {
       // super.account();

        System.out.println("account() method of Accounting : ");
    }

    @Override
    public String toString() {
        return "Accounting{" +
                "countOfEmployers=" + countOfEmployers +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
