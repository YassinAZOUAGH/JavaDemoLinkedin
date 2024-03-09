package OtherExercices;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        calculator(87);
    }

    public static void calculator(int s){

        LinkedList<Integer> stack = new LinkedList<>();


        stack.push(s);
        stack.push(1);
        stack.push(2);
        stack.add(3);
        stack.add(4);
        //stack.pop();


        System.out.println(stack);
    }
}
