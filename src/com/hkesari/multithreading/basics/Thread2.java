package com.hkesari.multithreading.basics;

//Implement multithreading using thread runnable interface which is a functional interface.
//methods in thread              -- Thread.getName(), Thread.setName(), setPriority(), getPriority(), isAlive(), interrupt()


class Hey implements Runnable{
    @Override
    public void run() {
        for(int i =0; i<5; i++){
            System.out.println("Hey");
            try{Thread.sleep(1000);}catch (Exception ex){};
        }

    }
}

class There implements Runnable{
    @Override
    public void run() {
        for(int i =0; i<5; i++){
            System.out.println("There");
            try{Thread.sleep(1000);}catch (Exception ex){};
        }

    }
}


public class Thread2 {
    public static void main(String[] args) throws InterruptedException {
        Hey n1 = new Hey();
        There n2 = new There();

        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);

        t1.setName("First Thread");

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t2.getPriority());

        t1.start();
        try{Thread.sleep(10);}catch (Exception ignored){};
        t2.start();


        t1.join();                      //join: wait for this thread to terminate then execute next statement.
        t2.join();

        System.out.println(t1.isAlive()); //check thread is alive
        System.out.println("Bye");
    }
}

//we can further simplify code using lambda.
