package com.hkesari.basics;

// strings -              String.charAt(), length(), toCharArray, toUpperCase, toLowerCase
//characters  -          Character.isAlphabetic(), Character.isLetter(), Character.isDigit(), isUpperCase();

import java.lang.String;

import static java.lang.Character.isDigit;

public class StringMethods {
    public static void main(String[] args){
        String str = "I like freedom.";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(0,4));                // [a,b)          a inclusive, b excluded
        System.out.println(str.charAt(0));

          //convert to char array
        char [] arr = str.toCharArray();
        for(char c : arr){
            System.out.print(c+" ");
        }

        if(Character.isDigit(arr[0])) System.out.println("isdigit - true");


    }
}
