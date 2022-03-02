package com.company.day_19.task3;

public class ItCompany {


    private int countOfEmployers = 1;
    private String companyName = "ItCompany";


    public ItCompany(){
        super();
    }

    public ItCompany(int countOfEmployers, String companyName) {
        this.countOfEmployers = countOfEmployers;
        this.companyName = companyName;
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "ItCompany{" +
                "countOfEmployers=" + countOfEmployers +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public void account(){

        System.out.println("account() method of ItCompany class!");
    }
}
