package com.company.day_12;

public class HomeWorkTest12 {

    public static void main(String[] args) {

        int [] arr = new int[8];//this number cans to give by Scanner!!!
        int[] arr1 = new int[]{7, -8, 9, 0, 8, -2};
        int[] arrRev = new int[]{1, 2, 3, 4, 5};


        Test.initArray(arr);
        Test.printArray(arr);

        Test.printOfArrayEvenIndices(arr);

        Test.printEvenNumberedItems(arr);


        Test.findNumberOfPositiveElementsFromArray(arr1);

        Test.printElementsOfListLargerThanPreviousElement();

        Test.printTwoAdjacentElementsOfSameSign();

        Test.printLargestElementAndIndexFromArray(arr);

        Test.printSmallestValueOfPositiveNumber();

        Test.printHowManyDifferentElementsAreIn();

        Test.printElementsInReverseOrder(arrRev);

        Test.rearrangeElementsOfArrayInReverseOrder(arrRev);
    }
}
