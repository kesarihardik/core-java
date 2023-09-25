package com.hkesari.string;

//Where is string literal stored ?                              --string constant pool .
//What is string immutability?
public class StringPool {
    public static void main(String[] args){
        //Strings are immutable in Java
        String str = "Hardik";
        System.out.println(str.hashCode());
        str = str +"Kesari";
        System.out.println(str.hashCode());

        String s1 = new String("Hello");       //literal created in scp first. then obj references it.
        String n1 = "Hello";
        String s2 = new String("Hello");          //literal already in scp. obj just references it.
        String n2 = "Hello";

        System.out.println(s1==n2);                       //both points to diff location
        String n3 = s2.intern();                       //intern search for literals if present in scp and returns ref.
        System.out.println(n2==n3);
        System.out.println(n2==s2);
    }
}
