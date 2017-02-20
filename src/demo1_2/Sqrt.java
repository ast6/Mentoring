package demo1_2;

public class Sqrt {
    public static void main(String[] args) {

        Input input = new Input();
        double a = input.getNumber();
        double b = input.getNumber();
        double c = input.getNumber();

        Count count = new Count();
        count.counting(a, b, c);

//        CountSqrt countSqrt = new CountSqrt();
//        countSqrt.sqrtCounting(input.getNumberForSqr());
//            String s = ("sdf");
//            Prnt.printText("typed");

    }
}
