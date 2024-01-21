package com.hkesari.stream;
import java.util.ArrayList;
import java.util.*;
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

    }
}
