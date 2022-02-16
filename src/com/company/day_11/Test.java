package com.company.day_11;

import java.util.Random;
import java.util.Scanner;


public class Test {

    static Scanner sc = new Scanner(System.in);

    /**
     * Write a java program to print all even numbers from a given
     * range, from a to b. Input a and b from console.
     *
     * @param min
     * @param max
     */
    public static void printEvenNumbersFromGivenRange(int min, int max) {

        for (int i = min; i < max; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    /**
     * .Print all numbers on the segment from a to b that give the
     * remainder of c when divided by d. If such numbers do not exist,
     * then you do not need to display anything.
     *
     * @param min
     * @param max
     * @param div
     * @param c
     */
    public static void printAllNumbersOnTheSegment(int min, int max, int div, int c) {

        for (int num = min; num < max; num++) {
            // Short-circuit operator is used
            if (num % div == c)
                System.out.print(num + " ");
        }

    }

    /**
     * .Integers a and b are entered. It is guaranteed that a does not
     * exceed b.
     * Print all numbers on the segment from a to b that are exact
     * squares. If there are no such numbers, then you do not need to
     * display anything.
     *
     * @param min
     * @param max
     */
    public static void PrintSegmentFromexactSquares(int min, int max) {

        for (int i = min; i <= max; i++) {

            if (Math.sqrt(i) == (int) Math.sqrt(i))
                System.out.print(i + " ");
        }

    }

    public static void printExactSquares(int a, int b){

        for (int i = a; i <=b; i++) {

            for (int j = 1; j < i ; j++) {

                if (j == (double)i/j){

                    System.out.println(i);

                }
            }
        }
    }

    /**
     * .Enters 2 integer numbers : x and d from console
     * Count and print one number - how many times the digit d occurs in
     * the representation of a natural number x.
     *
     * @param x
     * @param d
     * @return
     */
    public static int giveRemainderOfCDividedByD(int x, int d) {

        int count = 0;
        for (int i = x; i != 0; i = i / 10) {
            if (i % 10 == d) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given an integer number x
     * Print the number consisting of the digits of the given number x in reverse
     * order. You do not need to output leading zeros.
     *
     * @param number
     * @return
     */
    public static int numberXInReverseOrder(int number) {

        int rev_num = 0;

       /* while (number > 0) {

            rev_num = rev_num * 10 + number % 10;
            number = number / 10;
        }
        return rev_num;*/

       for (; ; ) {

            rev_num = rev_num * 10 + number % 10;
            number = number / 10;
            if (number < 1) {
                return rev_num;
            }
        }

        /*boolean excludeZeros = true;
        for (int i = number; i !=0; i/=10) {
            if (i%10 ==0&&excludeZeros){

                continue;
            }
            System.out.println(i%10 + " ");
            excludeZeros = false;

        }*/


    }

    /**
     * .Given an integer number x
     * Find the smallest natural divisor of x other than 1
     *
     * @param n
     * @return
     */
    public static int printDivisorFromXToY(int n) {

        if (n % 2 == 0)
            return 2;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return i;
        }

        return n;

    }

    /**
     * .Given an integer number x
     * Print all natural divisors of the number x in ascending order (including 1
     * and the number itself).
     *
     * @param n
     */
    public static void countNumberOfNaturalDivisorsOfX(int n) {

//        int count = 0;//1
//        if (n <= 2 * 109) {
//            for (int i = 1; i <= n; i++) {//n/2
//
//
//                if (n % i == 0) {
//                    count++;
//                }
//
//
//            }
//            System.out.println(count);

        int count = 2;

        for (int i = 2; i*i <=n; i++) {

            if (n%i ==0){

                count+=2;

                if (n/i ==i){

                    count--;
                }
        }
        }
        System.out.println(count);
    }

    /**
     * Given an integer x
     * Count the number of natural divisors of x (including 1 and the number
     * itself; x≤2 ∗ 109).
     *
     * @param x
     */
    public static void printAllNaturalDivisors(int x) {

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }

        }
    }

    /**
     * .Calculate the sum of the given 10 natural numbers.
     * Input integers from console
     */
    public static void sumOfNumbersFromConsole() {

        int sum = 0;
        for (int i = 0; i <= 10; i++) {

            int num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }

    /**
     * Convert a natural number from binary to decimal (no more than 10
     * digits in a binary number).
     */
    public static void binaryValueToDecimalByString() {

        String str = "111";

        System.out.println(Integer.parseInt(str, 2));
    }

    public static int numberFromBinaryToDecimal(int n) {

       /* int num = n;
        int dec_value = 0;


        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;*/

        int dec = 0;
        int pow = 1;

        for (int i = n; i!=0; i/=10) {

            dec+=(pow*i%10);

            pow <<=1;
        }
        return dec;

    }

    /**
     * .Enter the number N, followed by N integers.
     * Count how many zeros, positive numbers, negative numbers
     * among the given N numbers.
     * - It is necessary to print first the number of zeros, then the number
     * of positive and negative numbers.
     *
     * @param n
     */
    public static void printCountNumbersPositiveOrNegative(int n) {

        int countP = 0, countN = 0, countZ = 0, i;
        int[] arr = new int[n];


        System.out.print("Enter N Numbers: ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (arr[i] < 0)
                countN++;
            else if (arr[i] > 0)
                countP++;
            else
                countZ++;
        }

        System.out.println("\nPositive Number is: " + countP);
        System.out.println("Negative Number is: " + countN);
        System.out.println("Zero is: " + countZ);
    }

    /**
     * "GNCHE-1" is a complex electronic device that issues every second
     * the next sequence number 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 ... Due to the high
     * cost of electronic components, you have been instructed to develop an
     * emulator for these devices.
     * @param n
     */
    public static void everySecondNextSequenceNumber(int n) {

        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                System.out.println(i);

                count++;

               /* if (count == n){

                    break;
                }*/

                if (count == n){
                    return;
            }
            /*if (count == n){

                break;*/
            }


        }
    }

    /**
     * Write a Java program by using two for loops to produce the output
     * shown below:
     * 1.Input N natural number, print picture like below in size N*N
     *
     * @param n n is count of line!!
     * @param k k is count of stars!!!
     */
    public static void printSquerePicture(int n, int k) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < k; j++) {

                System.out.print('*');

            }
            System.out.println();
        }
    }

    /**
     *
     * @param n
     * @param k
     */
    public static void printCheckerBoardPicture(int n, int k) {

        for (int i = 1; i <= n; i++) {
            System.out.print("\t");
            for (int j = 1; j <= k; j++)
                if ((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0))
                    System.out.print("#");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }

    /**
     * Write a program that prompts user for the size (a positive integer in
     * int); and prints the multiplication table as shown:
     */
    public static void printPicture(int n){

       /* System.out.println("*    |    1    2    3    4    5    6    7    8    9    10");
        System.out.println("---------------------------------------------------------");
        for (int i = 1; i <= 10; ++i) {

            if (i==1) {
                for (int j = 1; j <= 10; j++) {


                    System.out.print(j + "    ");
                }

            }
                if (i==2){

                    for (int j = 2; j <=20; j+=2) {


                        System.out.print(j + "    ");}

                }
            if (i==3){

                for (int j = 3; j <=30; j+=3) {


                    System.out.print(j + "    ");}

            }
            if (i==4){

                for (int j = 4; j <=40; j+=4) {


                    System.out.print(j + "    ");}

            }
            if (i==5){

                for (int j = 5; j <=50; j+=5) {


                    System.out.print(j + "    ");}

            }
            if (i==6){

                for (int j = 6; j <=60; j+=6) {


                    System.out.print(j + "    ");}

            }
            if (i==7){

                for (int j = 7; j <=70; j+=7) {


                    System.out.print(j + "    ");}

            }
            if (i==8){

                for (int j = 8; j <=80; j+=8) {


                    System.out.print(j + "    ");}

            }
            if (i==9){

                for (int j = 9; j <=90; j+=9) {


                    System.out.print(j + "    ");}

            }
            if (i==10){

                for (int j = 10; j <=100; j+=10) {


                    System.out.print(j + "    ");}

            }



            System.out.println();
        }*/

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.print(" * | ");
            } else {
                System.out.print(i + "   ");
            }
        }

        System.out.print("\n____________________________________________\n");
        for (int i = 1; i <= n; i++) {
            if (i < 10) {
                System.out.print(" " + i + " |");
            } else {
                System.out.print(i + " |");
            }
            for (int j = 1; j <= n; j++) {
                if (i * j < 10) {
                    System.out.printf("%2d  ", (i * j));
                } else {
                    System.out.printf(" %2d ", (i * j));
                }
            }
            System.out.println();
        }


    }

    /**
     * Write 4 programs (X = A, B, C, D) that prompts user for the
     * size (a non-negative integer in int); and prints each of the patterns as
     * shown:
     * @param n
     */
    //A Pattern
    public static void printAPattern(int n){

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print('*');
            }
            System.out.println();

        }
    }

    //B Pattern
    public static void printBPattern(int n){

        for (int i = 0; i < n; i++) {

            for (int j = n; i < j; j--) {

                System.out.print('*');
            }
            System.out.println();

        }
    }

    public static void printPatternC(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(( j >= i ? "* " : "  "));
            }
            System.out.println();
        }
    }

    public static void printPatternD(int n)
    {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                System.out.print(( j >= i ? "* " : "  "));
            }
            System.out.println();
        }
    }

    }





