package com.hkesari.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Stream vs collection -
         Stream is an abstraction of non-mutable collection of functions applied in some order to data.
         Stream is not collection. It doesn't store data. It enables functional programming for us.
         Stream doesn't change original data. It also can not be reused.

   Most used methods - forEach, map, filter, reduce, sum, average, count, mapToInt, collect, distinct
 */
public class Stream1 {
    public static void main(String[] args){

        //empty stream
        Stream<String> stream = Stream.empty();

        //print descending order
        List<Integer> list = Arrays.asList(1,2,3,4,5);
         Stream<Integer> data = list.stream();
         Stream<Integer> sortedData = data.sorted((a,b)->b-a);
         sortedData.forEach(System.out::println);
//        sortedData.forEach(n->System.out.println(n));                 // streams can't be reused after consumed.


//        //Sort elements and print
//        list.stream().sorted().forEach(System.out::println);


//        //Double values in the list
//        list.stream()
//                .sorted()
//                .map(x->2*x)
//                .forEach(System.out::println);                            //3 streams in total.
//
//
//        //Find even values
//        list.stream()
//                .sorted()
//                .filter(x->(x&1)!=1)
//                .forEach(x->System.out.println(x));
//
//
//        // add all values in the stream
//         int x = list.stream()
//                         .reduce(0,(c,e)->c+e);                   // 0 - initial value of accumulator, e - each element , c -accumulator
//
//         System.out.println(x);
    }
}
