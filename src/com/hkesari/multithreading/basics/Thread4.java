package com.hkesari.multithreading.basics;

//Thread safe - obj/ class/ fields are always in valid consistent state for all threads.

/*Volatile vs synchronized  -https://stackoverflow.com/questions/3519664/difference-between-volatile-and-synchronized-in-java
          - sync guarantees atomicity and visibility of critical section.
          - volatile guarantees visibility. changes are visible to other threads immediately.

 volatile -  used with fields. value of a volatile field is never cached by thread. It has to always read from main memory.
 synchronized  - locks resource(monitor) only one thread gets access to the block. thread get update of value from main memory and flush it to main after done with it before exit.
 atomic       - similar to volatile but higher performance.
 don't use synchronized and volatile together
*/

 class Counter{
     int count = 0;
    public synchronized void increment(){                  //SYNC makes this method thread safe.
        count++;
    }
    public int getCount(){return this.count;}
}

public class Thread4 {
    public static void main(String[] args) throws InterruptedException{
       Counter A = new Counter();

       Thread t1 = new Thread( ()-> {
           for (int i = 0; i < 1000; i++) {
               A.increment();
           }
       })  ;

       Thread t2 = new Thread( ()-> {
            for (int i = 0; i < 1000; i++) {
                A.increment();
            }
        })  ;

      t1.start();
      t2.start();
      t1.join();
      t2.join();

      System.out.println(A.getCount());
    }
    
}
