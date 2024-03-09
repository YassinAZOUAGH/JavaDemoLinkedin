package exerciceTest;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {

        int[] array = {10,5,8,6,4,7,3,14,9,47,8,2,33,1};

        int n1=0;
        int n2=2;
        int somme = calc(array, n1,n2);
        System.out.println("la somme est "+ somme);
    }

    public static int calc(int[] array, int n1, int n2){

        int Somme =0;
        if(n1>=0 && n2>=n1 && n2< array.length){

            System.out.println(array[n1]);
            System.out.println(array[n2]);

            for(int i =n1; i<=n2 ;i++){
                System.out.println(i);
                Somme+= array[i];
            }

        }
        else {
            System.out.println("ko");
        }

        return Somme;
    }
}
