package com.hkesari.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Producer implements Runnable{
    private final BlockingQueue<String> queue;          //thread safe

    public Producer(BlockingQueue<String> queue){
        this.queue = queue;
    }

    public void run(){
        try{
            for(int i=0; i<5; i++){
                queue.add("Message - " + i);
                Thread.sleep(100);
            }
            queue.put("EOF");
        }catch(Exception ignored){ }
    }
}

class Consumer implements Runnable{
    private final BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue){
        this.queue = queue;
    }

    public void run(){
        try {
            while (true) {
                String msg = queue.take();
                if(msg.equalsIgnoreCase("EOF")) break;
                System.out.println(msg);
                Thread.sleep(20);
            }
        }catch(Exception ignored){}
    }
}


public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(10);
        Thread producer = new Thread( new Producer(queue) );
        Thread consumer = new Thread( new Consumer(queue) );

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
