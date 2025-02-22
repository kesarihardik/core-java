package com.hkesari.arraysAndCollections.string;

// StringBuilder & StringBuffer are mutable.
// String buffer is thread safe and gives a buffer size of 16 character.
// StringBuilder is neither thread safe, not synchronized hence faster. Use stringBuilder when multiple string operations are involved.
public class StringBuilder {
     public static void main(String[] args){
         StringBuffer sbu = new StringBuffer();
         System.out.println(sbu.capacity());           //gives buffer of size 16 chars

         StringBuffer sb = new StringBuffer("abc");
         System.out.println(sb.capacity());

         java.lang.StringBuilder s = new java.lang.StringBuilder("John");
         s.append( " Wick");
         s.insert(0,"Mr ");

//         s.charAt(1);
//         s.setCharAt(9,'4');      //s.insert(8,'c')

//         s.delete(0,4);
//         s.deleteCharAt(5)

         System.out.println(s);
         System.out.println(s.indexOf("Wick"));
         System.out.println(s.lastIndexOf("J"));

         s.setCharAt(8,'S');
         System.out.println(s);

         s.reverse();
         System.out.println(s);
         s.setLength(0);
     }
}
