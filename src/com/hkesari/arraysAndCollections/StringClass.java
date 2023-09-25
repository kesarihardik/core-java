package com.hkesari.arraysAndCollections;
// strings - String.charAt(), length(), toCharArray, toUpperCase, toLowerCase
//characters  - Character.isAlphabetic(), Character.isLetter(), Character.isDigit(), isUpperCase();

//StringBuilder has append() and toString() methods.

import java.lang.String;
public class StringClass {
    public static void main(String args[]){
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

        //convert char arr to string
        String s2 = new String(arr);

        if(Character.isDigit(arr[0])) System.out.println("isdigit - true");

        StringBuilder s = new StringBuilder("jkldjf");
        s.append("sdf");
        String sss =  s.toString();
    }
}
