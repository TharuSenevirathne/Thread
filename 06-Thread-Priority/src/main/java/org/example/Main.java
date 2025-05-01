package org.example;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread2.start();


        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread1.setPriority(10);
        thread2.setPriority(1);
        thread1.setPriority(5);

        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());

        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getPriority());

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
    }
}