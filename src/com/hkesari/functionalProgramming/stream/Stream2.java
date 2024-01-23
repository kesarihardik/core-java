package com.hkesari.functionalProgramming.stream;
import java.util.ArrayList;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args){
        List<Object> list = new ArrayList<>();
        list.add(123);
        list.add(true);
        list.add("string");

        Object[]  o = list.stream().toArray();                      //list.toArray();
        System.out.println(Arrays.toString(o));

        Set s =  list.stream().collect(Collectors.toSet());        // new HashSet<>(list);

        List<String> words = Arrays.asList("Java", "is", "fun", "with", "Collectors", "joining");
        String result1 = words.stream().collect(Collectors.joining(","));
        System.out.println("Result 1: " + result1);

        Map<String, Integer> map = words.stream().collect(Collectors.toMap(Function.identity(), String::length));
        map.forEach((k,v)->System.out.println(k+" "+v));
    }
}
