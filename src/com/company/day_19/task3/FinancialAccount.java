package com.company.day_19.task3;

public class FinancialAccount extends TaxAccounting {

    int countOfEmployers;
    String departmentName;
    double salryOfEployeers;

    public FinancialAccount(){

    }

    public FinancialAccount(int countOfEmployers, String departmentName, double salryOfEployeers) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
        this.salryOfEployeers = salryOfEployeers;
    }

    public FinancialAccount(int countOfEmployers, String departmentName, int taxOfCompany, int countOfEmployers1, String departmentName1, double salryOfEployeers) {
        super(countOfEmployers, departmentName, taxOfCompany);
        this.countOfEmployers = countOfEmployers1;
        this.departmentName = departmentName1;
        this.salryOfEployeers = salryOfEployeers;
    }

    public FinancialAccount(int countOfEmployers, String companyName, int countOfEmployers1, String departmentName, int taxOfCompany, int countOfEmployers2, String departmentName1, double salryOfEployeers) {
        super(countOfEmployers, companyName, countOfEmployers1, departmentName, taxOfCompany);
        this.countOfEmployers = countOfEmployers2;
        this.departmentName = departmentName1;
        this.salryOfEployeers = salryOfEployeers;
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

    public double getSalryOfEployeers() {
        return salryOfEployeers;
    }

    public void setSalryOfEployeers(double salryOfEployeers) {
        this.salryOfEployeers = salryOfEployeers;
    }

    @Override
    public String toString() {
        return "FinancialAccount{" +
                "countOfEmployers=" + countOfEmployers +
                ", departmentName='" + departmentName + '\'' +
                ", salryOfEployeers=" + salryOfEployeers +
                '}';
    }

    @Override
    public void account() {
        // super.account();

        salryOfEployeers = countOfEmployers * 65250 % 2 + 63362.5;
        System.out.println(salryOfEployeers);
    }


}
