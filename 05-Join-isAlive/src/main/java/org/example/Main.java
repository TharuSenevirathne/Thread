package org.example;

public class Main {
    public static void main(String[] args) {
//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Thread 1 Started");
//                try {
//                    Thread.sleep(10);
//                }catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//        thread1.start();
//
//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Thread 2 Started");
//                try {
//                    Thread.sleep(10);
//                }catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//        thread2.start();
//        System.out.println("BYE"); //Main thread eka thamai meyw print krnne




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
        System.out.println(thread1.isAlive());



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
        System.out.println(thread1.isAlive());

        try {
            thread1.join();
            System.out.println(thread1.isAlive());

            thread2.join();
            System.out.println(thread1.isAlive());

        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("BYE");
        System.out.println(thread1.isAlive());

    }
}