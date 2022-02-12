package com.company.day_9;

import java.util.Scanner;

public class HomeWorkTest9 {

   // Test t = new Test();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Test.compareTwoString();

        //example 1 and 2 in compareTwoString() method!!!
        Test.compareTwoString("java","java");

        Test.valuesPositiveOrNegative();

        Test.maxValue(7,10);

        Test.absaluteValue(-98);

        System.out.println(Test.checkName(" "));

        Test.printMaxValue(47,9,71);

        Test.chooseCorrectAnswer('d');

        Test.checkVowelOrConsonant('A');

        Test.isPressedNumberKeys(4);

        Test.isEvenOrOdd(4);

        Test.simpleCalculator('+');

        Test.inputStringVariableDay("tuesday");

        Test.threeTypesOfScores();
    }


}
