package exerciceTest;

public class ConcatString {
    public static void main(String[] args) {

        String[] str = {"f","o","o","bar"};

        System.out.println("--->"+concat(str));
    }

    public static String concat(String[] str){
        String result ="";

        for(int i = 0; i<str.length; i++){
            System.out.println(str[i]);
            result+=str[i];
        }
        return result;
    }

}
