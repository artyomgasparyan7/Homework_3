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
        while (i > 0) {

            System.out.println("i = " + i);
            i++;

            if (i == 11) break;
        }
    }

    public static void printIntEvenNumbersFrom1To20() {

        System.out.println("Even numbers:");
        int i = 1;
        while (true) {

            i++;
            if (i % 2 == 0) {
                System.out.println("i = " + i);

            }
            if (i == 21) break;
        }
    }

    /**
     * 3.Print all exact squares of natural numbers that are not
     * exceeding a given positive integer N. Input N from console.
     *
     * @param n
     */
    public static void squaresOfNaturalNumbers(int n) {

        int num = 1;
        while (num * num <= n) {

            System.out.println(num * num);
            num++;

        }
    }

    /**
     * Given an integer number, greater than 2.Find and print the
     * smallest natural divisor other than 1 for a given number.Input
     * number from console.
     *
     * @param n
     * @return
     */
    public static int printSmallestNaturalDivisor(int n) {

        if (n % 2 == 0) {
            return 2;
        }

        int i = 3;
        while (i * i <= n) {

            if (n % i == 0) {

                return i;

            }

            i += 2;
        }

        return n;

    }

    /**
     * 5.Print all integer powers of two not exceeding N in ascending
     * order.Input N from console. Example ` Input 50(You can not use
     * Math.pow())
     *
     * @param n
     */
    public static void integerPowersOfTwoNum(int n) {

        int power = 2;

        if (power >= n) {

            return;
        }

        System.out.println(power);

        while (power < n) {
            power = power * 2;
            if (power < n) {
                System.out.println(power);
            }

        }

    }

    /**
     * 6.For a given integer number N,print all integers in descending
     * order.
     *
     * @param n
     */
    public static void printAllIntegersDescendingOrder(int n) {

        while (n > 0) {

            System.out.print(" " + n);
            n--;

            if (n == 0) {
                break;
            }
        }

    }

    /**
     * 7.For a given integer number N,print all integers that are multiple of
     * 2 in descending order.
     */
    public static void integersMultipleOf2DescendingOrder(int n) {

       /* while (n > 0) {

            if (n % 2 == 0) {

                System.out.print(" " + n);
                n -= 2;

            } else {

                n = n - 1;

                System.out.print(" " + n);
                n -= 2;
            }


        }*/
        if (n % 2 != 0) {

            n--;
        }
        while (n >= 2) {

            System.out.print(" " + n);
            n -= 2;
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
    public static boolean isPower(int n) {

        return (n & n - 1) == 0;
    }

    public static void exactPowerOf2() {

        /*System.out.println("Input numbers: ");
        int input = sc.nextInt();

        int count = 0;

        int number;
        do {

            System.out.println("Input num: ");
            number = sc.nextInt();
            count++;

        } while (!isPower(number));

        System.out.println(count);*/

        int count = 0;
        while (true) {
            int z = sc.nextInt();
            count++;
            if (squareOf2(z)) {
                System.out.print(z + " ");
                break;
            }
        }
        System.out.println(count);

    }

    //checked this number square Of 2 or not!!!
    private static boolean squareOf2(int a) {

        int num = a;
        while (num % 2 == 0 && num >= 1) {
            num /= 2;
        }
        return num == 1;

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
     *
     * @param n
     */
    public static void printSmallestInteger(int n) {

        /*int count = 0;

        int num = 1;

        while (n > num) {

            num = num << 1;

            count++;

            if (num >= n) {

                System.out.println(count);
                break;
            }
        }*/

        int num = 1;
        int k = 0;
        while (num < n) {
            num *= 2;
            k++;
        }
        System.out.println(k);
    }

    /**
     * .Write Java program to print the table of characters that are
     * equivalent to the Ascii codes from 32 to 122.Print 10 characters
     * at each line.
     */
    public static void printTableOfCharacters() {

       /* int min = 32;
        int max = 122;

        while (min <= max) {

            char charac = (char) min;

            System.out.print(" "+charac+" ");


            if (min % 10 == 2&& min!=32) {


                System.out.print("\n");
            }
            min++;


        }*/
        int start = 32;
        int end = 122;

        while (start <= end) {
            char ch = (char) start;
            System.out.print(ch + " ");
            start++;
            if (start % 10 == 2) {
                System.out.print("\n");
            }

        }
    }

    /**
     * .Print all integer numbers from 1 to N, except that are multiple of
     * 3(Input N from console)
     */
    public static void integerNumbersFrom1ToN_Beside3(int n) {

        int num = 0;
        while (num < n) {

            num++;

            if (num % 3 == 0) {
                continue;
            }

            System.out.print(num + " ");
        }
    }

    //this is I don't finish!!
    public static int fibonacci(int k) {
        int first = 0;
        int second = 1;
        int i = 1;
        while (second < k) {
            int temp = first + second;
            first = second;
            second = temp;
            i++;
        }

        return (second == k) ? i : -1;
    }

    public static void printAtleteMilage() {

        float x = 56;
        float y = 85;
        int count = 1;

        while (x < y) {
            x = (float) 1.1 * x;
            count++;
            System.out.print(x + "\t");
        }
        System.out.println("\n" + count);

    }

    public static int athleteMileage(double x, double y) {
        int days = 1;
        while (x < y) {
            x = x + x * 0.1;
            days++;
        }
        return days;
    }

    /**
     * On the first day, the athlete ran x kilometers,and then every day
     * he increased the mileage by 10% from the previous value,Given the
     * number y, determine the number of the day for which the athlete's
     * mileage will be at least y kilometers.
     *
     * @param x
     * @param y
     * @return
     */
    public static int depozidBank(double x, double y) {

        System.out.print("Input num% : ");
        int i = sc.nextInt();
        int days = 1;
        while (x < y) {
            x = x + x * i;
            days++;
        }
        return days;
    }

    /**
     * The sequence consists of different natural numbers and ends
     * with the number 0. Determine the value of the second largest
     * element in this sequence.
     * (A sequence of natural numbers is introduced, ending with the number 0 (the
     * number 0 itself is not included in the sequence, but serves as a sign of its
     * termination))
     */
    public static void DetermineValueOfSecondLargestElement() {

        int max = Integer.MIN_VALUE;
        int second = 0;
        int num;
        do {
            num = sc.nextInt();
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        } while (num != 0);
        System.out.println(second);
    }

    public static void computeSumOfDigits(int num){

        /*int miavor = num%10;
        int haryuravor = num/10%10;*/

        int sum = 0;
        while (num>0){

            sum += num%10;

            num/=10;

        }

        System.out.println(sum);
    }


}






















