package com.hkesari.stream;
import java.util.ArrayList;
import java.util.*;

//Program to map list of objects(string,boolean) to map using streams
public class Stream2 {
    public static void main(String[] args){
        List<Object> list = new ArrayList<>();
        list.add(123);
        list.add(true);
        list.add("string");

        Map<Object,Object> mp = new HashMap<>();
        list.stream().forEach(x->{
             mp.put(x,x);
        });

        for(Object ob: mp.keySet()){
            System.out.println(ob +" -- "+mp.get(ob));
        }

    }
}
