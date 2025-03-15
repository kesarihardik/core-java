package com.hkesari.multithreading.basics;

import java.util.concurrent.atomic.AtomicBoolean;

class TT{
    AtomicBoolean isPart1Done = new AtomicBoolean(false);              //prevents threads from creating local copies.
    public synchronized void part1(){
      System.out.println( Thread.currentThread().getName() +" started" );
      System.out.println("Welcome to India");
      isPart1Done.set(true);
      notify();                        //comment notify() to see exception handling
    }

    public synchronized void part2() throws InterruptedException {
       long startTime = System.currentTimeMillis();
      System.out.println(Thread.currentThread().getName() +" started" );
        while(!isPart1Done.get()){

            if(System.currentTimeMillis()-startTime > 3000)
                 throw new InterruptedException("Wait exceeded");

            System.out.println(Thread.currentThread().getName() +" waiting" );

            try{
                wait();
            }
            catch(InterruptedException ex){
               System.out.println("Exception occurred " + ex.getClass());
               System.exit(-1);
            }

            System.out.println(Thread.currentThread().getName() +" resumed" );
            System.out.println("Do visit Ayodhya.");
        }

    }
}
public class Thread5 {
    public static void main(String[] args) throws InterruptedException{

        TT t = new TT();
        Thread t1 = new Thread(t::part1);          // new Thread(()->t.part1())
        Thread t2 = new Thread(()-> {
            try {
                t.part2();
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread interrupted.");
            }
        });

        t2.start();
        t1.start();

        t1.join();
        t2.join();
    }
}
