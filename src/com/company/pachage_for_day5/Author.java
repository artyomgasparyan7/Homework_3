package com.company.pachage_for_day5;

/**
 * . Define Author class which
 *  Has fields name, email, gender  define all argument constructor
 *  write method which will print all information about Author
 *  create an instance of Author and print all info about him
 */
public class Author {

    String name, email,gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void allInform() {

        System.out.println("Name is: " + name + ", email is: " + email + ", Gender is: " + gender);

    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
