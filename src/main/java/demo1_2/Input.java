package demo1_2;

import java.util.Scanner;

public class Input {

    Scanner in = new Scanner(System.in);

    public double getNumber() {

        System.out.println("Input number: ");
        return in.nextDouble();

    }

public String getString() {
        System.out.println("If you want to count more type \"yes\" or \"no\".");
        return in.next();
        }

public String getNumberForWord() {
        System.out.println("Input number for converting to word:");
        return in.next();
        }

public String getNumberForOddOrEven(){
        System.out.println("Input number for oddVerification odd or even number:");
        return in.next();
        }
}
