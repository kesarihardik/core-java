package com.hkesari.basics;

/*
datatype -  defines type of variable.
types -  primitive and non-primitive.

primitive -  built/predefined into language.
8 primitive  -   char, boolean, byte, short, int, long, float, double,

non-primitive - reference types/ reference variables/ object references , user defined.
4 non-primitive - string, array, class, interface

non-primitive(reference types) -  Arrays, Strings, LinkedList, classes, interface. These are object data type. These can invoke methods & have null values.
 */

import java.math.BigDecimal;

public class DataTypes {
    public static void main(String[] args){
        //Primitive Datatype
//        int a = 10;
//        short s = 2;
//        long l = 123232323;
//        float c = 12.2F;
//        char h = 'H';

        //casting
//        float f = (float) 123;

        //auto conversion
//        int a = 123;
//        long b = 123;
//        float c = 123;
//        System.out.printf("a: %d , b: %d, c: %f \n ",a,b,c);


        //Non-primitive
//        Integer ii = 123;
//        Float ff = Float.valueOf(Integer.toString(ii));
//        double dd = Double.parseDouble("123");
//        System.out.printf("\n%f %f", ff, dd);

        //Range - boolean is 1 byte, character is 2 byte
        System.out.printf("\nByte range - %d to %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);     //1 byte
        System.out.printf("Byte range - %d to %d%n", Short.MIN_VALUE, Short.MAX_VALUE);      //2 bytes
        System.out.printf("Byte range - %d to %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);   //4 bytes
        System.out.printf("Byte range - %d to %d%n", Long.MIN_VALUE, Long.MAX_VALUE);   //8 bytes

        System.out.printf("Byte range - %f to %f%n", Double.MIN_VALUE, Double.MAX_VALUE);      //4 bytes + 6-7 decimal places
        System.out.printf("Byte range - %f to %f%n\n", Float.MIN_VALUE, Float.MAX_VALUE);     //8 bytes + 15 decimal places


        //lossy conversion error
//        int x = 12.1f;
//        float v = 2.454;

        double x = 2.4232f;                             //https://stackoverflow.com/questions/916081/convert-float-to-double-without-losing-precision
        System.out.println(x);                      //double is more precisely representing this number.

        float f = 1.245f;
        System.out.println(f);
        System.out.println((double) f);
        System.out.println(Double.parseDouble(Float.toString(f)));

        //Infinity values
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);

    }}
