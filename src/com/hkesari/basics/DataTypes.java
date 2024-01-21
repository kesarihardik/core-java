package com.hkesari.basics;

/*
datatype -      defines type of variable.
types -         primitive and non-primitive
primitive  -      int, short, long, float, long, char, boolean, byte
non-primitive(reference types) -    Arrays, Strings, LinkedList, classes, interface. These are object data type. These can invoke methods & have null values.
String is non-primitive datatype provided by java.
 */

public class DataTypes {
    public static void main(String[] args){
        //Primitive Datatype
        int a = 10;
        short s = 2;
        long l = 123232323;
        float c = 12.2F;
        char h = 'H';

//        byte b = 21131;                                 //  byte can store from -128 to 128
//        System.out.println(b);

//        float v = 2.454;                               //lossy conversion
//        System.out.println(v);

        double x = 2.4232f;                             //https://stackoverflow.com/questions/916081/convert-float-to-double-without-losing-precision
        System.out.println(x);

        float f = 1.245f;
        System.out.println(f);
        System.out.println(Double.toString(f));
        System.out.println(Double.toString(Double.parseDouble(Float.toString(f))));

    }}
