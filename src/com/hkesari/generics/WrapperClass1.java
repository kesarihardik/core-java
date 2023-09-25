package com.hkesari.generics;

//What types aren't allowed with generics?                            //Primitive types.
// Why doesn't generic work with primitive data types?                // Because Integer extends Object, not int.  int,float aren't subclasses of Object class and generic type is replaced by Object at run time.


import java.util.ArrayList;
import java.util.List;

public class WrapperClass1 {
    static <T> void display(T x){             //generic method
        System.out.println(x);
    }
    public static void main(String[] args){
         int k = 23;

         Integer i = 24;           //autoboxing  - primitive -> corresponding  obj class

        // int j = i.intValue();   //unnecessary unboxing
         int j = i;               //unboxing

        display(k);
        display(i);
        display(i.toString());
        display(i.intValue());


        List<Integer> l1 = new ArrayList<>();
         for(int z = 1; i<=50;z++){
             // l1.add(integer.valuof(z));
             l1.add(z);                        //autoboxing
         }
    }
}
