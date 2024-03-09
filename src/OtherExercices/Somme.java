package OtherExercices;

import java.util.Scanner;

public class Somme {

    public static void main(String[] args) throws Exception {
        ThreadAddition threadAddition = new ThreadAddition();
        threadAddition.start();

        ThreadSoutraction threadSoutraction = new ThreadSoutraction();
        threadSoutraction.run();
    }


}

class ThreadAddition extends Thread {
    @Override
    public void run() {
        System.out.println("entrer la valeur de x et de y: ");
        Scanner scanerx = new Scanner(System.in);
        Scanner scanery = new Scanner(System.in);

        int x = Integer.parseInt(scanerx.nextLine());
        int y = Integer.parseInt(scanery.nextLine());
        System.out.println("La somme des nombres est"+x+ "et "+y+" :  " + somme(x, y));

        scanerx.close();
        scanery.close();
    }

    public static int somme(int x, int y) {

        return x + y;
    }
}

class ThreadSoutraction implements Runnable {

    @Override
    public void run() {
        System.out.println("entrer la valeur de z et de w: ");
        Scanner scanerx = new Scanner(System.in);
        Scanner scanery = new Scanner(System.in);

        int x = Integer.parseInt(scanerx.nextLine());
        int y = Integer.parseInt(scanery.nextLine());
        System.out.println("La soustraction des nombres"+x+ ""+y+"  est : " + soustraction(x, y));

        scanerx.close();
        scanery.close();
    }

    public static int soustraction(int x, int y) {

        return x - y;
    }

}
