package com.agileinnov.dojo;

public class RomanNumeral {

    public static String of(int arabic) {
        if (arabic == 3) {
            return  "III";
        }
        if (arabic == 2) {
            return  "II";
        }
        return "I";
    }

}
