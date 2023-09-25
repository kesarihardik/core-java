package com.hkesari.multithreading;

//Thread safe means its value can be accessed by multiple threads at the same time without any problem. it is never cached.

//Volatile vs synchronized                             --volatile is used with variables, sync is used with methods & blocks. volatile is nob-blocking , sync blocks. Hence, volatile has no deadlock or livelock problems
//volatile -                     no thread creates local copy. read and write operations on main memory only.
////synchronized  -                 only one thread gets access to the block. thread get update of value from main memory and flush it to main after done with it before exit.
//atomic                       - -similar to volatile but higher performance.
// don't use synchronized and volatile together

 class Counter{
     int count = 0;
    public synchronized void increment(){                  //SYNC makes this method thread safe.
        count++;
    }
    public int getCount(){return this.count;}
}

public class Sync4 {
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
