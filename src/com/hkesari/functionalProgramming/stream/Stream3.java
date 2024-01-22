package com.hkesari.functionalProgramming.stream;
import java.util.*;

//calculate average using streams
public class Stream3 {
    public static void main(String[] args) {

        //find average
        List<Integer> list = Arrays.asList(12,13,14,14,15);
        System.out.println(list.stream()
                .mapToDouble(x->x)
                .average().orElse(0.0));

        list.stream().distinct().mapToDouble(x->x).forEach(System.out::println);
    }
}
