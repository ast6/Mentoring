package demo6;

import java.util.LinkedList;

public class CalculationOfRPN {
    ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
    LinkedList<Integer> ints = new LinkedList<>();
    LinkedList<Character> opers = new LinkedList<>();

    public int val(String value) {
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i); //for comparison
            if (c == '(') {
                opers.add('(');
            } else if (c == ')') {
                while (opers.getLast() != '(') ;
                {
                    reversePolishNotation.calculation(ints, opers.removeLast());
                }
                opers.removeLast();
            } else if (reversePolishNotation.isOperator(c)) {
                while (!opers.isEmpty() && reversePolishNotation.priority(opers.getLast()) >= reversePolishNotation.priority(c)) {
                    reversePolishNotation.calculation(ints, opers.removeLast());
                }
            } else {
                String operand = "";
                while (i < value.length() && Character.isDigit(value.charAt(i))) {
                    operand += value.charAt(i++);
                }
                //if "while" does not work
                i--;
                ints.add(Integer.parseInt(operand));
            }
            while (!opers.isEmpty()) {
                reversePolishNotation.calculation(ints, opers.removeLast());
            }
        }
        return ints.get(0);
    }
}
