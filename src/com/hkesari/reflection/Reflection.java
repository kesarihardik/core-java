package com.hkesari.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//want to make changes dynamically
//reflection - feature to inspect, modify classes,interface, constructor,fields  at runtime.

//Class,Fields,method->setAccessible
class Dog {
    String name;

    Dog(String name){this.name=name;}

    private String getNamePvt(){return this.name;}

    public String getName(){
        return this.name;
    }
}

public class Reflection {
     public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

         Dog d = new Dog("John");

         Method method = Dog.class.getDeclaredMethod("getNamePvt");
         method.setAccessible(true);
         String val = (String)method.invoke(d);

         System.out.println(val);
     }
}