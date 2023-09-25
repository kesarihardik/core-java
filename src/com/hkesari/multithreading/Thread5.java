package com.hkesari.multithreading;

//methods for notifying and waiting in thread                             --wait() ,notify()
// use synchronized when using wait and notify
//why wait should always be inside while?
//when to use synchronized?                                                  --when two threads access the same object, memory, location . so introduce lock in it.
//exception handling

class Welcome{
    volatile boolean part1Done = false;              //prevents threads from creating local copies.
  public synchronized void part1(){
      System.out.println( Thread.currentThread().getName() +" started" );
      System.out.println("Welcome to India.");
      part1Done=true;
      notify();                        //comment notify() to see exception handling
  }

   synchronized void part2() {
      System.out.println(Thread.currentThread().getName() +" started" );
        while(!part1Done){
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
    public static void main(String[] args){

        Welcome A = new Welcome();
        Thread t2 = new Thread(()->{
                A.part2();
        });
        Thread t1 = new Thread(A::part1);

        t2.start();
        t1.start();

        long startTime = System.currentTimeMillis();
        while(true){
            if(System.currentTimeMillis()-startTime > 3000)
                t2.interrupt();
        }
    }
}
