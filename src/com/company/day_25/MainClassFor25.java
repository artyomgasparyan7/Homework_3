package com.company.day_25;

import java.util.Map;

import static com.company.day_25.Test.findCharInMap;
import static com.company.day_25.Test.storeInMap;

public class MainClassFor25 {

    public static void main(String[] args) {


        System.out.println(Test.containsDuplicatesOrNo(new int[]{1, 8, 5, 2, 1, 6}));
        Test.printOccuredOnce(new int[]{7, 9, 5, 7});
        System.out.println();
        Test.printCountDuplicateCharacters("Asatura".toLowerCase());
        Test.non_RepeatedFirstCharacters("asdasfyyhh");

        String str = "afshga";
        Map<Character, Integer> charMap = storeInMap(str);
        char c = findCharInMap(charMap);
        if (c != ' ') {
            System.out.println("First non repeated char in " + str + " is " + c);
        }

        System.out.println(Test.lengthOfWithoutRepeat("asatur"));

        System.out.println("length of without repeat longest subString: "
                +Test.lengthOfWithoutRepeatLongestSubString("substrsub"));
    }
}
