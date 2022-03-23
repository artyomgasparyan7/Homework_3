package com.company.day_26;

public class MainClass26 {

    public static void main(String[] args) throws Exception {

        int arr[] = new int[]{1,4,-5,6,7,0};

        int len = arr.length;
        System.out.println("Sum of array variables: "+Test.sum(arr,len));
        System.out.println("Factorial o given N number: "+Test.factorial(6));
        System.out.println(Test.fibonaci(4));

        System.out.println(Test.numberOfBlocks(2));

        System.out.println("Sum of digits: "+Test.sumOfDigits(1234));

        System.out.println("Count of occurrences 7 digits: " + Test.countOfOccurrences7Digits(7177));

        System.out.println("Count of x: " + Test.countX("XaxxXx".toLowerCase()));

        System.out.println("X chars have been removes: " + Test.XCharsHaveBeenRemoved("asXasaxA".toLowerCase()));

        Test.reverseString("Hello");

        System.out.println("X chars have been moved to end: " + Test.XCharsHaveBeenMovedEnd("asXasax".toLowerCase()));

        System.out.println("Clean same chars: " + Test.stringClean("yyyzzzzzaa".toLowerCase()));

        System.out.println("Is prime or no: " + Test.isPrime(17,2));
        System.out.println("largest decimal number: " + Test.largestDigit("32"));
        System.out.println(Test.isPalindrome("asa"));
    }
}
