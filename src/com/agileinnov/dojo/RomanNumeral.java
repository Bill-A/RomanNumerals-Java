package com.agileinnov.dojo;

public class RomanNumeral {

    public static String of(int arabic) {
        int position = arabic;
        String result = "";

        while(position-- > 0){
            result += "I";
        }

        return result;
    }

}
