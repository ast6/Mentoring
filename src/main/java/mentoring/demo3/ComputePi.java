package mentoring.demo3;

public class ComputePi {

    public void countPiComp() {
        System.out.println("Computers PI is: " + Math.PI);
    }

    public void countPiManual(int n) {
        double sequenceFormula = 0;

        for (int counter = 1; counter < n; counter += 2) {
            sequenceFormula = sequenceFormula + ((1.0 / (2.0 * counter - 1)) - (1.0 / (2.0 * counter + 1)));
        }
        double pi = 4 * sequenceFormula;
        System.out.println(pi);
    }


}
