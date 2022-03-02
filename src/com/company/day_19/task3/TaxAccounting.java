package com.company.day_19.task3;

public class TaxAccounting extends Accounting{

    int countOfEmployers;
    String departmentName;
    int taxOfCompany;

    public TaxAccounting(){


    }
    public TaxAccounting(int countOfEmployers, String departmentName, int taxOfCompany) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
        this.taxOfCompany = taxOfCompany;
    }

    public TaxAccounting(int countOfEmployers, String companyName, int countOfEmployers1, String departmentName, int taxOfCompany) {
        super(countOfEmployers, companyName);
        this.countOfEmployers = countOfEmployers1;
        this.departmentName = departmentName;
        this.taxOfCompany = taxOfCompany;
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

    public int getTaxOfCompany() {
        return taxOfCompany;
    }

    public void setTaxOfCompany(int taxOfCompany) {
        this.taxOfCompany = taxOfCompany;
    }

    @Override
    public void account() {
       // super.account();

        taxOfCompany = countOfEmployers * 8;
        System.out.println(taxOfCompany);
    }

    @Override
    public String toString() {
        return "TaxAccounting{" +
                "countOfEmployers=" + countOfEmployers +
                ", departmentName='" + departmentName + '\'' +
                ", taxOfCompany=" + taxOfCompany +
                '}';
    }
}
