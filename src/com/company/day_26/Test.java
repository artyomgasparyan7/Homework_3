package com.company.day_26;

/**
 * 1.Write a recursive function
 */
public class Test {

    /**
     * 1. to find the sum of a given array.
     *
     * @param arr
     * @return
     */
    public static int sum(int[] arr, int legth) {

        if (legth <= 0)
            return 0;
        return (sum(arr, legth - 1) + arr[legth - 1]);


    }

    /**
     * 1.to find the factorial of a given natural N.
     *
     * @param n
     * @return
     * @throws Exception
     */
    public static int factorial(int n) throws Exception {

        if (n == 1) {

            return 1;
        } else if (n <= 0) {

            try {

                return n * factorial(n + 1);
            } catch (Exception e) {

                throw new Exception("Error");

            }

        } else return n * factorial(n - 1);

    }

    /**
     * 2.Write a fib(int) function which returns n-th fibonacci number.
     *
     * @param n
     * @return
     */
    public static int fibonaci(int n) {

        if (n <= 1) {

            return 1;
        } else return fibonaci(n - 1) + fibonaci(n - 2);
    }

    /**
     * 3.We have triangles made of blocks. The topmost row has 1 block, the
     * next
     * row down has 2 blocks, the next row has 3 blocks, and so on. Compute
     * recursively (no loops or multiplication) the total number of blocks in
     * such a triangle with the given number of rows.
     * Example` triangle(0) -> 0
     * triangle(1) -> 1
     * triangle(2) -> 3
     *
     * @param n
     * @return
     */
    public static int numberOfBlocks(int n) {

        // int num = (2<<(n))/2-1;

        if (n <= 0) {

            return 0;

        } else return n + numberOfBlocks(n - 1);


    }

    /**
     * 4.Given a non-negative int n, return the sum of its digits recursively (no
     * loops).
     *
     * @param n
     * @return
     */
    public static int sumOfDigits(int n) {

        if (n > 0) {
            if (n < 10) return n;

            return (n % 10) + sumOfDigits(n / 10);
        } else return 0;

    }

    /**
     * 5.Given a non-negative int n, return the count of the occurrences of 7 as
     * a digit, so for example 717 yields 2.
     *
     * @param n
     * @return
     */
    public static int countOfOccurrences7Digits(int n) {

        int count = 0;

        if (n < 1) return 0;

        if (n % 10 == 7) count++;

        return count + countOfOccurrences7Digits(n / 10);

    }

    /**
     * 6.Given a string, compute recursively (no loops) the number of
     * lowercase 'x' chars in the string.
     * Example`
     * countX("xxhixx") → 4
     * countX("xhixhix") → 3
     * countX("hi") → 0
     *
     * @param str
     * @return
     */
    public static int countX(String str) {

        int count = 0;

        if (str.length() == 0)
            return 0;

        if (str.charAt(0) == 'x') count++;

        return count + countX((str.substring(1)));

    }

    /**
     * 7.Given a string, compute recursively a new string where all the 'x' chars
     * have been removed.
     * Use` str.substring()
     *
     * @param str
     * @return
     */

    public static String XCharsHaveBeenRemoved(String str) {

        char character;

        if (str.length() == 0)
            return str;
        character = str.charAt(0);
        if (character == 'x')
            return XCharsHaveBeenRemoved(str.substring(1));
        return character + XCharsHaveBeenRemoved(str.substring(1));
    }

    /**
     * 8.Write recursive function that reverses the given String.
     * Example` HELLO -> OLLEH
     *
     * @param str
     */
    public static void reverseString(String str) {


        if ((str == null) || (str.length() <= 1))
            System.out.println(str);
        else {
            System.out.print(str.charAt(str.length() - 1));
            reverseString(str.substring(0, str.length() - 1));
        }
    }

    /**
     * 9.Given a string, compute recursively a new string where all the
     * lowercase 'x' chars have been moved to the end of the string.
     * EXample`
     * endX("xxre") → "rexx"
     * endX("xxhixx") → "hixxxx"
     *
     * @param str
     * @return
     */
    public static String XCharsHaveBeenMovedEnd(String str) {

        if (str.length() == 0)
            return str;

        if (str.charAt(0) == 'x')
            return XCharsHaveBeenMovedEnd(str.substring(1)) + 'x';

        return str.charAt(0) + XCharsHaveBeenMovedEnd(str.substring(1));
    }

    /**
     * 10.Given a string, return recursively a "cleaned" string where adjacent
     * chars that are the same have been reduced to a single char. So "yyzzza"
     * yields "yza".
     * EXample`
     * stringClean("yyzzza") → "yza"
     * stringClean("abbbcdd") → "abcd"
     *
     * @param str
     * @return
     */
    public static String stringClean(String str) {

        if (str.length() < 2)
            return str;

        if (str.charAt(0) == str.charAt(1))

            return stringClean(str.substring(1));

        return str.charAt(0) + stringClean(str.substring(1));
    }

    /**
     * 11.Write a function to determine if a number is prime or not.
     *
     * @param num
     * @param i
     * @return
     */
    public static boolean isPrime(int num, int i) {

        if (num <= 2) {
            return (num == 2) ? true : false;
        }
        if (num % i == 0) {
            return false;
        }
        if (i * i > num) {
            return true;
        }

        return isPrime(num, (i + 1));
    }

    /**
     * 12.Given a string containing only decimal digits. Find and display the
     * largest digit.
     *
     * @param str
     * @return
     */
    public static int largestDigit(String str) {

        if (str.charAt(0) >= 48 && str.charAt(str.length() - 1) <= 57) {

            char c = str.charAt(0);
            int a = Character.getNumericValue(c);
            char c1 = str.charAt(1);
            int b = Character.getNumericValue(c1);
            if (a > b) {

                return a;
            } else return b;


        }
        return 0;
    }

    public static boolean isPalindrome(String str) {

        if (str.length() == 0 || str.length() == 1)
            return true;

        if (str.charAt(0) == str.charAt(str.length() - 1))
            return isPalindrome(str.substring(1, str.length() - 1));
        return false;
    }
}
