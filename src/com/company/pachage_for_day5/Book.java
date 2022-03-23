package com.company.pachage_for_day5;

/**
 * Define Book class which
 *  Has fields name, author, price
 *  define all argument constructor
 *  write method which will print all information about Book
 *  write methods which will print name and email of the author
 *  create 2 instances of Book, which has same author
 *  print all info about books
 */
public class Book {

    String name;
    Author author;
    double price;
    char gender;

    public Book(String name, Author auther, double price){


        this.name = name;
        author = auther;
        this.price = price;
    }




    public void allInform() {

        System.out.println("Name is: " + name + ", auther is: " + author + ", Price is: " + price);

    }

    public void nameAuthor(){

        System.out.println("Name of author: " + author.name);
    }

    public void emailAuther(){

        System.out.println("mail of auther: " + author.email);
    }





}
