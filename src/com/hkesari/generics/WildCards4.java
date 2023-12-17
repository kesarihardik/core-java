package com.hkesari.generics;
import java.util.*;

//What are wildcards?                          feature in generics to make the type constraint more flexible or accept unknown type.
//types of wildcards?                           they are of 3 types - unbounded, bounded(lower & upper bound)
//?  represents wildcard.
public class WildCards4 {

    ///method works with list of Number and its subtypes.
    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n: list)
             sum+=n.doubleValue();
        return sum;
    };

    public static void main(String[] args){
        //unbounded wildcard      -- accepts with unknown types
        List<?> list = new ArrayList<>();

        // upper bound
        List<? extends Number> list1 = new ArrayList<>();

        //list1.add(23.6);               //compile time error. java isn't sure if its int ,float or double. So, it doesn't allow to add values. But, you can read values from upper bounded wildcards.

        //lower bound
        List<? super Number> list3 = new ArrayList<>();
        list3.add(24);
        list3.add(23.4);
        System.out.println(list3);

    }
}
