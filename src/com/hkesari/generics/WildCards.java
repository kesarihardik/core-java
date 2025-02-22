package com.hkesari.generics;
import java.util.*;

/*
wildcards: feature in generics to make the type constraint more flexible or accept unknown type.
           - types - unbounded, bounded(lower & upper bound)
*/

public class WildCards {

    //unbounded wildcard. method works with any type of list.
    private static void print( List<?> list ){
        System.out.println(list);
    }

    //upper bound - method works with list of Number and its subtypes.
    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n: list)
             sum+=n.doubleValue();
        return sum;
    };

    //lower bound - method works with list of Integer and its super types.
    public static double sumInt(List<? super Integer> list){
        double sum = 0;
        for(Object n: list) {
            if (n instanceof Integer) {
                sum += (Integer) n;
            }
        }
        return sum;
    };

    public static void main(String[] args){

        List<Object> objectList = List.of("abc",123,3.4);
        print(objectList);

        // upper bound  - safe to read elements, unsafe to add.
        List<? extends Number> numList = new ArrayList<>();
//        numList.add(Integer.valueOf("12"));                    //compilation error
        numList.add(null);
        numList = List.of(1,2,123,1.12);                       //List.of gives immutable list with type safety
        System.out.println( sum(numList) );

        //lower bound - safe to add element but reads elements as object.
        List<? super Number> list3 = new ArrayList<>();
        list3.add(24);
        list3.add(23.4);

//        int a = list3.getFirst();      //compilation error
        Object aa = list3.getFirst();
        System.out.println(sumInt(list3));

        double x = sum(Arrays.asList(1,2,3.6,7,8));
        System.out.print(x);
    }
}
