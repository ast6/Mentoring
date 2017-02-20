package demo1_2;

import java.util.Scanner;

public class Input {
    public double getNumber() {

        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        return in.nextDouble();

    }

//    public double getNumberForSqr(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input number for square root: ");
//        return in.nextDouble();
//    }
}
