package demo1_2;

public class Count {

    public void counting(double a, double b, double c) {
        double x1;
        double x2;
        String result;

        if (a == 0) {
            x1 = 0;
            result = "Root is: " + x1;
        } else if (a + b == 0) {
            x1 = 0;
            x2 = -b / a;

            result = "Root 1 is: " + x1 + "; Root 2 is: " + x2;
        } else if (a + c == 0) {
            if (-c / a < 0) {

                result = "No real roots";
            } else {
                x1 = (-b - Math.sqrt(b * b - (4 * a * c))) / (2 * a);
                x2 = (-b + Math.sqrt(b * b - (4 * a * c))) / (2 * a);

                result = "Root 1 is: " + x1 + "; Root 2 is: " + x2;
            }
        } else {
            x1 = (-b - Math.sqrt(b * b - (4 * a * c))) / (2 * a);
            x2 = (-b + Math.sqrt(b * b - (4 * a * c))) / (2 * a);

            result = "Root 1 is: " + x1 + "; Root 2 is: " + x2;
        }
        System.out.println(result);
    }
}
