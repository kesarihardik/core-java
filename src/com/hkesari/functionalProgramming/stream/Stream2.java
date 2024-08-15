package com.hkesari.functionalProgramming.stream;
import java.util.*;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {

//        Stream.of("a1","a2","a3").map(s->s.substring(1)).mapToDouble(Double::parseDouble).forEach(System.out::println);

//        Stream.concat(Stream.of(12,12),Stream.of(14,15)).forEach(System.out::println);

        //max , min
//        Optional<Integer> max = Stream.of(12,14,156).max((a,b)->a-b);

                //find average
                List < Integer > list = Arrays.asList(12, 13, 14, 14, 15);
        System.out.println(list.stream()
                .mapToDouble(x->x)
                .average().orElse(0.0));
    }
}
