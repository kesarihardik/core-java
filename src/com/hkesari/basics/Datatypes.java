package com.hkesari.basics;

import java.util.Arrays;

//datatype -      defines type of variable.
//types -         primitive and non-primitive
//primitive - int, char, bool, . these are built in
// non-primitive (reference types) - Arrays, Strings, LinkedList, classes, interface. these can invoke method.
//String is non-primitive datatype provided by java.

public class Datatypes {
    public static void main(String args[]){
        //Primitive Datatype
        int a = 10;
        byte b = 21;
        short s = 2;
        long l = 123232323;
        float c = 12.2F;
        double d = 23.11;

        char h = 'H';
        System.out.println(c);


        //not primitive types
        String z ="Pink Floyd";
        System.out.println(z.toLowerCase()); //non primitives can invoke method.

        int[] marks = new int[3];
        marks[0] = 87;
        marks[1]=78;
        marks[2]=34;

        Arrays.sort(marks) ;
        for(int i: marks){
            System.out.println(i);
        }

    }}
