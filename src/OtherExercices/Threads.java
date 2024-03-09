package OtherExercices;

public class Threads {

    public static void main(String[] args) {

        MonThread thread1 = new MonThread();
        thread1.start();

        MonRunnable monRunnable = new MonRunnable();
        monRunnable.run();

        /*Thread thread2 = new Thread(new MonRunnable());
        thread2.start();*/
    }
}

// Classe étendant Thread
 class MonThread extends Thread {
    int x=14;
    int y=6;
    int z= x-y;
    @Override
    public void run() {
        System.out.println("Exécution de MonThread soustraction: "+z);
    }
}

class MonRunnable implements Runnable{

    @Override
    public void run() {
        int x,y;
        x=10;
        y=5;
        int z=x+y;

        System.out.println("Exécution de MonRunnable addition: "+z);

    }
}


