package org.example;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 1 Started");
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 2 Started");
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread2.start();
        }
}