package com.hkesari.multithreading.basics;

// Stopping a running thread


class StoppableThread implements  Runnable{
    private boolean isStopRequested = false;

    public synchronized  void requestStop(){
        this.isStopRequested = true;
    }

    private void sleep(long millis){
        try{
            Thread.sleep(millis);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        while(!isStopRequested){
            System.out.println("Stoppable Thread running....");
        }
        System.out.println("Stoppable Thread stopped.");
    }

}


public class Thread6 {
    public static void main(String[] args){
        StoppableThread t = new StoppableThread();
        Thread StoppableThread = new Thread(t);
        StoppableThread.start();

        try{
            Thread.sleep(50);                         // this makes the current thread (main) sleep
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Requesting Stoppable Thread.");
        t.requestStop();
        System.out.println("Thread terminated");
    }
}
