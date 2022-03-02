package com.company.day_19.task3;

public class Test3 {
    public static void main(String[] args) {

        Accounting obj1 = new Accounting();

        System.out.println(obj1);

        System.out.println("Accounting instance: "+obj1.getCountOfEmployers());

        ItCompany itCompany = new ItCompany();
        System.out.println(itCompany);
        System.out.println("ItCompany instance: "+itCompany.getCountOfEmployers());

        System.out.println();

        Accounting obj2 = new TaxAccounting(5,"TaxAccount",
                7);
        System.out.println(obj2);

        System.out.print("calculate taxOfCompany by account() " +
                "method that is overriden from Accounting class: ");
        obj2.account();
        System.out.println();

        TaxAccounting obj3 = new FinancialAccount(7,
                "FinancialAccount",85654.2);

        System.out.println(obj3);

        System.out.print("calculate salryOfEployeers by account() " +
                "method that is overriden from TaxAccounting class: ");
        obj3.account();








    }
}
