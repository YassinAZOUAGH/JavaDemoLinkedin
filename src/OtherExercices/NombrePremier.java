package OtherExercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NombrePremier {

    public static void main(String[] args) {
        List<Integer> nombres = new ArrayList<>();

        nombres.add(11);
        nombres.add(15);
        nombres.add(17);
        nombres.add(196);
        nombres.add(37);
        nombres.add(35);
        nombres.add(39);
        nombres.add(9);
        nombres.add(7);
        nombres.add(3);


       List<Integer> list = filtrerNombrePremier(nombres);

        System.out.println(list);
    }

    public static List<Integer> filtrerNombrePremier(List<Integer> nombres) {

        List<Integer> nombrePremier = new ArrayList<>();
        for (int nombre : nombres) {
        if(estNombrePremier(nombre)){
            nombrePremier.add(nombre);
        }

        }
        return nombrePremier;
    }

    public static Boolean estNombrePremier(int nombre){
        if(nombre<=1){
            return false;
        }

        for(int i=2; i<Math.sqrt(nombre); i++ ){
            if(nombre%i==0){
                return false;
            }
        }
        return true;
    }

}
