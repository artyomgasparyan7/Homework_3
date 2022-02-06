package com.company;

import java.util.Scanner;

public class Main {

    /**
     * Widening Primitive Conversion (Implicit)
     * 1.	Write java program, which has byte type variable(Input variables from console)
     */
    public static void wideningPrimitiveConversion() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of byte type: ");
        byte byteNum = sc.nextByte();

        //-	Cast byte to short type, print both variables
        short castByteToShort = byteNum;
        System.out.println("Cast byte to short type, print both variables: " + castByteToShort);

        System.out.print("Input number of short type: ");
        short shortNum = sc.nextShort();

        //-	Cast short to int  type, print both variables
        int castShortToInt = shortNum;
        System.out.println("Cast short to int  type, print both variables: " + castShortToInt);

        System.out.print("Input number of int type: ");
        int intNum = sc.nextInt();

        //-	Cast int to long  type, print both variables
        long castIntToLong = intNum;
        System.out.println("-Cast int to long, print both variables: " + castIntToLong);

        System.out.print("Input number of long type: ");
        long longNum = sc.nextLong();

        //-	Cast long to float, print both variables
        float castLongToFloat = longNum;
        System.out.println("-Cast long to float, print both variables: " + castLongToFloat);

        System.out.print("Input number of float type: ");
        float floatNum = sc.nextFloat();

        //-	Cast float to double type, print both variables
        double castFloatToDouble = floatNum;

        System.out.print("Cast float to double type, print both variables: " + castFloatToDouble);

        System.out.println("\n*****************************");


    }

    /**
     * Narrowing Primitive Conversion (Explicit)
     * 2.	Write java program, which has double type variable(Input variable from console)
     */
    public static void narrowingPrimitiveConversion() {

        System.out.println("Narrowing Primitive Conversion");
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of double type: ");
        double doubleNum = sc.nextDouble();

        //-	Cast double  to float,print both variables
        float castDoubleToFloat = (float) doubleNum;
        System.out.println("Cast double  to float type, print both variables: " + castDoubleToFloat);

        System.out.print("Input number of float type: ");
        float floatNum = sc.nextFloat();

        //-	Cast float to long, print both variables
        long castFloatToLong = (long) floatNum;
        System.out.println("Cast float  to long type, print both variables: " + castFloatToLong);

        System.out.print("Input number of long type: ");
        long longNum = sc.nextLong();

        //-	Cast long to int, print both variables
        int castLongToInt = (int) longNum;
        System.out.println("Cast long  to int type, print both variables: " + castLongToInt);

        System.out.print("Input number of int type: ");
        int intNum = sc.nextInt();

        //-	Cast int to short, print both results
        short castIntToShort = (short) intNum;
        System.out.println("Cast int  to short type, print both variables: " + castIntToShort);

        System.out.print("Input number of short type: ");
        short shortNum = sc.nextShort();

        //-	Cast short to byte, print both results
        byte castShortToByte = (byte) shortNum;
        System.out.println("Cast short  to byte type, print both variables: " + castShortToByte);

        System.out.println("'''''''''''''''''''''''''''''''");
    }

    /**
     * 3.	Write a Java program to convert temperature from Fahrenheit to
     * Celsius degree. (Input parameter from console)
     * -	Print the result
     * -	Cast the result to float type,print float type
     * -	Cast result to int,print int type
     */
    public static void convertTemperature() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Fahrenheit temperature by number of Double type: ");
        double faren = sc.nextDouble();
        System.out.println();

        double celsiusResult = (faren - 32) * 5 / 9;
        //Print the result
        System.out.println("Convert temperature from Fahrenheit to" +
                "  Celsius degree: " + celsiusResult + "C");
        //Cast the result to float type,print float type
        float farenOfFloatType = (float) celsiusResult;
        System.out.println("Cast the result to float type,print float type: " + farenOfFloatType);
        //-	Cast result to int,print int type
        int farenOfIntType = (int) celsiusResult;
        System.out.println("Cast result to int,print int type: " + farenOfIntType);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    /**
     * 4.	Compute area  and perimeter of circle.
     * (Input double type radius from console)(PI = 3.14159)
     */
    public static void areaAndPerimeterOfCircle() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Radius of Double Type: ");
        double radius = sc.nextDouble();
        System.out.println();

        if (radius > 0) {
            //Area of circle that is Pi*r*r
            double area = Math.PI * radius * radius;
            System.out.println("Area of circle: Pi*r*r =  " + area);

            //Perimeter of circle that is 2 * Pi * r
            double perim = 2 * Math.PI * radius;
            System.out.println("Perimeter of circle: 2*Pi*r = " + perim);
        } else System.out.println("Radius cann't to be negative value!!!");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    /**
     * Print the result of this expression 1 / 3
     * -	as a double
     * -	as a float
     */
    public static void expressionResult1() {

        System.out.println("Print the result of this expression: 1 / 3: ");
        //as a double
        System.out.println("as a double type:1/3 = " + (double) (1 / 3));
        //as a float
        System.out.println("as a float type: 1/3 = " + (float) (1 / 3));
        System.out.println("################################");
    }

    /**
     * 6.	Write java program to print your Name and year of birth
     * using only char primitive and int types.Output` (Ara 1996)
     */
    public static void printYourNameAndBirth() {

        char char1 = 'A';
        char char2 = 'r';
        char char3 = 't';
        char char4 = 'y';
        char char5 = 'o';
        char char6 = 'm';
        //used int primitive type
        int year = 2000;
        //used char primitive types
        System.out.println("My name is  " + char1 + char2 + char3 + char4 + char5 + char6 + "  and My year of birth: " + year);

        //Or
        char[] charArray = {'A', 'r', 't', 'y', 'o', 'm'};
        System.out.print("My name is: ");
        for (char name : charArray) {

            System.out.print(name);
        }
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    /**
     * 7.	Cast char to int.
     */
    public static void castCharToInt() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input charachter of char type: ");
        char charType = sc.next().charAt(0);
        System.out.println();
        System.out.println("value of char type: " + charType);
        int intType = charType;
        System.out.println("value of int type: " + intType);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    /**
     * 8.	Write a java program which parses your name letters as a integers, calculate average of them, Output  `
     * Ara -- 92.0
     */
    public static void parsesLettersAsIntegersCalculateAverage() {

        String name = "Artyom";
        int average;
        int sum = 0;
        //print parses your name letters as a integers
        System.out.print("print parses your name letters as a integers----> ");
        for (int i = 0; i < name.length(); i++) {

            System.out.print((int) name.charAt(i) + " ");

            sum += (int) name.charAt(i);
        }

        System.out.println("\nSum of integers: " + sum);
        average = sum / 6;
        System.out.println("Average is: " + average);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

    }

    /**
     * Input int value from console, find char value corresponding to that int value.
     * Output ` 65 - A. (input int in range 32 to 127)
     */
    public static void inputIntValueAndFindCharValue() {

        Scanner sc = new Scanner(System.in);

        System.out.print("input int in range 32 to 127: ");
        int intValue = sc.nextInt();

        //range 32 to 127
        if (intValue >= 32 && intValue <= 127) {

            //int value from console, find char value
            char charValue = (char) intValue;
            System.out.println("\nint value from console, find char value corresponding to that int value: " + charValue);

        } else System.out.println("range is out 32 to 127!!!");

        System.out.println("**************************************");
    }

    /**
     * String
     * -	 Define simple String variable, initialize it
     * -	 Define another String variable, initialize it
     * -	 Concatenate them , print output
     */
    public static void concatenateTwoString() {

        String str1 = "Java-";
        String str2;
        str2 = "BootCamp";
        String concat = str1 + str2;
        System.out.println("Concatenate of two String: " + concat);
        System.out.println("::::::::::::::::::::::::::::::::::");
    }

    /**
     * What happens if concatenate string and another primitive type
     * -	concatenate integer + integer, print output
     * -	concatenate String  + integer with other primitive types.
     * Example of output` 5 + 10 = 15
     */
    public static void concatenateOtherType() {

        Scanner sc = new Scanner(System.in);

        System.out.println("concatenate integer + integer, print output: ");
        System.out.print("The first int value is: ");
        int intValue1 = sc.nextInt();
        System.out.print("\nThe second int vaule is: ");
        int intValue2 = sc.nextInt();

        System.out.print("concatenate integer + integer: ");
        //Concat int + int
        System.out.println(intValue1 + intValue2);
        System.out.println();
        //concatenate String  + integer with other primitive types.
        System.out.print("Input value of String type: ");
        Scanner sc1 = new Scanner(System.in);
        String stringValue = sc1.nextLine();

        System.out.print("\nInput value of integer type: ");
        int intValue = sc.nextInt();
        System.out.print("\nInput value of float type: ");
        float floatValue = sc.nextFloat();

        //Concat String + integer + other primitive type`example(float)
        System.out.print("String + integer + other primitive type`example(float): ");
        System.out.println(stringValue + intValue + floatValue);
        System.out.println("-----------------------------------");
    }

    /**
     * Try to print this text
     * -	String txt = "We are the so-called "Vikings" from the north.";
     * -	There is problem with word “Vikings”
     */
    public static void printThisText() {

        String str = "We are the so-called \"Vikings\" from the north.";
        //Vikings word is writed backslash" Vikings backslash"- the first
        System.out.println(str);

        String str1 = "We are the so-called \'Vikings\' from the north.";
        //Vikings word is writed backslash' Vikings backslash'- the first
        System.out.println(str1);
        String str2 = "We are the so-called \\Vikings\\ from the north.";
        //Vikings word is writed backslash\ Vikings backslash\- the first
        System.out.println(str2);

        //this problem is solved!
        System.out.println("this problem is solved!");
        String str3 = "We are the so-called \"\bVikings\"\b from the north.";//the first solve

        System.out.println(str3);

        String str4 = "We are the so-called \n\t\r\"\bVikings\"\b from the north.";//the second solve
        System.out.println(str4);

        String str5 = "We are the so-called \n\"\bVikings\"\b from the north.";//the second solve
        System.out.println(str5);

        String str6 = "We are the so-called \r\"\bVikings\"\b from the north.";//the third solve
        System.out.println(str5);

        String str7 = "We are the so-called \t\"\bVikings\"\b from the north.";//the fourd solve
        System.out.println(str7);

        String str8 = "We are the so-called \t\"\bVikings\"\b\t from the north.";//the fived solve
        System.out.println(str8);

        String str9 = "We are the so-called \n\"\bVikings\"\b\t from the north.";//the sixed solve
        System.out.println(str9);

        String str10 = "We are the so-called \"\bVikings\"\b from the north.";//the sevened solve
        System.out.println(str10);
        //There are many solutions!!!!! I ask from that solves some of.
        System.out.println("*******************************");


    }

    /**
     * *14. Swap 2 integers without using temp.
     */
    public static void swapTwoItegersWithoutTemp() {

        int num1 = 787;
        int num2 = 545;

        System.out.println("Before swaping : ");
        System.out.println("num1 = " + num1 + " num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping without using temp: ");
        System.out.println("num1 = " + num1 + " num2 = " + num2);


    }

    /**
     * Test
     */
    public static void test1() {

        //Which data type would you use to represent the following values?

        // All value can be represent String value !

        Scanner sc = new Scanner(System.in);

        System.out.print("Input age of child: ");
        byte childAge = sc.nextByte();//     a. Child age can to respresent byte ,

        if (childAge >= 0 && childAge <= 16) {

            System.out.println("\nChild age: " + childAge);
        } else if (childAge >= 17 && childAge <= 19) {

            System.out.println("Tineger age!");
        } else
            System.out.println("Child can't to be negative value, and if age of child > or = 16 that person isn't child!!!");

        System.out.println("Employee salary can't to be negative value and can't to be a little from 60.000dram in Armenian!!");
        System.out.print("Input  Employee salary : ");
      /*
      System.out.print("Input  Employee salary by dollar: ");
       double employeeSalary = sc.nextDouble();//b.  Employee salary


        if (employeeSalary>120.5){

            String resultSalary=String.valueOf(employeeSalary);
            System.out.println(" Employee salary : " + resultSalary + " $");
        }else System.out.println(" Employee salary can't to be negative value and can't to be a little from 120.5$ in Armenian!!");*/

        Scanner sc1 = new Scanner(System.in);
        String employeeSalary = sc1.nextLine();
        System.out.println("Employee salary : " + employeeSalary + " dram");


        System.out.print(" Input Count of child:");
        byte countChild = sc.nextByte();//somebody has children or not

        if (countChild >= 0) {

            System.out.println("\nCount of child: " + countChild);
        } else System.out.println("\nCount of child can't negative value!");

        System.out.print("Input  Apartment letter: ");
        String letter = sc1.nextLine();//d. Apartment letter

        System.out.println("\nApartment letter: " + letter);

    }

    /**
     * Find the errors in the following Java sentences:
     */
    public static void findError() {

        //int a, b, c a = 0 //error is after c must be ; and to end must be ;
        //true answer a.
        int a, b, c;
        a = 0;

        //  System.out.println('ab');// error is 'ab' can't to be ,becouse ab is 2 charachter and must be System.out.println("ab");
        //true answer b.
        System.out.println("ab");

        // System.out.println( (3 + 2) – 1) );//error is if we want to do arifmetic action(arifhmetic operator)=> we must be clear all brackets off sout
        //true answer c.
        System.out.println(3 + 2 - 1);

        //int numFloat = 3.2;//error is integer type ,becouse int type can't to be float value or must to cast or int type replace float type + f;
        //true answer d.
        float numFloat = 3.2f;

        // float numFloat1 = 2.1; int numInt = numFloat1;//error is float type in end must be f or F alf. .
        //The second error is 2th sentences is float type to casting int type and we must be float type cast int type
        //true answer e.
        float numFloat1 = 2.1f;
        int numInt = (int) numFloat1;

        // int i = 10; float b; i = b;//error isn't int i = 10; it's ok!
        //error float f must be initiale because  in the next we f(that is float type) want to attribute of ineger value
        //error after those, we must f cast to i type(float value to casting integer value)
        //true answer f.
        int i = 10;
        float f = 0;
        i = (int) f;

        //true answer g., It's ok, this breckets({ }) to ask ,that is block and It's ok
        int x;
        {
            x = 10;
        }
        System.out.println(x);

        //boolean b1, b2; b1 = false, b2 = true;//error is after false must be ; doesn't ,

        //true answer h.
        boolean b1, b2;
        b1 = false;
        b2 = true;

        // int in; in = 1; r = in + 1;//error is : r cann't resolve symbol r

        //true answer i.
        int r;
        int in;
        in = 1;
        r = in + 1;

        // String s = 'This is a string';error is: String cann't to declarate ' ' symboles ,that is  declarate " "

        //tru answer j.
        String s = "This is a string";

    }

    /**
     * What will be output?
     */
    public static void test3() {

        int i = 10;
        int n = i++ % 5;
        System.out.println("Result is: " + n);//because i has not yet added value
    }

    /**
     * Find the value of the variable result after executing the following sentences:
     */
    public static void test4() {

        int a;
        int b;
        int result;

        //a
        a = 4;
        b = 12;
        result = a + b / 3;//4+4
        System.out.println("Result is a version: " + result);

        //b
        a = 3;
        a = a + 3;
        b = 2;
        result = a - b;//new value a is 3,b is 2 ,after a = a + 3 , a value is 6, result is 6-2
        System.out.println("Result is a version: " + result);

        //c
        a = 2;
        b = a + 1;
        a = b + 2;
        result = a + b + a;
        result = -result;//new value a is 2;
        //b= 2+1 to be , b = 3, after a = b + 2, a to be 5. result is : 5+3+5 ,after result = -result ,the end result value = -13
        System.out.println("Result is b version: " + result);

        //d
        a = 3;
        b = 11;
        result = (b % a) + 1;//new value a is 3,b is 11.Result is (11%3)+1, result is: 2+1
        System.out.println("Result is d version: " + result);

        //e
        a = 3;
        b = a++;
        result = 1;
        result += a - b;//new value a is 3, b is 3 yet ,result is 1,a is 4, result is in end 1+(4-3)
        System.out.println("Result is e version: " + result);
    }

    public static void main(String[] args) {

        //Widening Primitive Conversion (Implicit)
        wideningPrimitiveConversion();

        //Narrowing Primitive Conversion (Explicit)
        narrowingPrimitiveConversion();

        //convert temperature from Fahrenheit to Celsius degree
        convertTemperature();

        //Compute area  and perimeter of circle.
        areaAndPerimeterOfCircle();

        //Print the result of this expression 1 / 3
        expressionResult1();

        //used char primitive types and used int primitive type
        printYourNameAndBirth();

        //cast chat to int type
        castCharToInt();

        //parses your name letters as a integers, calculate average of them
        parsesLettersAsIntegersCalculateAverage();

        //int value from console, find char value corresponding to that int value
        inputIntValueAndFindCharValue();

        concatenateTwoString();

        concatenateOtherType();

        //Try to print this text
        printThisText();

        //Swap 2 integers without using temp.
        swapTwoItegersWithoutTemp();

        //Which data type would you use to represent the following values?
        test1();

        //Find the errors in the following Java sentences:
        findError();

        //What will be output
        test3();

        // Find the value of the variable result after executing the following sentences:
        test4();

    }
}
