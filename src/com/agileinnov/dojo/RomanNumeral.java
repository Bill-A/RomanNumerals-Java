package com.agileinnov.dojo;

public class RomanNumeral {

    public static String of(int arabic) {
        int position = arabic;
        String result = "";

        if (arabic == 10){
            result = "X";
        } else{
            while(position-- > 0){
                result += "I";
            }
        }


        return result;
    }

}
