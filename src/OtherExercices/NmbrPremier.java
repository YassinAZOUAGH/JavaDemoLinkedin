package OtherExercices;

import java.util.ArrayList;
import java.util.List;

public class NmbrPremier {
    public static void main(String[] args) {

        int[] nmrs = {10,5,6,7,11,22,99};

        System.out.println( filtrer(nmrs));

    }


    public static List<Integer> filtrer(int[] nombres){

        List<Integer> nmrePremier = new ArrayList<>();
        for (int element: nombres){
            if (verefierNomrePremier(element)){
                nmrePremier.add(element);
            }
        }

        return nmrePremier;
    }
    public static Boolean verefierNomrePremier(int nombre) {
        if (nombre <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }

        return true;
    }
}
