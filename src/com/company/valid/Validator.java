package com.company.valid;

public final class Validator {

    private Validator() {

    }

    public static boolean isValidAge(int age) {

        return (age >= 18 && age <= 99);
    }

    public static boolean isValidName(String name){

        if (name == null || name.length() == 0){

            return false;
        }
        return (name.length() >= 3 && name.length()<=15);

    }

    public static boolean isValidSide(int side) {

        return side > 1 && side < 20;
    }


}
