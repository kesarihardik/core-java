package com.hkesari.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//What is a stream?                                       --Stream is a sequence of objects that can be processed in a functional style.
//Can they be reused?                                      --they can't be reused, they don't change original object.

public class Stream1 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(8,4,7,2,1);

        //  Stream<Integer> data = nums.stream();
//        Stream<Integer> sortedData = data.sorted();
////        sortedData.forEach(n->System.out.println(n));
//        //sortedData.forEach(n->System.out.println(n));                 // streams can't be reused after consumed.
//

         //Print elements;
//          list.forEach(x->System.out.println(x));

        //Sort elements and print
        list.stream().sorted().forEach(System.out::println);


        //Double values in the list
        list.stream()
                .sorted()
                .map(x->2*x)
                .forEach(System.out::println);                            //3 streams in total.


        //Find even values
        list.stream()
                .sorted()
                .filter(x->(x&1)!=1)
                .forEach(x->System.out.println(x));


        // add all values in the stream
         int x = list.stream()
                         .reduce(0,(c,e)->c+e);                   // 0 - initial value of accumulator, e - each element , c -accumulator

         System.out.println(x);
    }
}
