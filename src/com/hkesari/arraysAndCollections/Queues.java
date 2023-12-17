package com.hkesari.arraysAndCollections;
import java.util.*;

//queue interface is implemented by linked list class
public class Queues {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(5);

        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.poll());
        System.out.println(q);

//        PriorityQueue<Integer> pq = new PriorityQueue<>();    //min heap by default
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(12);
        pq.add(13);
        pq.add(14);

        System.out.println(pq.peek());

    }
}
