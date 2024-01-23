package com.hkesari.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class CounterClass{
    public int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increment(){
        lock.lock();
        try {
            count++;
        }
        finally {
            lock.unlock();
        }
    }

    public int getCount(){
        lock.lock();
        try {
            return count;
        }
        finally {
            lock.unlock();
        }
    }
}
class IncrementThread extends Thread{
    private final CounterClass counterClass;

    public  IncrementThread(CounterClass counterClass){
        this.counterClass = counterClass;
    }

    @Override
    public void run(){
        for(int i=0; i<5;i++){
            counterClass.increment();
        }
    }
}
public class ThreadLock {
    public static void main(String[] args){
        CounterClass c = new CounterClass();
        IncrementThread t1 = new IncrementThread(c);
        IncrementThread t2 = new IncrementThread(c);

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){

        }

        System.out.println(c.getCount());
    }
}
