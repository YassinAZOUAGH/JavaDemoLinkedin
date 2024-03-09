package exerciceTest;

public class findNmrInTable {

    public static void main(String[] args) {

        int[] tab = {14,45,7,69,4};

        System.out.println("-->"+existe(tab , 41));
    }

    public static boolean existe(int[] ints, int k){


        for (int i =0; i<=ints.length-1; i++){
            if(ints[i]==k){
                return true;
            }
        }
        return false;
    }
}
