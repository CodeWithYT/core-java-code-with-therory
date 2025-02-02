package com.java8features.lambda;

public class LambdaExpressions {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (char i = (char)65; i <= (char)90; i++) {
                System.out.println(i);
            }
                System.out.println("thread priority: "+Thread.currentThread().getPriority());
                System.out.println("thread name: "+Thread.currentThread().getName());
        };
        Thread t = new Thread(r);
        t.start();
        for (char i = (char)97; i <= (char)122; i++) {
            System.out.println(i);
        }
        System.out.println("thread priority: "+Thread.currentThread().getPriority());
        System.out.println("thread name: "+Thread.currentThread().getName());
    }
}
