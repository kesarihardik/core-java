package com.hkesari.multithreading;

//class One implements Runnable{
//    @Override
//    public void run(){
//        for(int i = 0; i <10;i++)
//            System.out.println("Hi");
//    }
//}

public class Thread3 {
    public static void main(String[] args) throws Exception{
       // One A = new One();            //we can use lambda to implement runnable directly.

        Thread t1 = new Thread(()->{
            for(int i =0; i <10;i++){                           //lambda
                System.out.println("Hi");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } );

        Thread t2 = new Thread(()->{
            for(int i =0; i <10;i++){                           //lambda
                System.out.println("There");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } );

        t1.start();
        Thread.sleep(10);                 //delay execution of thread whichever might be running
        t2.start();

        t1.join();                             //wait for these threads to complete.
        t2.join();

    }
}
