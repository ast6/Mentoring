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
}
