package com.hkesari.multithreading.basics;

// daemon thread                           -- thread with the lowest priority. jvm doesn't wait for daemon thread unlike other threads. It stops its execution and shuts.

public class Thread7{
     public static void main(String[] args){
          Thread t = new Thread(()->{
              while(true){
                  System.out.println("Running ...");
              }
          });
          t.setDaemon(true);                               //marks thread as daemon thread

          t.start();


          try{
              Thread.sleep(2000);
          }
          catch(Exception e) {
              e.printStackTrace();
          }
     }
}
