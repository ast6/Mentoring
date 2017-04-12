package demo3;

import demo1_2.Input;

public class OddOrEvenNumber {
    Input input = new Input();

    public int counting(){
        int result = new Integer(input.getNumberForOddOrEven());

        if (result%2 ==0){
            System.out.println(String.format("%s is even number.", result));
        }
        else {
            System.out.println(String.format("%s is odd number.",result));
        }
        return result;
    }
}
