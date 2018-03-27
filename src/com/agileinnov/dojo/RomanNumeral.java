package com.agileinnov.dojo;

public class RomanNumeral {

    public static String of(int arabic) {
        int position = arabic;
        String result = "";

        while (position >= 10) {
            result += "X";
            position -= 10;
        }

        while (position > 0) {
            result += "I";
            position -= 1;
        }

        return result;
    }
}
