package com.hkesari.multithreading;

/*
thread                -- single sequential flow of control in a program. basic unit of execution
multithreading        -- executing 2 or more concurrent threads.
What is  thread life cycle ?             https://www.geeksforgeeks.org/lifecycle-and-states-of-a-thread-in-java/

How to implement multithreading                  --extending Thread class and implementing Runnable interface.
                                                    override the run method in both ways and use start to execute thread.
                                                    Thread object implements runnable.
                                                    start method invokes run.
*/
class Hi extends Thread{
    @Override
    public void run(){                       //run method is called by start.
        for(int i =0;i<5;i++){
            System.out.println("Hi");
            try{Thread.sleep(100);}
            catch (Exception ex){};
        }
    }
}

class Hello extends Thread{
    @Override 
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("Hello");
            try{Thread.sleep(100);}
            catch (Exception ex){};
        }
    }
}
public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
        Hi o1 = new Hi();
        Hello o2 = new Hello();

        o1.start();                    //start method calls run always.

        try{
            Thread.sleep(10);
        }
        catch(Exception ex){     }
        
        o2.start();


        o1.join();
        o2.join();

    }
}
