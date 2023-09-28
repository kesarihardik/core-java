package com.hkesari.multithreading;

//Make main thread to wait for daemon thread
public class Thread8 {
     public static void main(String[] args){
         Thread t = new Thread(()->{
             for(int i=0; i<5;i++)
                 System.out.println("Running ...");
         });

         t.setDaemon(true);
         t.start();

         try{
             t.join();
         }
         catch(Exception e){
             e.printStackTrace();
         }
     }
}
