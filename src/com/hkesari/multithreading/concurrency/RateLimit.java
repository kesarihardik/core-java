package com.hkesari.multithreading.concurrency;

import java.util.concurrent.Semaphore;

class ATM {
    private final Semaphore semaphore;

    public ATM(int n){
        this.semaphore = new Semaphore(n);
    }

    public void use(int i){
        try{
            System.out.println("Person "+i+" trying to use ATM.");
            semaphore.acquire();
            System.out.println("Person  "+i+" got access to ATM.");
            Thread.sleep(1000);
        }catch (InterruptedException ignored){}
        finally {
            System.out.println("Person "+i+" has finished and left.");
            semaphore.release();
        }
    }
}

public class RateLimit {

    public static void main(String[] args){
        ATM ATM = new ATM(10);
        for(int i=1;i<4; i++){
            int k = i;
            new Thread(()-> ATM.use(k)).start();
        }
    }
}
