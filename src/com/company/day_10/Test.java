package com.company.day_10;

import java.util.Scanner;

public class Test {

    static Scanner sc = new Scanner(System.in);
    /**
     * The break command is a command that works inside Java
     * while (and for) loops. When the break command is met, the
     * Java Virtual Machine breaks out of the while loop, even if the
     * loop condition is still true. No more iterations of the while loop
     * are executed once a break command is met. Here is a break
     * command example inside a while loop:
     */

    /**
     * 1.Print all integer numbers from 1 to 10.
     */
    public static void printIntNumbersFrom1To10() {

        int i = 1;
        while (i>0){

            System.out.println("i = " + i);
            i++;

            if (i==11) break;
        }
    }

    public static void printIntEvenNumbersFrom1To20() {

        System.out.println("Even numbers:");
        int i = 1;
        while (i<20){

            i++;
            if (i%2 == 0) {
                System.out.println("i = " + i);


                if (i == 21) break;
            }
        }
    }

    /**
     * 3.Print all exact squares of natural numbers that are not
     * exceeding a given positive integer N. Input N from console.
     * @param n
     */
    public static void squaresOfNaturalNumbers(int n){

        int square = 0, odd = 1;

        int x = 0;

        while (x < n)
        {
            x++;

            System.out.print(square +
                    " " );

            // Update 'square'
            // and 'odd'
            square = square + odd;
            odd = odd + 2;
            if (square == n) break;
        }

        }

    /**
     * Given an integer number, greater than 2.Find and print the
     * smallest natural divisor other than 1 for a given number.Input
     * number from console.
     * @param n
     * @return
     */
    public static int printSmallestNaturalDivisor(int n){

        if (n % 2 == 0)
            return 2;

        int i = 3;
        while (i * i <= n)  {

            i += 2;
            if (n % i == 0)
                return i;
        }

        return n;

        }

    /**
     * 5.Print all integer powers of two not exceeding N in ascending
     * order.Input N from console. Example ` Input 50(You can not use
     * Math.pow())
     * @param n
     */
    public static void integerPowersOfTwoNum(int n) {

           int  power=2;

            if (power>=n){

                return ;
            }

            System.out.println(power);

            while(power<n){
                power=power*2;
                if (power<n){
                System.out.println(power);}

        }

    }

    /**
     *6.For a given integer number N,print all integers in descending
     * order.
     * @param n
     */
    public static void printAllIntegersDescendingOrder(int n){

        while (n>0){

            System.out.print(" " + n);
            n--;

            if (n == 0)break;
        }

    }

    /**
     * 7.For a given integer number N,print all integers that are multiple of
     * 2 in descending order.
     */
    public static void integersMultipleOf2DescendingOrder(int n){

        while (n>0){

            if (n%2==0){

                System.out.print(" " + n);
                n-=2;

            }else {

                n = n-1;

                System.out.print(" " + n);
                n-=2;
            }


        }

    }

    /**
     * Input N natural number till N would be the exact power of 2.If N is
     * the exact power of 2 .
     * - Print N
     * - Print count of input integers
     * - break loop
     */

    //number is power of 2 or not
    public static boolean isPower(int n){

        if ((n& n-1) == 0){

            return true;
        }

        return false;
    }
    public static void exactPowerOf2(){

        System.out.println("Input numbers: ");
        int input = sc.nextInt();

        int count = 0;

        int number;
        do {

            System.out.println("Input num: ");
            number = sc.nextInt();
            count++;

        }while (!isPower(number));

        System.out.println(count);

    }

   /* public static int printSmallestInteger(int n){

        int p = 1;
        if (n > 0 && (n & (n - 1)) == 0)
            return n;

        while (p < n)
            p <<= 1;

        return p;

    }*/

    /**
     * 9.For a given natural N print the smallest integer k that`
     * Math.pow(2,k)≥N.(You can not use Math.pow())
     * @param n
     */
    public static void printSmallestInteger(int n){

        int count = 0;

        int num = 1;

        while (n>num){

            num = num <<1;

            count++;

            if (num > n){

                System.out.println(count);
                break;
            }
        }
    }

    /**
     * .Write Java program to print the table of characters that are
     * equivalent to the Ascii codes from 32 to 122.Print 10 characters
     * at each line.
     */
    public static void printTableOfCharacters(){

        int min = 32;
        int max = 122;

        while (min<max){

            char charac = (char) min;

            System.out.println(charac);

            if (charac % 10 == 2){

                System.out.println("\n");
            }

            min++;
         }
    }

    /**
     * .Print all integer numbers from 1 to N, except that are multiple of
     * 3(Input N from console)
     */
    public static void integerNumbersFrom1ToN_Beside3(int n){

        int num = 0;
        while (num<n){

            num++;

            if (num%3==0) continue;

            System.out.print(num + " ");
        }
    }
//this is I don't finish!!
    public static void isFibonacciNumber(int n){

        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series Upto " + n + ": ");

        while (firstTerm <= n) {

            if (firstTerm == n)
                break;
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

    }

        }

        //other chapter I sill don't finish!!
}












