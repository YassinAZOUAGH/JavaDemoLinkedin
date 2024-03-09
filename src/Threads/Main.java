package Threads;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Création des threads
        Thread thread1 = new Thread(new IncrementTask(counter));
        Thread thread2 = new Thread(new IncrementTask(counter));

        // Démarrage des threads
        thread1.start();
        thread2.start();

        try {
            // Attente de la fin des threads
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Affichage du résultat
        System.out.println("Final count: " + counter.getCount());
    }
}

class IncrementTask implements Runnable {
    private Counter counter;

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        // Incrémentation du compteur plusieurs fois
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
