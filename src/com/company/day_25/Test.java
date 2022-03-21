package com.company.day_25;

import java.util.*;

public class Test {

    /**
     * 1. Write a method which will check if the given array of
     * integers contains duplicate elements.
     *
     * @param arr
     * @return
     */
    public static boolean containsDuplicatesOrNo(int[] arr) {

        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!hashSet.add(arr[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * 2.Write a method which prints elements that  occurred only
     * once in the array.
     *
     * @param arr
     */
    static void printOccuredOnce(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i]))
                hashMap.put(arr[i], 1 + hashMap.get(arr[i]));
            else
                hashMap.put(arr[i], 1);
        }


        for (Map.Entry entry : hashMap.entrySet()) {
            if (Integer.parseInt(String.valueOf(entry.getValue())) == 1)
                System.out.print(entry.getKey() + " ");
        }
    }

    /**
     * 3.Write a method that counts duplicate characters from a
     * given string.
     *
     * @param str
     */
    public static void printCountDuplicateCharacters(String str) {

        Map<Character, Integer> charMap = new HashMap<>();
        char[] arr = str.toCharArray();

        for (char value : arr) {

            if (Character.isAlphabetic(value)) {
                if (charMap.containsKey(value)) {
                    charMap.put(value, charMap.get(value) + 1);

                } else {
                    charMap.put(value, 1);
                }
            }
        }

        System.out.println(charMap);
    }

    /**
     * 4.
     *
     * @param str1
     */
    public static void non_RepeatedFirstCharacters(String str1) {

        System.out.println("The given string is: " + str1);
        for (int i = 0; i < str1.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str1.length(); j++) {
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("The first non repeated character in String is: " + str1.charAt(i));
                break;
            }
        }


    }

    /**
     * 4.Write a method that returns the first non-repeated
     * character from a given string.
     *
     * @param str
     * @return
     */
    public static Map<Character, Integer> storeInMap(String str) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        return charMap;
    }

    public static char findCharInMap(Map<Character, Integer> charMap) {
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {

            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return ' ';
    }

    public static int lengthOfWithoutRepeat(String str) {

        Set resultSet = new HashSet();

        for (int i = 0; i < str.length(); i++) {
            resultSet.add(new Character(str.charAt(i)));
        }

        return resultSet.size();

    }

    /**
     * 5.Write a method which will return the length of the longest
     * substring without repeating characters.
     * “abba” – 2, “abcdaefjh” – 8
     * @param str
     * @return
     */
    public static int lengthOfWithoutRepeatLongestSubString(String str) {

        HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length = 0;


        int start = 0;

        for (int end = 0; end < str.length(); end++) {

            if (seen.containsKey(str.charAt(end))) {

                start = Math.max(start, seen.get(str.charAt(end)) + 1);
            }


            seen.put(str.charAt(end), end);
            maximum_length = Math.max(maximum_length, end - start + 1);
        }
        return maximum_length;
    }
}
