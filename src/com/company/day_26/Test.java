package com.company.day_26;

public class Test {

    public static int factorial(int n) throws Exception {

        if (n == 1) {

            return 1;
        } else if (n <= 0) {

            try {

                return n * factorial(n + 1);
            }catch (Exception e){

                throw new Exception("Error");

            }

        } else return n * factorial(n - 1);

    }

    public static int fibonaci(int n) {

        if (n <= 1) {

            return 1;
        } else return fibonaci(n - 1) + fibonaci(n - 2);
    }

    public static boolean isPalindrome(String str) {

        if (str.length() == 0 || str.length() == 1)
            return true;

        if (str.charAt(0) == str.charAt(str.length() - 1))
            return isPalindrome(str.substring(1, str.length() - 1));
        return false;
    }
}
