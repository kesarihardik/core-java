package com.hkesari.string;

// StringBuilder & StringBuffer are mutable.
// String buffer gives a buffer size of 16 character.
// StringBuilder is neither thread safe, not synchronized hence faster. stringBuffer is thread safe .
public class String2 {
     public static void main(String[] args){
         StringBuffer sbu = new StringBuffer();
         System.out.println(sbu.capacity());           //gives buffer of size 16

         StringBuffer sb = new StringBuffer("hardik");
         System.out.println(sb.capacity());
     }
}
