package OtherExercices;

import java.util.LinkedList;

public class Calculate {
    public int calculate(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        int num = 0;
        int result = 0;
        int sign = 1; // 1 represents positive sign, -1 represents negative sign

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop(); // previous sign
                result += stack.pop(); // previous result
            }
        }

        // Add the last number
        result += sign * num;
        return result;
    }

    public static void main(String[] args) {
        Calculate calculator = new Calculate();
        System.out.println(calculator.calculate("1 + 1")); // Output: 2
        System.out.println(calculator.calculate(" 2-1 + 2 ")); // Output: 3
        System.out.println(calculator.calculate("(1+(4+5+2)-3)+(6+8)")); // Output: 23
    }
};