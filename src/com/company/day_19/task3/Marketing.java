package com.company.day_19.task3;

public class Marketing extends ItCompany{

    private int countOfEmployers;
    private String departmentName;

    public Marketing(){
        super();
    }
    public Marketing(int countOfEmployers, String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }

    public Marketing(int countOfEmployers, String companyName, int countOfEmployers1, String departmentName) {
        super(countOfEmployers, companyName);
        this.countOfEmployers = countOfEmployers1;
        this.departmentName = departmentName;
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
    public String toString() {
        return "Marketing{" +
                "countOfEmployers=" + countOfEmployers +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public void marketing(){


    }
}
