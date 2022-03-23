package com.company.day_14;

public class HomeWorkTest14 {
    public static void main(String[] args) {


        System.out.println( "String length: "+Test.printStringLength("Ararat"));
        System.out.println(Test.printCharacterOfIndex("Asala",4));
        System.out.println(Test.checkContainsCharInString("Astr",'A'));
        System.out.println("Count of vowels: "+Test.printCountOfVowels("asaAUUUUUtuaaaar"));

        Test.printOfCesarCode('Z',5);

        //the second versia of cesar
        Test.cesar("Z",5);

        System.out.println(Test.isReverseStringPalindrome("paP"));

        System.out.println("Is it binary: "+Test.isBinarNumber("1002010"));

       // Test.printCountsOfDuplicateCharacters("asasaaa");

      // System.out.println(Test.firstNonRepeated("asarts"));

        //Test.nonRepeatedValue("asrytaa");

        Test.printReverseOfString("asata");

        Test.printsCountsPercentages("asfdasfat15545");

        System.out.println(Test.countsOfOccurrences("auys",'a'));

        System.out.println("\n"+Test.isHexadecimalNumber("1515Af"));

        System.out.println(Test.binaryConvertToDecimal("111"));


       // Test.printCountsOfDuplicateCharacters("asadaaaf");
    }

}
