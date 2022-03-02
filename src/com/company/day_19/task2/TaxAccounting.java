package com.company.day_19.task2;

public class TaxAccounting extends Accounting{

    protected int countOfEmployers = 2;
    protected String departmentName = "IT2";
    protected int taxOfCompany = countOfEmployers*8;

    TaxAccounting(){
        super();
    }
    public TaxAccounting(int countOfEmployers, String departmentName) {
        //super(countOfEmployers, departmentName);
        this.countOfEmployers = countOfEmployers;
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

    @Override
    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void account() {
       // super.account();
        System.out.println("taxOfCompany from TaxAccounting class: "+taxOfCompany);
    }

   /* @Override
    public String toString() {
        return super.toString();
    }*/

    @Override
    public String toString() {
        return "TaxAccounting{" +
                "countOfEmployers=" + countOfEmployers +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Accounting obj = new TaxAccounting(7,"IT");

        System.out.println(obj);
        System.out.println("countOfEmployers of Accounting class from constructor!: "+obj.getCountOfEmployers());

        Accounting accounting = new Accounting();
        System.out.println("countOfEmployers of Accounting class: "+accounting.getCountOfEmployers());

        TaxAccounting taxAccounting = new TaxAccounting(2,"IT by tax!");

        System.out.println(taxAccounting);
        System.out.println("countOfEmployers of TaxAccounting class: " + taxAccounting.countOfEmployers);

        taxAccounting.account();


    }
}
