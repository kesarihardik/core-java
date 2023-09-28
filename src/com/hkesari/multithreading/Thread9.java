

//Virtual threads

package com.hkesari.multithreading;

import java.util.ArrayList;
import java.util.List;
public class Thread9 {
     public static void main(String[] args){
         List<Thread> vThreads = new ArrayList<>();

         for(int i=0; i<10000; i++){
             int vThreadIndex = i;
             Thread vThread = Thread.ofVirtual().start(()->{
                 int result = 1;
                 for(int j=0; j<10; j++)
                     result *= j+1;
                 System.out.println("Result of [" + vThreadIndex +"] thread :" + result);
             });

             vThreads.add(vThread);
         }

         for(int i=0; i<vThreads.size(); i++){
             try{
                 vThreads.get(i).join();
             }
             catch(Exception e){
                 throw new RuntimeException();
             }
         }
     }
}
