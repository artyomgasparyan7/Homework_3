package com.company.day_9;

import java.util.Locale;
import java.util.Scanner;

public class Test {

    static Scanner sc = new Scanner(System.in);

   /* public static void compareTwoString(){

        System.out.print("Input the first String: ");
        String str1 = sc.nextLine();

        System.out.print("\nInput the second String: ");
        String str2 = sc.nextLine();

        if (str1 == str2){

            System.out.println(str1 + "==" +str2 +": ");
        }
        if (str1.equals(str2)){

            System.out.println(str1+"equals"+str2 + ": ");
        }

    }*/

    //Example 1 and 2 in compareTwoString method!!!
    /**
     * Write a java program, which has 2 String variables, initialize them from
     * console.
     * - - Compare them with == assignment
     * - - Compare them with equals to
     * One
     * with literal, another using new keyword
     * @param name1
     * @param name2
     */
    public static void compareTwoString(String name1, String name2){


        //2 String variables, initialize them'
        //One with literal
        String var1 = "Bootcamp";
        //another using new keyword
        String var2 = new String("Bootcamp");

        if (var1 == var2){

            System.out.println("var1 == var2");
        }
        if (var1.equals(var2)){
            System.out.println("var1 equals var2");
        }

        //after initialize them,I used Assignment operator and to used campare two strings
        var1 = name1;
        var2 = name2;

        System.out.println("I used Assignment operator and to used campare two strings:");
        if (var1 == var2){

            System.out.println("var1 == var2");
        }
        if (var1.equals(var2)){
            System.out.println("var1 equals var2");
        }

    }

    /**
     * Input integer value from console, if value greater than 0 print
     * n positive, else print negative.
     * - - Input integer value from console, if value greater than 0 print
     * positive, else print negative, else if 0 print 0;
     */
    public static void valuesPositiveOrNegative(){

        System.out.print("Input number1: ");
        int value = sc.nextInt();

        //value greater than 0 positive, else print negative
        String result = value>0?"positive":"negative";
        System.out.println(result);

        //value greater than 0 positive, else print negative, else if 0 print 0
        System.out.print("Input number2: ");
        int value2 = sc.nextInt();


      /*  String result2 = value2>0?((value2 == 0)?"0":"positive"):"negative";
        System.out.println(result2);*/
        if (value2>0){

            System.out.println("positive");
        }else if (value2 == 0){

            System.out.println("0");
        }else{ System.out.println("negative");}

    }

    /**
     * Using ternary operator`
     * - - achieve Math.max(a,b) function
     * @param a
     * @param b
     */
    public static void maxValue(int a, int b){

        /*int res = Math.max(5,8);
        System.out.println("Max value: " + res);*/
       int  Smax = (a > b) ? a : b;

        // Print the largest number
        System.out.println("Max number between " + b +
                " and " + a + " is: " + Smax + ". " );
    }

    /**
     * Using ternary operator`
     * - - achieve Math.abs(a) function
     * @param value
     */
    public static void absaluteValue(int value){

        int result = (value<0)?-value:value;

        System.out.println("achieve Math.abs(a) function: " + result);
    }

    /**
     * Using ternary operator check if the given String
     * - - is a null so return -1
     * - - if given String is “ ” return 0
     * - - else return 1
     * @param name
     * @return
     */
    public static int checkName(String name) {

        int result = name == null ? -1 : name == " " ? 0 : 1;

        return result;
    }

    /**
     * Write a java program to find maximum from a given 3 integer
     * numbers using ternary operator.Input numbers from console
     * @param a
     * @param b
     * @param c
     */
    public static void printMaxValue(int a, int b, int c){

        int max = (a>=b&&a>=c) ? a : (b>=a&&b>=c) ? b : c;
        System.out.println("Max value of 3 numbers: " + max);
    }

    /**
     * .Write a Java program that allows the user to choose the correct answer
     * of a question.If he choose correct answer Print “Congratulation”,
     * in case of illegal choice print “Invalide choice”.
     * @param x
     */
    public static void chooseCorrectAnswer(char x){

        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
        System.out.println("a. int 1x=10;");
        System.out.println("b. int x=10;");
        System.out.println("c. float x=10.0f;");
        System.out.println("d. string x=\"10\";");
        System.out.println("Enter your choice: ");

        switch (x){

            case 'a':

                System.out.println("Invalide choice, name of type cann't be start numbers!!!");
                break;

            case 'b':

            case 'c':
                System.out.println("Congratulation");
                break;

            case 'd':

                System.out.println("Invalide choice, String Type name cann't be start lowerCase");

                break;
            default:
                System.out.println("this character mistake value!!!");

        }
    }

    /**
     * .Write Java Program to check Vowel or Consonant using Switch Case.
     * @param x
     */
    public static void checkVowelOrConsonant(char x){

        switch (x){

            case 'a':
            case 'A':

            case 'e':
            case 'E':

            case 'i':
            case 'I':

            case 'o':
            case 'O':

            case 'u':
            case 'U':

                System.out.println("Vowel : " + x);

                break;
            default:
                System.out.println("Consonant : " + x);

        }

    }

    /**
     * If the user pressed number keys( from 0 to 9), the program will tell the
     * number that is pressed, otherwise, the program will show "Not allowed".
     * @param x
     */
    public static void isPressedNumberKeys(int x) {

        switch (x) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:


                System.out.println("the number that is pressed : " + x);

                break;
            default:
                System.err.println("Not allowed");

        }
    }

    /**
     * .Using switch statements determine if the number is even or odd.
     * Input number from console
     * @param x
     */
    public static void isEvenOrOdd(int x) {

        switch (x % 2) {//this will return 0
            case 0:
                System.out.println(x + " is an Even number");
                break;
            case 1:
                System.out.println(x + " is an Odd number");
        }

    }

    /**
     * Program to make a calculator using switch case in Java
     * In this Program we are making a simple calculator that performs addition, subtraction,
     * multiplication and division based on the user input. The program takes the value of both
     * the numbers (entered by user) and then user is asked to enter the operation (+, -, * and
     * /), based on the input program performs the selected operation on the entered
     * numbers using switch case.
     * @param x
     */
    public static void simpleCalculator(char x){

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("\nEnter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nEnter an operator (+, -, *, /): ");
        switch (x){

            case '+':

                System.out.print("num1 + num2 = ");
                System.out.println(num1 + num2);
                break;

            case '-':

                System.out.print("num1 - num2 = ");
                System.out.println(num1 - num2);
                break;

            case '*':

                System.out.print("num1 * num2 = ");
                System.out.println(num1 * num2);
                break;

            case '/':

                System.out.print("num1 / num2 = ");
                System.out.println(num1 / num2);
                break;


            default:
                System.err.println("Simvol is mistake!!!!");
        }
    }

    /**
     * Given the String variable day holding the name of the weekday Sunday, Monday, etc., set an
     * int variable to 1, 2, etc.
     * @param day
     */
    public static void inputStringVariableDay(String day){

        String result = day.toLowerCase(Locale.ROOT);
        switch (result){

            case "sunday":
                System.out.print("Day of weekday: ");
                System.out.println(1);
                break;

            case "monday":
                System.out.print("Day of weekday: ");
                System.out.println(2);
                break;

            case "tuesday":
                System.out.print("Day of weekday: ");
                System.out.println(3);
                break;

            case "wednesday":
                System.out.print("Day of weekday: ");
                System.out.println(4);
                break;

            case "thursday":
                System.out.print("Day of weekday: ");
                System.out.println(5);
                break;

            case "friday":
                System.out.print("Day of weekday: ");
                System.out.println(6);
                break;

            case "saturday":
                System.out.print("Day of weekday: ");
                System.out.println(7);
                break;

            default:
                System.err.println("that is no weekday");
        }
    }

    /**
     * The program will read three types of scores(quiz, mid-term, and final scores) and
     * determine the grade based on the following rules:
     */
    public static void threeTypesOfScores(){

        System.out.print("Quiz score: ");
        double average = 0;
        average += sc.nextDouble();

        System.out.print("\nMid-term score: ");
        average += sc.nextDouble();

        System.out.print("\nFinal score: ");
        average += sc.nextDouble();
        average /= 3;

        if (average >= 80) {

            System.out.println("Your grade is A");
        } else if (average >= 60 && average<80) {

            System.out.println("Your grade is B");
        } else if (average >= 40 && average<60) {

            System.out.println("Your grade is C");
        } else {
            System.out.println("Your grade is F");
        }

    }


}
