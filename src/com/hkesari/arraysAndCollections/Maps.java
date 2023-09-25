package com.hkesari.arraysAndCollections;
import java.util.*;
import java.util.HashMap;

public class Maps {
     public static void main(String[] args){
         Map<Integer,Integer> mp = new HashMap<>();
         mp.put(2,3);
         mp.put(3,4);
         mp.put(3,5);
         System.out.println(mp);

         System.out.println(mp.get(2));

         System.out.println(mp.containsKey(2));
         System.out.println(mp.containsKey(3));

         mp.remove(2);

         for(Integer key : mp.keySet()){
             System.out.println(key+"--"+mp.get(key));
         }
     }
}

//isEmpty(),size(),clear()
