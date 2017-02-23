package demo1_2;

public class Sqrt {
    static String chose;
    static Input input = new Input();
    static boolean repeat = true;

    public static void demo1() {


        while (repeat) {
            double a = input.getNumber();
            double b = input.getNumber();
            double c = input.getNumber();

            Count count = new Count();
            count.countingBothCases(a, b, c);

            repeat = check();
        }
    }

    private static boolean check() {
        chose = input.getString();
        boolean checked = true;
        if (chose.equalsIgnoreCase("yes")) {
            checked = true;
        } else if (chose.equalsIgnoreCase("no")) {
            checked = false;
        } else {
            System.out.println("Wrong value!");
            check();
        }
        return checked;
    }
}


