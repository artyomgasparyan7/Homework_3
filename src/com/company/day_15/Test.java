package com.company.day_15;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    static Scanner sc = new Scanner(System.in);

    /**
     * 3.A natural number N is given (entered from the keyboard). Calculate two to the
     * power of N
     * Display the calculated value (1 <= N <= 15).
     *
     * @return
     */
    public static int calculateTwoPowerOfN() {

        int n = sc.nextInt();
        if (n >= 1 && n <= 15) {

            n = TwoPowerOfN(2, n);
        } else System.out.println("That input number can't greater to 16 or smaller 0!");

        return n;
    }

    /**
     * 4.Given number n. N minutes have passed since the beginning of the day.
     * Determine how many hours and minutes the digital clock will show at this
     * moment. The program should print two numbers: the number of hours (from 0 to
     * 23) and the number of minutes (from 0 to 59). Note that the number n can be
     * more than the number of minutes in a day.
     *
     * @param n
     */
    public static void calculateHourAndMinutes(int n) {

        int minutes = n % 60;

        int hour = (n / 60) % 24;

        System.out.println("Hour is: " + hour + " and minutes: " + minutes);


    }

    /**
     * 5.Write a java program to determine whether the number is prime or not.
     *
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {

        if (n == 1) {

            return true;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= n / 2; i += 2) {

            if (n % i == 0) {

                return false;
            }
        }

        return true;
    }

    public static int TwoPowerOfN(int N, int P) {

        int pow = 1;
        for (int i = 1; i <= P; i++)
            pow *= N;
        return pow;
    }

    public static int numberPalidrome(int n) {

        //1258

        int hazaravor = n % 10 * 1000;//8000
        int haryuravor = n % 100 / 10 * 100;//500
        int tasnavor = n / 100 % 10 * 10;//20
        int miavor = n / 1000;//1
        int result = (hazaravor + haryuravor + tasnavor + miavor);

        return result;
    }

    public static void palindromeInRange(int a, int b) {

        for (int num = 0; num <= b; num++) {

            if ((num % 10) != (num / 1000)) {

                continue;
            }

            if ((num / 10 % 10) != (num / 100 % 10)) {

                continue;
            }

            System.out.println(num);
        }
    }

    /**
     * 6.You are given two four-digit numbers A and B. Print all four-digit numbers on
     * the segment from A to B, the record of which is a palindrome.
     *
     * @param n
     * @return
     */
    public static boolean isPalidromeNumbers(int n) {

        if (n == numberPalidrome(n)) {

            return true;
        }
        return false;
    }

    /**
     * 7. A three-letter word is given. The word consists only of Latin letters, small and
     * large. Print the same word, where the first letter is capitalized, the rest are small.
     *
     * @param str
     * @return
     */
    public static String printLetterCapitalizedRestAreSmall(String str) {

        str = str.toLowerCase();

        str = str.substring(0, 1).toUpperCase() + str.substring(1);


        return str;
    }

    /**
     * 8.Enter the number N and draw an NxN checkerboard where the top left is white.
     * Designate white margins O, black margins X. Use a for loop.
     *
     * @param n
     * @param m
     */
    public static void printCheckerboard(int n, int m) {

        String str[][] = new String[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                str[i][j] = "O";
            }
        }

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                for (int j = 1; j < m; j += 2) {

                    str[i][j] = "X";
                }
            } else {

                for (int j = 0; j < m; j += 2) {

                    str[i][j] = "X";
                }
            }
        }
        for (String arr[] : str) {

            for (String result : arr) {

                System.out.print(result);
            }
            System.out.println();
        }
    }

    public static char[][] generateBoard(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if ((i + j) % 2 == 0) {

                    board[i][j] = '0';

                } else {

                    board[i][j] = 'X';
                }
            }
        }

        return board;
    }

    /**
     * 9.The first term and the denominator of the geometric progression are given (real
     * numbers b1 and q, q! = 0). An integer n is also given. Print the n-th term of a
     * geometric progression. Don't use the pow function, use a for loop. Print the
     * answer with precision exactly two characters after the period.
     *
     * @param b
     * @param q
     * @param num
     * @return
     */
    public static int printNthTermOfGeometricProgression(int b, int q, int num) {

        return num = b * TwoPowerOfN(q, num - 1);
    }

    /**
     * 10.A natural number> = 2 is specified. Expand it into prime factors.
     * Example` Input` 120
     * 2*2*2*3*5
     *
     * @param n
     */
    public static void printExpandIntoPrimeFactors(int n) {

        while (n % 2 == 0) {

            n /= 2;

            System.out.print(2 + " ");
        }

        for (int i = 3; i < n / 2; i += 2) {

            while (n % i == 0) {

                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2)
            System.out.println(n);
    }

    /**
     * *11.Two numbers n and m are given. Create a two-dimensional array A [n] [m], fill
     * it with the multiplication table A [i] [j] = i * j and display it. In this case, you cannot
     * use nested loops, the entire filling of the array must be done in one cycle.
     *
     * @param n
     * @param m
     */
    public static void printTwoDimensionalArray(int n, int m) {

        int arr[][] = new int[n][m];

        int j = 0;
        for (int i = 0; i < n; i++) {

            for (j = 0; j < m; j++) {

                arr[i][j] = i * j;
            }

        }

        for (int ar[] : arr) {

            for (int result : ar) {

                System.out.print(result);
            }
            System.out.println();
        }

    }

    public static int[][] multiplicationTableOneFor(int n, int m) {


        int[][] matrix = new int[n][m];

        int j = 0;

        for (int i = 0; i < n; i++) {

            matrix[i][j] = matrix[j][i] = i * j;

            j++;

            if (j == m) {

                j = 0;
                i++;
            }
        }
        return matrix;
    }

    public static void printMatrixEx(int n, int m) {
        int arr[][] = new int[n][m];

        int j = 0;
        for (int i = 0; i < n; i++) {

            for (j = 0; j < m; j++) {

                arr[0][1] = 1;

            }

        }

        for (int ar[] : arr) {

            for (int result : ar) {

                System.out.print(result);
            }
            System.out.println();
        }


    }

    public static void printMatrixSnake(int n, int m) {

        int matrix[][] = null;
        matrix = new int[n][m];


        Scanner scan = new Scanner(System.in);

        // read matrix
        System.out.println("Enter 3x3 Matrix elements: ");
        int i = 0;

        for (i = 0; i < n; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }
            if (i % 2 == 1) {

                for (int j = m - 1; j >= 0; j--) {
                    matrix[i][j] = scan.nextInt();

                }
            }


            System.out.println("Entered Matrix: ");
            System.out.println(Arrays.deepToString(matrix));


        }
    }

    public static void rotate90(int[][] matrix) {
        int n = matrix.length;
        int temp;
        int end = n - 1;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < end - i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[end - j][i];
                matrix[end - j][i] = matrix[end - i][end - j];
                matrix[end - i][end - j] = matrix[j][end - i];
                matrix[j][end - i] = temp;
            }
        }
    }

    public static int TwoPowerOfNByShift(int n) {
        if (n <= 2 && n >= 16) {
            System.out.println("Invalid value is:");
        }
        return 2 << n;
    }


}
