package com.hkesari.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
 The ability of a code to inspect/ introspect itself at run time & manipulate properties.
 Useful in case when you want to check if a particular method, class, fields exists at run time.
 Reflection allows you to also access and change private fields, values dynamically.
 Annotations like @Test use reflection to run test cases at runtime.
 */

public class Reflection1 {
     public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {

     //check if Integer class exist
     Class<?> clazz = Class.forName("java.lang.Integer");

     //get info about that class
     Constructor<?>[] constructors = clazz.getConstructors();
     Method[] methods = clazz.getDeclaredMethods();
     Field[] fields = clazz.getFields();

     for(Constructor<?> c: constructors)
          System.out.println(c);

     for(Field f: fields)
        System.out.println(f);


     for(Method m: methods){
         System.out.println(m);
     }
    }
}