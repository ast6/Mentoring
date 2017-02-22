package demo1_2;

public class Sqrt {

    public static void demo1() {
        boolean repeat = true;
        String chose;
        while (repeat) {
            Input input = new Input();
            double a = input.getNumber();
            double b = input.getNumber();
            double c = input.getNumber();

            Count count = new Count();
            count.countingBothCases(a, b, c);

            chose = input.getString();
            if (chose.isEmpty()) {
                System.out.println("Please type \"yes\" or \"no\".");
            } else if (chose.equalsIgnoreCase("no")) {
                repeat = false;
            }
        }

    }

//        CountSqrt countSqrt = new CountSqrt();
//        countSqrt.sqrtCounting(input.getNumberForSqr());
//            String s = ("sdf");
//            Prnt.printText("typed");

}
