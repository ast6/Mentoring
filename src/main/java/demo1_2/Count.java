package demo1_2;

public class Count {

    double x1;
    double x2;
    String result;

    public String fullQE(double a, double b, double c) {
        double D = (b * b) - (4 * a * c);

        if (D < 0) {
            result = "Nor real roots. Discriminant < 0";
        } else if (D == 0) {
            x1 = -b / (2 * a);
            result = String.format("Root is: %s because discriminant is 0", x1);
        } else {
            x1 = (-b - Math.sqrt(b * b - (4 * a * c))) / (2 * a);
            x2 = (-b + Math.sqrt(b * b - (4 * a * c))) / (2 * a);

            result = String.format("Root 1 is: %s; Root 2 is: %s", x1, x2);
        }
        return result;

    }

    public void countingBothCases(double a, double b, double c) {

        if (a == 0) {
            x1 = -(c / b);
            result = String.format("Root is: %s. Because a =0", x1);
        } else if (b == 0) {

            if (-c / a > 0) {
                x1 = Math.sqrt(-(c / a));
                x2 = -(Math.sqrt(-(c / a)));
                result = String.format("Root 1 is: %s; Root 2 is: %s. Because b = 0 and -c / a > 0", x1, x2);
            } else {
                result = "Nor real roots. Because b = 0 and -c / a < 0";
            }
        } else if (c == 0) {
            x1 = 0;
            x2 = -(b / a);
            result = String.format("Root 1 is: %s; Root 2 is: %s. Because c = 0", x1, x2);
        } else {
            result = fullQE(a, b, c);
        }
        System.out.println(result);
    }

}
