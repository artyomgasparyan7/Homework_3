package com.company.day_8;

import java.util.Random;
import java.util.Scanner;

public class HomeworkTest8 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Random random = new Random();
       eligibleToVote();

        printEvenNumber();

        isEvenOR(4);

       printRandom();

        printMultipleOf5();

        printGreatestNumber();

        printAbsolute();

        nameOfWeekday();

        printInputKValue();

        checkYearIsLeap();
        //printIntRandom(random.nextInt());

        isLeapYear(4);

        printIntRandom();

        inputNumsCorresponds();

        printOddAndEven();

        coordinatesOfTwoPoints();

        printNonDegenerateTriangle();

        countOfSameValue();

        printQuadraticEquation();

        sortedNumberNon_decreasingOrder();


    }

    /**
     * Write a Java program to allow the user to input his/her age. Then the
     * program will show if the person is eligible to vote. A person who is
     * eligible to vote must be older than or equal to 18 years old.
     */
    public static void eligibleToVote() {
        System.out.print("Input  age: ");
        byte age = new Scanner(System.in).nextByte();


        if (age >= 18) {

            System.out.println("\n Person is eligible To Vote");
        } else if (age >= 0 ) {

            System.out.println("\n Person is not eligible To Vote");
        } else System.err.println("Person ages isn't to be negative value!!!");
    }

    /**
     * Write a Java program to determine whether an input number is an
     * even number.
     */
    public static void printEvenNumber() {


        System.out.print("Input number: ");
        double num = new Scanner(System.in).nextDouble();

        boolean b1 = true;
        boolean b2 = false;

        boolean result;
        if (num % 2 == 0 && num != 0) {

            System.out.println("Input num is ever: " + b1);

        } else System.err.println("Input num is not ever: " + b2);


        result = (num % 2 == 0 && num != 0) ? b1 : b2;
        System.out.println("By ternary operator");
        System.out.println("Input num is ever: " + result);

    }

    public static boolean isEvenOR(double s) {

      /* if (s % 2 == 0 && s != 0) {
           System.out.println("Number is even!");
       }*/
        boolean c = s % 2 == 0 && s != 0;
        System.out.println(c);
        return false;
    }

    /**
     * Generate and print random integer number between 2 to 7(not using
     * bound)
     */
    public static void printRandom() {

        Random r = new Random();
        int low = 2;
        int high = 7;
        int result = (int) (Math.random() * ((high - low) + 1)) + low;
        //int res = (int)(Math.random()* 6)+2;
        //int result = r.nextInt(high-low) + low;

        System.out.println("Random value from 2 between 7: " + result);
    }

    /**
     * Write a Java program to determine whether an input number is a
     * multiple of a 5.
     */
    public static void printMultipleOf5() {

        System.out.print("Input num: ");
        double num = sc.nextDouble();

        if (num % 5 == 0) {

            System.out.println("this number is multiple in 5:");
        } else System.err.println("this number isn't multiple in 5:");

    }

    /**
     * Take three numbers from the user and print the greatest number.
     */
    public static void printGreatestNumber() {

        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.print("\nInput the second number: ");
        int num2 = sc.nextInt();
        System.out.print("\nInput the third number: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {

            System.out.println("The greatest Number is : " + num1);
        } else if (num2 >= num1 && num2 >= num3) {

            System.out.println("The greatest Number is : " + num2);
        } else System.out.println("The greatest Number is : " + num3);


    }

    /**
     * Write a Java program that reads a floating-point number and prints
     * "zero" if the number is zero. Otherwise, print "positive" or "negative".
     * Add "small" if the absolute value of the number is less than 1, or
     * "large" if it exceeds 1,000,000
     * (use Math.abs() for absolute value)
     */
    public static void printAbsolute() {

        String typeOfSign = "zero";
        String absolute = "";

        System.out.print("Input number: ");
        double num = sc.nextDouble();


        if (num > 0) typeOfSign = "positive";
        else if (num < 0) typeOfSign = "negative";

        double nums = Math.abs(num);
        if (nums > 1_000_000) absolute = "large";
        else if (nums < 1 && nums != 0) absolute = "small";

        System.out.println("sign is: " + typeOfSign + " : " + absolute);

    }

    /**
     * Write a Java program that keeps a number from the user and generates
     * an integer between 1 and 7 and displays the name of the weekday.
     */
    public static void nameOfWeekday() {

        System.out.print("Input num of weekday : ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 7) {

            if (num == 1) System.out.println("Sunday");
            else if (num == 2) System.out.println("Monday");
            else if (num == 3) System.out.println("Tuesday");
            else if (num == 4) System.out.println("Wednesday");
            else if (num == 5) System.out.println("Thursday");
            else if (num == 6) System.out.println("Friday");
            else if (num == 7) System.out.println("Saturday");

        } else System.err.println("Is not weekdays!!!!!");
    }

    /**
     * The ice cream parlor sells three balls and five balls. Can you buy
     * exactly k balls of ice cream?
     * In the cafe they sell an ice-cream with 3 balls and 5 balls.Input K integer
     * value from console, check if you can buy exactly K balls ice-cream.
     */
    public static void printInputKValue() {

        System.out.print("Input num: ");
        int num = sc.nextInt();
        if (num == 0 || num == 1 || num == 2 || num == 4 || num == 7) {

            System.err.println("5 and 3 value can not buy exactly K balls ice-cream");
        } else System.out.println("5 and 3 value can buy exactly K balls ice-cream");
    }

    /**
     * LEAP YEAR
     * Write a Java program that takes a year from the user and print whether
     * that year is a leap year or not.
     */
    public static void checkYearIsLeap() {


        System.out.print("Input year: ");
        int num = sc.nextInt();

        /*if (num % 4 ==0){

            if (num % 100 == 0){

                if (num % 400 ==0){

                    System.out.println("Leap Year:");
                }else {System.out.println("Not a Leap  Year:");}


            }else{ System.out.println("Leap Year:");}


        }else {System.out.println("Not a Leap  Year:");}*/

        if (num % 100 != 0 && num % 4 == 0 || num % 400 == 0) {

            System.out.println("Yes :  not a leap year : ");
        } else System.out.println("No: Leap year");
    }

    public static boolean isLeapYear(int s) {

        /*int num = sc.nextInt();
        return (num % 4 == 0 && num % 100 != 0) || (num % 400 == 0);*/

        boolean c = (s % 4 == 0 && s % 100 != 0) || (s % 400 == 0);
        System.out.println(c);
        return false;
    }

    /**
     * .Generate random integer value, print true if random value
     * corresponds these conditions, else print false(use boolean primitive
     * type)
     * -input number is greater than -1000 and less than 1000
     * -input number is multiple of 3 or input number is multiple of 5
     */
    public static void printIntRandom() {

        System.out.print("Input number: ");
        int i = sc.nextInt();
        boolean b = true;

        int min = -1000;
        int max = 1000;


        if (i > min && i < max) {
            int result = (int) (Math.random() * ((max - min) + 1)) + min;
            System.out.println(result + " : " + b);

        } else System.err.println("Out of !!" + " : " + !b);

        if (i % 3 == 0 || i % 5 == 0) {

            System.out.println("The number is multiple of 3 or input number is multiple of 5");
        }

    }

    /**
     * Input from console int a and int b, if a and b corresponds for following
     * requirements print “Both a and b legal”, if any of them does not
     * correspond print about it like this “a is legal b is illegal ''. or vice versa
     * - a > 10 and b is not equal to 10
     * - both a and b is positive
     * - both a and b is negative
     * - a > 10 b < 1 both of them are odd
     * - a is a multiple of 5 OR b is a multiple of 5
     * - a is not a multiple of 5 but b is a multiple of 5
     */
    public static void inputNumsCorresponds() {

        System.out.print("Input a value:");
        int a = sc.nextInt();

        System.out.print("\nInput b value:");
        int b = sc.nextInt();

        System.out.println("\n a > 10 and b is not equal to 10");
        if (a > 10 && b != 10) {

            System.out.println("Both a and b legal");
        } else if (a <= 10 && b != 10) {

            System.out.println("a is illegal b is legal");
        } else if (a > 10 && b == 10) {

            System.out.println("a is legal b is illegal");

        } else {
            System.out.println("Both a and b illegal");
        }

        System.out.println("Is all positive value? ");

        if (a > 0 && b > 0) {

            System.out.println("Both a and b legal");
        } else if (a <= 0 && b > 0) {

            System.out.println("a is illegal b is legal");

        } else if (a > 0 && b <= 0) {

            System.out.println("a is legal b is illegal");

        } else {
            System.out.println("Both a and b illegal");
        }

        System.out.println("Is all negative value? ");

        if (a < 0 && b < 0) {
            System.out.println("Both a and b legal");

        } else if (a < 0 && b >= 0) {

            System.out.println("a is legal b is illegal");

        } else if (a >= 0 && b < 0) {

            System.out.println("a is illegal b is legal");

        } else {
            System.out.println("Both a and b illegal");
        }

        System.out.println("a > 10 b < 1 both of them are odd:");

        if (a > 10 && b < 1) {

            System.out.println("Both a and b legal");
        } else if (a <= 10 && b < 1) {

            System.out.println("a is illegal b is legal");
        } else if (a > 10 && b >= 1) {

            System.out.println("a is legal b is illegal");
        } else {
            System.out.println("Both a and b illegal");
        }

        if (a % 2 != 0 && b % 2 != 0) {

            System.out.println("a  and  b  is odd!");

           /* if (a > 10 && b < 1){

                System.out.println("Both a and b legal");
            }else if (a<= 10 && b<1){

                System.out.println("a is illegal b is legal");
            }else if (a > 10 && b >= 1){

                System.out.println("a is legal b is illegal");
            }*/
        } else if (a % 2 == 0 && b % 2 != 0) {

            System.out.println("a  isn't odd,    b  is odd!");
        } else if (a % 2 != 0 && b % 2 == 0) {

            System.out.println("a  is odd,    b  isn't odd!");
        } else {
            System.err.println("a  and  b + is not odd!!!");
        }

        System.out.println("a is a multiple of 5 OR b is a multiple of 5: ");

        //or a or b is multiple of 5
        if (a % 5 == 0 || b % 5 == 0) {

            System.out.println("Both a or b legal,because or a or b is multiple of 5");
        } else if (a % 5 != 0 || b % 5 != 0) {

            System.out.println("Both a or b illegal,because or a or b isn't multiple of 5");

        }

        System.out.println("a is not a multiple of 5 but b is a multiple of 5: ");

        if (a % 5 != 0 && b % 5 == 0) {

            System.out.println("Both a and  b legal");
        } else if (a % 5 == 0 && b % 5 == 0) {

            System.out.println("a is illegal b is legal");
        } else if (a % 5 != 0 && b % 5 == 0) {

            System.out.println("a is legal b is illegal");
        } else {
            System.out.println("Both a and  b illegal");
        }

    }

    /**
     * Input int values a and b from console
     * - if one of them is multiple of 7, and both positive, and a
     * greater than b, print all odd values between them
     * - else print all even values between them
     */
    public static void printOddAndEven() {

        System.out.print("Input a value: ");
        int a = sc.nextInt();

        System.out.print("Input b value: ");
        int b = sc.nextInt();

        if ((a % 7 == 0 || b % 7 == 0) && (a > 0 && b > 0) && (a > b)) {

            System.out.println("print all odd values between them: ");
            for (int i = b; i < a; i++) {

                if (i % 2 != 0) System.out.print(i + " ");

            }
        } else {

            System.out.println("print all even values between them: ");
            for (int i = b; i < a; i++) {

                if (i % 2 == 0) System.out.print(i + " ");

            }

            for (int i = a; i < b; i++) {

                if (i % 2 == 0) System.out.print(i + " ");

            }

        }

    }

    /**
     * Given coordinates of two points in the coordinate plane.Write
     * java program to check if the points lie in the same plane?(quarter)
     * - Print In the same quarter , else print Not in the same quarter.
     * - Input 4 coordinates from console, all 4 coordinates != 0
     */
    public static void coordinatesOfTwoPoints() {

        System.out.println("the first coordinate points։ ");
        System.out.print("X1 is point of the first coordinate:");
        int X1 = sc.nextInt();

        System.out.print("\nY1 is point of the first coordinate:");
        int Y1 = sc.nextInt();

        System.out.println("\nthe second coordinate points։ ");
        System.out.print("X2 is point of the second coordinate:");
        int X2 = sc.nextInt();

        System.out.print("\nY2 is point of the first coordinate:");
        int Y2 = sc.nextInt();

        if ((X1 > 0 && X2 > 0) && (Y1 > 0 && Y2 > 0)) {

            System.out.println("this is 1 quarter: both of first and second coordinate point is same quarter");
        } else if ((X1 < 0 && X2 < 0) && (Y1 > 0 && Y2 > 0)) {

            System.out.println("this is 2 quarter: both of first and second coordinate point is same quarter");
        } else if ((X1 < 0 && X2 < 0) && (Y1 < 0 && Y2 < 0)) {

            System.out.println("this is 3 quarter: both of first and second coordinate point is same quarter");
        } else if ((X1 > 0 && X2 > 0) && (Y1 < 0 && Y2 < 0)) {

            System.out.println("this is 4 quarter: both of first and second coordinate point is same quarter");
        } else System.err.println("Coordinate point is not same quarter");
    }


    /**
     * Given 3 positive numbers different from 0, Determine if there is
     * a non-degenerate triangle with such sides.
     * - Input numbers from console
     */
    public static void printNonDegenerateTriangle() {

        boolean result = true;
        System.out.print("Input side 1 : ");
        int side1 = sc.nextInt();

        System.out.print("Input side 2 : ");
        int side2 = sc.nextInt();

        System.out.print("Input side 3 : ");
        int side3 = sc.nextInt();

        if (side1 + side2 > side3) {
            System.out.println(result);
        } else if (side1 + side3 > side2) {
            System.out.println(result);
        } else {
            System.out.println("false");
        }
    }

    /**
     * Given 3 numbers, print count of numbers that equals to each
     * other.(Input numbers from console)
     */
    public static void countOfSameValue() {

        int count = 0;
        System.out.print("Input num1 number: ");
        int num1 = sc.nextInt();

        System.out.print("Input num2 number: ");
        int num2 = sc.nextInt();

        System.out.print("Input num3 number: ");
        int num3 = sc.nextInt();

        if (num1 == num2 && num1 == num3 && num2 == num3) {

            System.out.println("Count is : " + (count += 3));
        } else if (num1 == num3 || (num1 == num2) || (num2 == num3)) {

            System.out.println("Count is : " + (count += 2));
        } else System.err.println("Count of same value is not found!!!");
        /*if (num1 == num2){

            count++;
        }if (num1 == num3){
            count++;
        }if (num2 == num3){
            count++;
        }
        else if (num2 == num1){

            count++;
        }if (num2 == num3){
            count++;
        }if (num1 == num3){
            count++;
        }
        else if (num3 == num2){

            count++;
        }if (num3 == num1){
            count++;
        } if (num2 == num1){
            count++;
        }*/

        //System.out.println("Count is : " + count);


    }

    /**
     * .Given 3 real numbers a , b , c .FInd all decisions for
     * ax2 + bx + c = 0.
     */
    public static void printQuadraticEquation() {

        double x1;
        double x2;
        boolean logic = false;
        System.out.print("Input a number: ");
        int a = sc.nextInt();

        System.out.print("Input b number: ");
        int b = sc.nextInt();

        System.out.print("Input c number: ");
        int c = sc.nextInt();

        double D = b * b - 4 * a * c;

        System.out.println("Print all decisions: ");
        if (D >= 0) {

            x1 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("X1 value is : " + x1);

            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("X2 value is : " + x2);

        } else System.out.println("Can't be: " + logic);

    }

    /**
     * .Given 3 integer values arrange them in non-decreasing order.
     */
    public static void sortedNumberNon_decreasingOrder() {

        System.out.print("Input first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();

        System.out.print("Input thirt number: ");
        int num3 = sc.nextInt();

        if ((num1 >= num2 && num1 >= num3) && num2 >= num3) {

            System.out.printf("Sorted numbers Non_decreasing Order are %d %d %d", num3, num2, num1);
        } else if ((num1 >= num2 && num1 >= num3) && num3 >= num2)

            System.out.printf("Sorted numbers Non_decreasing Orde rare %d %d %d", num2, num3, num1);
        else if ((num2 >= num1 && num2 >= num3) && num1 >= num3) {

            System.out.printf("Sorted numbers Non_decreasing Order are %d %d %d", num3, num1, num2);
        } else if ((num2 >= num1 && num2 >= num3) && num3 >= num1)
            System.out.printf("Sorted numbers Non_decreasing Order are %d %d %d", num1, num3, num2);
        else if ((num3 >= num2 && num3 >= num1) && num2 >= num1) {
            System.out.printf("Sorted numbers Non_decreasing Order are %d %d %d", num1, num2, num3);
        } else if ((num3 >= num2 && num3 >= num1) && num1 >= num2) {
            System.out.printf("Sorted numbers Non_decreasing Order are %d %d %d", num2, num1, num3);
        }
    }
}