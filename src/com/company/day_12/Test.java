package com.company.day_12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {

    static Scanner sc = new Scanner(System.in);

    public static void initArray(int[] arr) {

        if (arr == null || arr.length == 0) {

            System.out.println("Invalid state of array");
            return;
        }

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(10);
        }

    }

    public static void printArray(int[] arr) {

        for (int num : arr) {

            System.out.println(num + " ");
        }
    }

    /**
     * 1.Print all elements of the array with even indices (that is, A [0], A
     * [2], A [4]...)
     * - Input natural integer N
     * - define an array with size N,
     *
     * @param arr
     */
    public static void printOfArrayEvenIndices(int[] arr) {


        System.out.println("Even Indices:");
        for (int i = 0; i < arr.length; i += 2) {

            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 2.Print all even numbered items in the list.
     * - Input natural integer N
     * - define an array with size N,
     *
     * @param arr
     */
    public static void printEvenNumberedItems(int[] arr) {

        System.out.println("\nEven Numbered Items:");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0 && arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * 3.Find the number of positive elements in the given array.
     *
     * @param arr1
     */
    public static void findNumberOfPositiveElementsFromArray(int arr1[]) {

        System.out.print("\nfind number of Positive Elements from array: ");
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] >= 0) {

                System.out.print(arr1[i] + " ");
            }
        }

    }

    /**
     * 4.A list of numbers is given. Print all the elements of the list that are
     * larger than the previous element.
     */
    public static void printElementsOfListLargerThanPreviousElement() {

        System.out.print("\nprint elements Of list larger than previous element: ");
        int[] a = new int[]{22, 3, 550, 4, 11, 100};

        int max = a[0];

        for (int i = 0; i < a.length; i++) {


            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.print(max + " ");

        int previusMax = 0;
        for (int i = 0; i < a.length; i++) {
            previusMax = a[0];
            if (a[i] > previusMax) {
                previusMax = a[i];
            }

        }
        System.out.print(previusMax + " ");

    }

    /**
     * 5. An array of numbers is given. If it has two adjacent(
     * )
     * elements of the same sign, print these numbers. If there are no
     * adjacent elements of the same character, do not print anything. If there
     * are several such pairs of neighbors, print the first pair.
     */
    public static void printTwoAdjacentElementsOfSameSign() {

        int arr[] = new int[]{1, -2, 3, -1, -2};

        System.out.print("\nprint two Adjacent Elements Of Same Sign:");
        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] > 0 && arr[i + 1] > 0) || (arr[i] < 0 && arr[i + 1] < 0)) {
                System.out.print(arr[i] + " " + arr[i + 1] + " ");
                break;
            }

        }
    }

    /**
     * 6. An array of numbers is given. Print the value of the largest element in
     * the array, and then the index of that element in the array. If there are
     * several largest elements, print the index of the first of them.
     *
     * @param arr
     */
    public static void printLargestElementAndIndexFromArray(int[] arr) {

        int max = 0;

        max = arr[0];
        int k;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];

                k = i;
                System.out.println("\nindex is: " + k);

            }
        }
        System.out.println("Max value is: " + max);
    }

    /**
     * 7.Print the value of the smallest of all positive elements in the list. It is
     * known that the list contains at least one positive element, and the
     * absolute value of all elements of the list does not exceed 1000.
     */
    public static void printSmallestValueOfPositiveNumber() {

        int min = 0;
        int arr[] = new int[]{5, -4, 3, -2, 12, 11111};

        min = arr[0];
        System.out.print("\nprint Smallest Value Of Positive Number:");
        for (int i = 0; i < arr.length; i++) {

            if (Math.abs(arr[i]) < 1000 && arr[i] > 0) {

                if (arr[i] < min) {

                    min = arr[i];

                }

            }
        }
        System.out.print(min + " ");
    }

    /**
     * 8.You are given a list sorted by non-decreasing elements in it. Determine
     * how many different elements are in it.
     */
    public static void printHowManyDifferentElementsAreIn() {

        System.out.print("\nprint How Many Different Elements Are In: ");
        int sum = 1;
        int count = 1;


        int[] arr = new int[]{1, 2, 2, 3, 3, 3, 4, 5, 5, 6};

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {

                sum += count;
            }

        }
        System.out.println(sum);

    }

    /**
     * 9.Print the elements of the given list in reverse order without changing
     * the list itself.
     */
    public static void printElementsInReverseOrder(int[] arrRev) {

        System.out.print("\nprint Elements In Reverse Order" +
                " without changing the list itself: ");

        for (int i = arrRev.length - 1; i >= 0; i--) {

            System.out.print(arrRev[i] + " ");
        }
    }

    /**
     * 10.Rearrange the elements of this array in reverse order, then print the
     * elements of the resulting array.
     * @param arrRev
     */
    public static void rearrangeElementsOfArrayInReverseOrder(int[] arrRev) {

        System.out.print("\nprint Elements In Reverse Order" +
                " rearrange Elements Of Array: ");

       /* int newArr[] = new int[arrRev.length];

       /* for (int i = 0; i < arrRev.length; i++) {

            System.out.print(arrRev[i] + " ");
        }

        for (int i = 0; i <newArr.length; i++) {

            newArr[i] = arrRev[i];
        }

        for (int finalArr:newArr) {

            System.out.print(finalArr + " ");
        }
        System.out.println();
        for (int i = newArr.length-1; i >=0 ; i--) {

            System.out.print(newArr[i] + " ");
        }*/

        for (int i = 0; i < arrRev.length; i++) {

            int i0 = arrRev[0];
            int i1 = arrRev[1];
            int i2 = arrRev[2];
            int i3 = arrRev[3];
            int i4 = arrRev[4];

            i0 = i4;
            i1 = i3;
            i2 = i2;
            i3 = i1;
            i4 = i0;

        }
        System.out.print(Arrays.toString(arrRev) + " ");

    }

    //to be continue!!!


}



