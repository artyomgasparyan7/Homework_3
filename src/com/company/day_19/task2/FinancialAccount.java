package com.company.day_19.task2;

public class FinancialAccount extends TaxAccounting{

    public int countOfEmployers = 3;
    public String departmentName = "IT3";
    double salryOfEployeers = (countOfEmployers * 65000.3)%2 + 63850.8;
    FinancialAccount(){

    }

    public FinancialAccount(int countOfEmployers, String departmentName, double salryOfEployeers) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
        this.salryOfEployeers = salryOfEployeers;
    }

    public FinancialAccount(int countOfEmployers, String departmentName, int countOfEmployers1, String departmentName1, double salryOfEployeers) {
        super(countOfEmployers, departmentName);
        this.countOfEmployers = countOfEmployers1;
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
    public void account() {
      //  super.account();
        System.out.println("salryOfEployeers from FinancialAccount class: " +salryOfEployeers);
    }

    @Override
    public String toString() {
        return super.toString()+
                "FinancialAccount{" +
                "countOfEmployers=" + countOfEmployers +
                ", departmentName='" + departmentName + '\'' +
                ", salryOfEployeers=" + salryOfEployeers +
                '}';
    }


    public static void main(String[] args) {

        TaxAccounting obj = new FinancialAccount(3,"IT3",
                2,"IT2",63000.63);

        System.out.println(obj);

        obj.account();

        FinancialAccount financialAccount = new FinancialAccount();

        System.out.println(financialAccount.getSalryOfEployeers());

    }
}
