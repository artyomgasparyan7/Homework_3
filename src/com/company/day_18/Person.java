package com.company.day_18;

/**
 * 1. Write a Person.java class which `
 * - - has private fields firstName, lastName, passportId, age,
 * gender(String), nationality.
 * - - add public getters and setters.
 *
 * 2.Add in Person class validations with getters and setters with
 * following options
 * - - firstName must be in range 3 to 15
 * - - lastName must be in range 6 to 20
 * - - age must be in range 18 - 99
 * - - gender must be male or female(compareToIgnoreCase())
 * - - passportId must be start with “AN” and contain 6 digits
 * with length 8
 */
public class Person {

    private String firstName, lastName, passportId;
    private int age;
    private String gender, nationality;

    /*
     * - - add all argument constructor, and no argument
     * constructor.
     */
    public Person(String firstName, String lastName,
                  String passportId, int age, String gender, String nationality) {

      /*  this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;*/
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPassportId(passportId);
        this.setAge(age);
        this.setGender(gender);
        this.setNationality(nationality);
    }

    Person() {

        firstName = "Doesn't define!!";
        lastName = "Doesn't define!!";
        passportId = "Doesn't define!!";
        age = 0;
        gender = "Doesn't define!!";
        nationality = "Doesn't define!!";


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

       /* if (firstName.length() < 3 || firstName.length() > 15) {

            System.out.println("String firstName  length can't to be out from 3 to 15!!");
            return;
        } else*/
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        if (lastName.length() < 6 || lastName.length() > 20) {

            System.out.println("String lastName length can't to be out from 6 to 20!!");
            return;
        }
        this.lastName = lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {

        int length = passportId.length();
        boolean isDigit = true;
        for (int i = 2; i < length - 2; i++) {
            if (passportId.charAt(i) < '0' || passportId.charAt(i) > '9') {
                isDigit = false;
                break;
            }
        }
        if (passportId.substring(0, 2).equals("AN") && length == 8 && isDigit) {
            this.passportId = passportId;
        } else {
            System.out.println("Invalid pasport ID");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

       /* if (!isValidAge(age)){
            System.out.println("Can't to be out from18 to 99!!");
            return;

        }*/
        if (age < 18 || age > 99) {

            System.out.println("Can't to be out from18 to 99!!");
            return;
        } else
            this.age = age;
    }



    private  boolean isValidAge(int age){

        return age > 18 && age < 99;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

        if (!("Male".compareToIgnoreCase(gender) == 0 || "female".compareToIgnoreCase(gender) == 0)) {

            System.out.println("gender must be male or female without upper and smaller cases!");
            return;
        } else
            this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /*
     * - - has a display() method which will give all information about
     * the person. Example` firstName is Armen
     */
    public void display() {

        System.out.println("Name is " + firstName + ",lastname is " + lastName +
                ",PassportId is " + passportId + ",age is " + age +
                ",gender is " + getGender() + ",nationality is " + nationality);
    }
}
