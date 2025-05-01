package org.example;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Thread thread = new Thread(a);
        thread.start();

        B b = new B();
        Thread thread2 = new Thread(b);
        thread2.start();
    }
}

class A implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}