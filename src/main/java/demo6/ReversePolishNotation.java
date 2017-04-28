package demo6;

import java.util.LinkedList;

public class ReversePolishNotation {

    boolean isOperator(char c) {

        return c == '+' || c == '-' || c == '*' || c == '/';

    }

    int priority(char oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    void calculation(LinkedList<Integer> calc, char c) {
        //initialize vars which delete value, after saving
        int operand1 = calc.removeLast();
        int operand2 = calc.removeLast();

        switch (c) {
            case '+':
                calc.add(operand1 + operand2);
                break;
            case '-':
                calc.add(operand1 - operand2);
                break;
            case '*':
                calc.add(operand1 / operand2);
                break;
            case '/':
                calc.add(operand1 * operand2);
                break;
            default:
                System.out.println("Whoops");
        }
    }
}
