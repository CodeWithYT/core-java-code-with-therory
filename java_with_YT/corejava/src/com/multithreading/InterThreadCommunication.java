package com.multithreading;



class TestQueue {


    private String i;
    boolean status = false;
    public synchronized void ram (String i) throws InterruptedException{
        while (status){
            wait();
        }
        this.i = i;
        System.out.println("pinky: " + i);
        status = true;
        notify();
    }

    public synchronized void sita() throws InterruptedException{
        while (!status){
            wait();
        }
        System.out.println("YT: "+ "hi pinky");
        status = false;
        notify();

    }

}

class Producer implements Runnable{
    TestQueue q;

    public Producer(TestQueue q) {
        this.q = q;
        Thread t = new Thread(this,"Producer");
        t.start();
    }

    @Override
    public void run() {

        while (true) {
            try {
                q.ram("hi YT");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class consumer implements Runnable{

    TestQueue q;
    public consumer(TestQueue q) {
        this.q = q;
        Thread t = new Thread(this,"consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                q.sita();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {

        TestQueue q = new TestQueue();
        Producer p = new Producer(q);
        consumer c = new consumer(q);

    }
}
