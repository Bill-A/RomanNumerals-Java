package com.agileinnov.dojo;

public class RomanNumeral {

     static int[] ARABIC_VALUES = { 10, 5, 1 };
     static String[] ROMAN_VALUES = { "X", "V", "I" };

    public static String of(int arabic) {
        String result = "";

        for (int position = 0; position < ARABIC_VALUES.length; position++) {
            while (arabic >= ARABIC_VALUES[position]) {
                result += ROMAN_VALUES[position];
                arabic -= ARABIC_VALUES[position];
            }
        }

        return result;
    }
}
