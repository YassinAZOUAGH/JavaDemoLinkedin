package OtherExercices;

public class ExerTest {

    public static void main(String[] args) {

        int[] monTab = {1,2,3,4,5,6,7};


        int ca = (calc(monTab,0,2));
        if(ca==0){
            System.out.println("il y a un erreur");
        }
        else System.out.println("la somme est "+ ca);
    }

    public static int calc(int [] tab, int n1, int n2){
        int somme =0;
        if(n1>=0 && n2>=n1 && n2<tab.length-1){
        for(int i = n1; i<=n2; i++){
           somme+=tab[i];
        }
        }
        return somme;
    }
}
