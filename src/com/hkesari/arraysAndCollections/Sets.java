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

        System.out.println();
        Set<Integer> set2 = new LinkedHashSet<>();                 //insertion order is preserved in linked hashset.
        set2.add(12);
        set2.add(11);
        set2.add(10);
        set2.forEach(x->System.out.print(x+" "));

//        System.out.println();
//        Set<Integer> set3 = new TreeSet<>();                 //sorted according to natural ordering.
//        set3.add(12);
//        set3.add(11);
//        set3.add(10);
//        set3.forEach(x->System.out.print(x+" "));



        //tree set natural order reversed.
        Set<Integer> set3 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2,o1);
            }
        });
        set3.add(12);
        set3.add(11);
        set3.add(10);
        set3.forEach(x->System.out.print(x+" "));
    }
}
