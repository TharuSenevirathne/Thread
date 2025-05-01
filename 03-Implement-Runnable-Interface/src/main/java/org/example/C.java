package org.example;

public class C {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("C");
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
                System.out.println("D");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread2.start();
    }
}
