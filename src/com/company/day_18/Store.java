package com.company.day_18;

public class Store {

    private int countOfWorkers;
    private String name, phoneNumber;
    private int[] arr;

    public Store(int countOfWorkers, String name, int[] arr) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.arr = arr;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers<2 || countOfWorkers > 50) {
            System.out.println("countOfWorkers mustn't be out  range from 2 to 50");
            return;
        }else
            this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.length()<3){

            System.out.println(" name  haven't at least 3 characters");
            return;
        }else
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        for (int i = 0; i < phoneNumber.length(); i++) {

            boolean b = true;

            if (phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9') {
                b = false;
                break;
            }
        }
        if (phoneNumber.length()!=8){

            System.out.println("phoneNumber  haven't 8 digits, also can not consist\n" +
                    "negative digits");
            return;
        }
        this.phoneNumber = phoneNumber;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {

        
        this.arr = arr;
    }
}
