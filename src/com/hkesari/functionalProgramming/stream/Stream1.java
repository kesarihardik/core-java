package com.hkesari.functionalProgramming.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Stream vs collection -
         Stream is an abstraction of non-mutable collection of functions applied in some order to data.
         Stream is not collection. It doesn't store data. It enables functional programming for us.
         Stream doesn't change original data. It also can not be reused.

   Most used methods - forEach, map, flatMap, filter, reduce, sum, average, count, mapToInt, collect, distinct
 */

public class Stream1 {
    public static void main(String[] args){

        //empty stream
        Stream<String> stream = Stream.empty();

        List<Integer> list = Arrays.asList(1,2,3,4,5);

          //Streams can not be reused
//        Stream<Integer> data = list.stream();
//        Stream<Integer> sortedData = data.sorted((a,b)->b-a);
//        //sortedData.forEach(System.out::print);
//        //sortedData.forEach(n->System.out.println(n));                 // streams can't be reused after consumed.


        //sorted(Comparator)
//        list.stream().sorted().forEach(System.out::print);
//        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);          // sorted((a,b)->b-a)


//        //Double values in the list
//        list.stream()
//                .sorted()
//                .map(x->2*x)
//                .forEach(System.out::println);                            //3 streams in total.


//        //Find even values
//        list.stream()
//                .sorted()
//                .filter(x->(x&1)!=1)
//                .forEach(x->System.out.println(x));


        //anyMatch, allMatch, noneMatch
//        if(list.stream().anyMatch(x->x==1)) System.out.println("1 present");
//        if(list.stream().allMatch(x->x<10)) System.out.println("All values are less than 10.");
//        if(list.stream().noneMatch(x->x>10)) System.out.println("No value is greater than 10.");


        //flatMap          --  objectStreams.flatMap(Function.identity());
        List<List<Integer>> listOfLists = List.of(List.of(1,2),List.of(20,30));
        List<Integer> combined = listOfLists.stream().flatMap(Collection::stream).toList();
        System.out.print(combined);


        // for vs forEachOrdered
//        (Stream.of("abc", "foo", "zoo")).parallel().forEach(System.out::println);
//        (Stream.of("abc", "foo", "zoo")).parallel().forEachOrdered(System.out::println);       //forEachOrdered preserves order


        // reduce  -- T reduce(T identity, BinaryOperator<T> accumulator);
//         int x = list.stream().reduce(100, Integer::sum);
//         System.out.println(x);
//
//         Optional<String> longest = Stream.of("abcd","defg","abcded")
//                                      .reduce((str1, str2)-> (str1.length()>str2.length())?str1:str2);
//         System.out.println(longest.get());

        //findFirst(), findAny()
        OptionalInt val = IntStream.range(0,100).parallel().findAny();
        if(val.isPresent()) System.out.println(val.getAsInt());
        OptionalInt val2 = IntStream.range(0,100).parallel().findFirst();
        if(val2.isPresent()) System.out.println(val2.getAsInt());

    }
}
