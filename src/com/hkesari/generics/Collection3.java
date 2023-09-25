package com.hkesari.generics;

//Collection vs collections               - Collections - class, collection is interface.
//collections are used to store group of objects. helps to implement data structure easily.

import java.util.ArrayList;
import java.util.Iterator;

public class Collection3 {
    public static void main(String[] args){
        ArrayList num = new ArrayList();                             // can result in bug since no type is mentioned.it can store any type of data.
        java.util.Collection<Integer> nums= new ArrayList<Integer>();         //mentioning Integer allows to compiler to give error at compile time
        nums.add(12);
        nums.add(123);

        System.out.println(nums);

        Iterator<Integer> it = nums.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
