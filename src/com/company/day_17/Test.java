package com.company.day_17;

import java.util.Arrays;

public class Test {

    /**
     * 1.Write a function add with these 3 types of overloading.
     * static int  add();
     * Which prints which method is called and result
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int add(int num1, int num2) {

        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }

    public static int add(int num1, float num2) {

        return (int) (num1 + num2);
    }

    /**
     * 2.Write 2 functions where first returns float second returns int,
     * and they have the same parameters for input.
     *
     * @param num1
     * @param num2
     * @return 3.Fix bug for 2 nd problem.
     */
    public static int result(int num1, float num2) {

        return (int) (num1 + num2);
    }

    public static float result(float num1, int num2) {

        return num1 + num2;
    }

    /**
     * 4.Write a method called print(), which takes an array and print its contents
     * in the form of [a1, a2, ..., an]. Take note that there is no comma
     * after the last element. The method's signature is as follows:
     * We need to overload this method for int[ ], float[ ], double[ ] arrays.
     *
     * @param intArr
     * @return
     */
    public static String print(int[] intArr) {

        return Arrays.toString(intArr);

    }

    public static String print(float[] floatArr) {

        return Arrays.toString(floatArr);

    }

    public static String print(double[] doubleArr) {

        return Arrays.toString(doubleArr);

    }

    /**
     * 5.Write a search function, which
     * -
     * - get as an argument int[ ] array, (returns the size of array)
     * public static int search(int[ ] array)
     * -
     * - get as an argument int[ ] array , also int a, and returns an index of that
     * argument
     * public static int search(int[ ] array, int a)
     * -
     * - get as an argument int[ ] array, int argument, int index
     * returns true if that element is in that place in array,otherwise false
     * public static boolean search(int[] array, int argument, int index)
     *
     * @param arr
     * @return
     */
    public static int search(int[] arr) {

        return arr.length;
    }

    public static int search(int[] arr, int index) {

        return arr[index];
    }

    public static boolean search(int[] arr, int argument, int index) {

        if (arr[index] == argument) {

            return true;
        }
        return false;
    }

    /**
     * 6. Write a square() method, which
     * if get one int parameter returns the square of cirqle
     *
     * @param r
     * @return
     */
    public static double area(int r) {
        return Math.PI * r * r;
    }

    /**
     * if get one float parameter returns the square of square
     *
     * @param side
     * @return
     */
    public static double area(float side) {

        return side * side;
    }

    /**
     * if get 2 parameters returns the square of rectangle
     *
     * @param side1
     * @param side2
     * @return
     */
    public static double area(float side1, float side2) {

        return side1 * side2 / 2;
    }

    /**
     * 7.Write a max() function which
     * -
     * - max(int a, int b)
     *
     * @param a
     * @param b
     * @return
     */
    public static int max(int a, int b) {

        if (a > b) {

            return a;
        }
        return b;
    }

    /**
     * - max(int a, int b, int c)
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int max(int a, int b, int c) {

        if (a >= b && a >= c) {

            return a;
        } else if (b >= a && b >= c) {

            return b;
        }
        return c;
    }

    /**
     * - max(int a , int b, int c, int d)
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public static int max(int a, int b, int c, int d) {

        if (a >= b && a >= c && a >= d) {

            return a;
        } else if (b >= a && b >= c && b >= d) {

            return b;
        } else if (c >= a && c >= b && c >= d) {
            return c;
        }
        return d;
    }

    /**
     * 8.Write a distance() function which
     * -
     * - return distance from (0.0 , 0.0) to (a)
     * distance(int x1 , int x2, int x3, int x4) where (x1, x2) are the coordinates of a
     * distance(int, int)
     * -
     * - return the distance from a to be, if method distance get 4 int
     * parameters
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static double distance(int x1, int y1, int x2, int y2) {

        return Math.sqrt(Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2) * 1.0);
    }

    /**
     * 9.Write a fahrenheitCelsius() function which
     * -
     * - prints fahrenheit value when pass (float celsius, int choice), where
     * choice is the type of fahrenheit`
     * 1 , print fahrenheit as int value
     * 2 , print fare fahrenheit asa double value
     * @param celsius
     * @param choice
     * @return
     */
    public static int fahrenheitCelsius(float celsius, int choice) {

        //(x − 32) × 5/9 = 0°C //32°F-x
        System.out.println("If input the choise of int type," +
                " as is returned fahrenheit is of int type!");


        int faren = (int) ((celsius * 1.8) + 32);

        return faren;
    }

    public static double fahrenheitCelsius(float celsius, double choice) {

        //(x − 32) × 5/9 = 0°C //32°F-x
        System.out.println("If input the choise of double type," +
                " as is returned fahrenheit is of double type!");

        return ((celsius * 1.8) + 32);
    }

    public static double fahrenheitCelsius( int choice,float fahrenheit) {

        return (fahrenheit - 32) * 5/9;
    }

    public static int remainder(int n){
        int sum = 0;
        n = Math.abs(n);
        while (n>0){

            sum += n%10;

            n/=10;
        }

        return sum;
    }

    public static double remainder(int n, int sec){

       return remainder(n)%sec;
    }


}
