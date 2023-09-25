package com.hkesari.string;

//if you want mutable string use string builder or string buffer.
//gives a buffer size of 16 character.
//stringBuffer is thread safe . string builder is not.
public class String2 {
     public static void main(String[] args){
//         StringBuffer sb = new StringBuffer();
//         System.out.println(sb.capacity());           //gives buffer of size 16

         StringBuffer sb = new StringBuffer("hardik");
         System.out.println(sb.capacity());
     }
}
