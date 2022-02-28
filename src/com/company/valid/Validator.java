package com.company.valid;

public final class Validator {

    private Validator(){

    }

    public static boolean isValidSide(int side){

        return side>1 && side<20;
    }
}
