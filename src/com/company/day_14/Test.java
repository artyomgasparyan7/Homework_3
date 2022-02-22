package com.company.day_14;

public class Test {

    /**
     * 1.Write a function which returns the length of a given String.
     *
     * @param str
     * @return
     */
    public static int printStringLength(String str) {

        return str.length();
    }

    /**
     * 2.Write a function which returns a character of a given index,from a given String.
     * Pass as a parameters String str, int index
     */
    public static char printCharacterOfIndex(String str, int index) {

        if (index< 0 || index >= str.length()){
            System.out.println("Invalid value: " + index);

            return ' ';
        }
        return str.charAt(index);
    }

    /**
     * 3.Write a function which checks if the given String contains a given character.Pass
     * as parameters String str, char ch
     *
     * @param str
     * @param ch
     * @return
     */
    public static boolean checkContainsCharInString(String str, char ch) {

        char charAt;
        for (int i = 0; i < str.length(); i++) {

            charAt = str.charAt(i);
            // System.out.print(charAt + " ");

            if (charAt == ch) {
                return true;
            }
        }

        return false;
    }

    /**
     * 4.Write a function which returns the count of vowels of a given String
     * -
     *
     * @param str
     * @return
     */
    public static int printCountOfVowels(String str) {
        int count = 0;
        char charAt = ' ';

        for (int i = 0; i < str.length(); i++) {


            charAt = str.toLowerCase().charAt(i);
            if ((charAt>='a'&& charAt<='z')||charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
                count++;

            }
        }
        return count;
    }

    /**
     * 5.Write a function called reverseString, which prompts the user for a
     * String, and prints the reverse of the String by extracting and processing each
     * character. The output shall look like:
     *
     * @param str
     */
    public static void printReverseOfString(String str) {

        System.out.print(str + " to reverse : ");
        for (int i = str.trim().length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i));
        }

    }

    /**
     * 6.Write a program called countVowelsDigits, which get as parameter a
     * String, counts the number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-
     * 9) contained in the string, and prints the counts and the percentages (rounded to
     * 2 decimal places). For example`
     */
    public static void printsCountsPercentages(String str) {

        int count = 0;
        int countDigit = 0;
        float percentage = 0.0f;
        float percentageDigit = 0.0f;

        char charAt = ' ';

        for (int i = 0; i < str.length(); i++) {


            charAt = str.toLowerCase().charAt(i);
            if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
                count++;
                percentage = ((float) count / str.length() * 100);

            }

            if ((charAt >= '0'
                    && charAt <= '9')) {

                countDigit++;

                percentageDigit = ((float) countDigit / str.length() * 100);
            }
        }


        System.out.printf("\nNumber of vowels: %d, ( %.2f %% ) ",
                count, percentage);

        System.out.printf("\nNumber of digits: %d, ( %.2f %%)",
                countDigit, percentageDigit);

    }

    /**
     * 7.Caesar's Code is one of the simplest encryption techniques. Each letter in the
     * plaintext is replaced by a letter with some fixed number of positions (n) down the
     * alphabet cyclically. In this exercise, we shall pick n=3. That is, 'A' is replaced by
     * 'D', 'B' by 'E', 'C' by 'F', ..., 'X' by 'A', ..., 'Z' by 'C'.
     *
     * @param ch
     * @param i
     */
    public static void printOfCesarCode(char ch, int i) {

        char j;
        for (j = 65; j <= 90; ++j) {

            if (ch == j) {

                j = (char) (j + (char) i);
                if (j >= 91) {

                    j = (char) ((j - 91) + 65);
                    System.out.println(j);
                    break;
                }
                System.out.print(" " + j);
            }
        }

    }

    public static void cesar(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) + n > 90) {
                int m = str.charAt(i) + n - 90;
                s += (char) (64 + m);
            } else if (str.charAt(i) + n > 122) {
                int m = str.charAt(i) + n - 122;
                s += (char) (96 + m);
            } else {
                char c = (char) (str.charAt(i) + n);
                s += c;
            }
        }
        System.out.println(s);
    }

    /**
     * 8.Write a function to check if the passed String palindrome or not
     *
     * @param str
     * @return
     */
    public static boolean isReverseStringPalindrome(String str) {

       /* System.out.print(str + " to reverse by palindrome: ");

        String string = str.toLowerCase();

        String string2 = reversOfString(string);
        return string.equals(string2);*/
        int i = 0, j = str.length()-1;

        while (i<j){

            if (str.charAt(i) != str.charAt(j))

                return false;

                i++;
                j--;




        }
        return true;

    }

    public static boolean isBinarNumber(String str) {
        /*for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '2') {
                return false;
            }
        }
        return true;*/

        for (char ch:str.toCharArray()) {

            if (ch!='0' && ch != '1'){
                return false;
            }
        }
        return  true;
    }

    /**
     * 10.The hexadecimal (hex) number system uses 16 symbols, 0-9 and A-F (or a-f
     * ). Write a program to verify a hex string. The function gets a hex string; and
     * decides if the input string is a valid hex string.
     *
     * @param str
     * @return
     */
    public static boolean isHexadecimalNumber(String str) {

        str = str.toUpperCase();
        char ch;
        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);

            if ((ch > '9' || ch < '0') && (ch > 'F' || ch < 'A')) {

                return false;
            }
        }
        return true;
    }

    /**
     * 11.Write a function called bin2Dec to convert an input binary string into its
     * equivalent decimal number. Your output shall look like:
     *
     * @param str
     * @return
     */
    public static int binaryConvertToDecimal(String str) {

        int num = Integer.parseInt(str, 2);

        return num;


    }

    /**
     * 12.Write a function that counts duplicate characters from a given string.
     *
     * @param str
     * @return
     */
   /* public static void printCountsOfDuplicateCharacters(String str) {

        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] == ch[j] && ch[i] != ' ') {
                    count++;
                    ch[j] = '0';
                }
            }
            if (count > 1 && ch[i] != '0')
                System.out.println(ch[i]);
            //System.out.println(count);
        }

        // System.out.println(count);


    }*/

   /* public static StringBuilder countDuplicate(String str){

        StringBuilder duplicates = new StringBuilder();
        int len = str.length();
        int index;
        int line = 0;
        for (int i = 0; i < len-1; i++) {

            index = 0;

            for (int j = i+1; j < len; j++) {

                if ((str.charAt(i) == str.charAt(j)) && !duplicates.toString().contains(String.valueOf(str.charAt(i)))){

                    duplicates.append(str.charAt(i));
                    break;
                }
            }
        }
        return duplicates;

    }*/

    public static int countDuplicate(String str){

        int dupCount = 0;
        int count;
        int len = str.length();

        for (int i = 0; i < len-1; i++) {

            count = 0;

            for (int j = i+1; j < len; j++) {

                if (str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }

            if (count == 1){

                dupCount++;
            }
        }

        return dupCount;
    }

//    public static char firstNonRepeated(String str) {
//       /* char[] ch = str.toCharArray();
//        for (int i = 0; i < str.length() - 1; i++) {
//            if (ch[i] != ch[i + 1]) {
//                return ch[i];
//            }
//        }
//        return 0;*/
//
//
//       /* int len = str.length();
//        char ch;
//
//        boolean hasDuplicate;
//
//        for (int i = 0; i < len-1; i++) {
//
//            hasDuplicate = false;
//
//            for (int j = i+1; j < len; j++) {
//
//                if (str.charAt(i)==str.charAt(j)){
//
//                    hasDuplicate = true;
//                    break;
//                }
//            }
//            if (!hasDuplicate){
//
//                return str.charAt(i);
//            }
//            break;
//        }
//        return ;*/
//    }



    public static void nonRepeatedValue(String str){

        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] != ch[j] && ch[i] != ' ') {
                    count++;
                    ch[j] = '0';
                }
            }
            if (count > 1 && ch[i] != '0')
                System.out.println(ch[i]);
            //System.out.println(count);
        }
    }

    public static int countsOfOccurrences(String str, char ch){
       /* int count = 0;
        char [] ch1 = str.toCharArray();
        for (int i = 0; i <str.length() ; i++) {
            if (ch1[i]==ch){
                count++;
            }
        }
        return count;*/

        int res = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)==ch){

                res++;
            }

        }
        return res;
    }

    public static String reversOfString(String str) {
        String string = new String();
        for (int i = str.length() - 1; i >= 0; i--) {
            string += str.charAt(i);
        }
        return string;
    }
}
