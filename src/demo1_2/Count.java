package demo1_2;

public class Count {

    public String fullQE(double a, double b, double c) {
        double x1;
        double x2;
        String resultFullQE;
        double D = (b * b) - (4 * a * c);

        if (D < 0) {
            resultFullQE = "Nor real roots";
        } else if (D == 0) {
            x1 = -b / (2 * a);
            resultFullQE = ("Root is: " + x1);
        } else {
            x1 = (-b - Math.sqrt(b * b - (4 * a * c))) / (2 * a);
            x2 = (-b + Math.sqrt(b * b - (4 * a * c))) / (2 * a);

            resultFullQE = "Root 1 is: " + x1 + "; Root 2 is: " + x2;
        }
        return resultFullQE;

    }

    public void countingBothCases(double a, double b, double c) {
        double x1;
        double x2;
        String resultNotFullQE;

        if (a == 0) {
            x1 = -(c / b);
            resultNotFullQE = "Root is: " + x1;
        } else if (b == 0) {

            if (-c / a > 0) {
                x1 = Math.sqrt(-(c / a));
                x2 = -(Math.sqrt(-(c / a)));
                resultNotFullQE = "Root 1 is: " + x1 + "; Root 2 is: " + x2;
            } else {
                resultNotFullQE = "Nor real roots";
            }
        } else if (c == 0) {
            x1 = 0;
            x2 = -(b / a);
            resultNotFullQE = "Root 1 is: " + x1 + "; Root 2 is: " + x2;
        } else {
            resultNotFullQE = fullQE(a, b, c);
        }
        System.out.println(resultNotFullQE);
    }

}
