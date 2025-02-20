package com.hkesari.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 The ability of a code to inspect/ introspect itself at run time & manipulate properties.
 Useful in case when you want to check/ modify if a particular method, class, fields exists at run time.
 Reflection allows you to also access and change private fields, values dynamically.
 Annotations like @Test use reflection to run test cases at runtime.
 */

class S{
    int v;

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public S(int v) {
        this.v = v;
    }
}

public class Reflection {
     public static void main(String[] args) {

     S s = new S(10);

     //inspect about an object at runtime
     Class<?> clazz = s.getClass();         //i.class, Class.forName()
     Method[] methods = clazz.getMethods();
     Field[] fields = clazz.getDeclaredFields();  //get all private as well as public fields.


     try {
         Field field = clazz.getDeclaredField("v");
         field.setAccessible(true);
         field.set(s,12);
         System.out.println(field.get(s));
     }catch (NoSuchFieldException | IllegalAccessException e){
          System.out.println("Field not found.");
     }

    }
}