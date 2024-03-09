package com.linkedin.model;

class MonThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " - Message " + i);
        }
    }
}

public class ExempleMultiThread {

    public static void main(String[] args) {
        MonThread thread1 = new MonThread();
        MonThread thread2 = new MonThread();

        // Démarre les threads
        thread1.start();
        thread2.start();
    }
}
