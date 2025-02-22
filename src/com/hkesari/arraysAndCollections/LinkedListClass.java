package com.hkesari.arraysAndCollections;
import java.util.*;

//LinkedListClass is doubly linked list implementation.
//linked list class contains offer, addFirst, addLast methods also.
//Implement linked list and its iterator.
public class LinkedListClass {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.offer(4);
        ll.add(3);
        ll.add(5);
        ll.add(2,4);

        ll.remove(2);
        ll.removeFirst();
        ll.removeLast();
        ll.offer(3);
        ll.addFirst(3);
        ll.addLast(5);

        System.out.println(ll);

//       Iterator<Integer> it = ll.iterator();            //Iterator it = ll.iterator(); works fine too
//       while(it.hasNext()){
//           System.out.println(it.next());
//       }

        //method reference
       ll.forEach(System.out::println);
    }
}
