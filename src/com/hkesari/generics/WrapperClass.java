package com.hkesari.generics;

/*
  Wrapper class : class that encapsulates types.
                - this allows us to create object instances and methods
                - allowing types to be used by Generics.
*/

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
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
         for(int z = 1; z<=50;z++){
             // l1.add(integer.valuof(z));
             l1.add(z);                        //autoboxing
         }
    }
}
