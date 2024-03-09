package OtherExercices;

public class MethodeStatic {
    public static void main(String[] args) {

       int x=  Factoriel.factoriel(5);
        System.out.println(x);
    }


}

class Factoriel{

   // Une méthode static est une méthode de class qui ne nécessite par la création d’une instance pour l’invoquer
    public static int factoriel(int nombre){
        if(nombre == 0){
            return 1;
        }
        else {
            return nombre * factoriel(nombre-1);
        }

    }
}
