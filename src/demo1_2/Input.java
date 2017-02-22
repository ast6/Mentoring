package demo1_2;

import java.util.Scanner;

public class Input {

    Scanner in = new Scanner(System.in);

    public double getNumber() {

        System.out.println("Input number: ");
        return in.nextDouble();

    }

    public String getString() {
        System.out.println("Would you want to count more? Type \"yes\" or \"no\".");
        return in.next();
    }

//    public double getNumberForSqr(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input number for square root: ");
//        return in.nextDouble();
//    }
}
