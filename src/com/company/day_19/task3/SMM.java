package com.company.day_19.task3;

public class SMM extends Marketing{

    int countOfEmployers;
    String departmentName;

    public SMM(){
        super();
    }

    public SMM(int countOfEmployers, String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }

    public SMM(int countOfEmployers, String departmentName, int countOfEmployers1, String departmentName1) {
        super(countOfEmployers, departmentName);
        this.countOfEmployers = countOfEmployers1;
        this.departmentName = departmentName1;
    }

    public SMM(int countOfEmployers, String companyName, int countOfEmployers1, String departmentName, int countOfEmployers2, String departmentName1) {
        super(countOfEmployers, companyName, countOfEmployers1, departmentName);
        this.countOfEmployers = countOfEmployers2;
        this.departmentName = departmentName1;
    }

    @Override
    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    @Override
    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    @Override
    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "SMM{" +
                "countOfEmployers=" + countOfEmployers +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    @Override
    public void marketing() {
       // super.marketing();
    }
}
