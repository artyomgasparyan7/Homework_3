package com.company.valid;

public final class PersonValid {

   private PersonValid(){

    }

    public static boolean isFirstName(String firstName){


            return firstName.length() > 3 && firstName.length() < 15;
        }

        public static boolean isLastName(String lastName){

       return lastName.length() > 6 && lastName.length() < 20;
        }



}
