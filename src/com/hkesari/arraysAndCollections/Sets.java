package com.hkesari.arraysAndCollections;
import java.util.*;
public class Sets {
    public static void main(String [] args){
        Set<Integer> s = new HashSet<>();
        s.add(5);
        s.add(3);
        s.add(4);
        s.add(3);

        System.out.println(s);
        //add, remove,contains

        for(Integer i: s){
            System.out.println(i);
        }

        Iterator<Integer> it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
