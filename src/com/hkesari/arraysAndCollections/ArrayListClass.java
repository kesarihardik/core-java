package com.hkesari.arraysAndCollections;
import java.util.*;
public class ArrayListClass {
    public static void main(String[]  args) {

//        List<Integer> arr = new ArrayList<>();
//        arr.add(12);
//        arr.add(3);
//        arr.remove(0);
//        System.out.println(arr);


       List<Integer> list = new ArrayList<>(Arrays.asList(12,3,24,23,22,2,4));

       list.set(0,101);
       list.remove(2);

       System.out.println(list.size());
       System.out.println(list.get(0));
       System.out.println(list.contains(24));
       System.out.println(list.indexOf(22));
       System.out.println(list);

       //sort, reverse

//       Collections.reverse(list);

//       Collections.sort(list);
//       System.out.println(list);

       list.sort(Collections.reverseOrder());

       System.out.println(list);


        //2-D
       List<List<Integer>> list2 = new ArrayList<>();
       list2.add(Arrays.asList(1,2,3,4));
       list2.add(Arrays.asList(5,6,7,8));

       //Print
//       System.out.println(list2);
       list2.forEach(e->{
          System.out.println(e.toString());
       });

       //get , set , contains
       System.out.println(list2.size());
        System.out.println(list2.get(0).size());
       System.out.println(list2.get(1).get(2));

       System.out.println(list2.get(1).contains(8));
       System.out.println(list2.get(1).contains(-8));
    }
}
