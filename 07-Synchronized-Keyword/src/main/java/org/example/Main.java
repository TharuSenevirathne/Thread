package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculation calculation = new Calculation();

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 1000; i++) {
                calculation.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i < 1000; i++) {
                calculation.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Value is : "+calculation.num);
    }
}

class Calculation{
    int num;

    public synchronized void increment() {
        num++;
    }
}