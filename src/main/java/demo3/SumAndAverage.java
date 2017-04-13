package demo3;

public class SumAndAverage {

    public int counting(int lastNumber) {
        int sum = 0;

        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }
        return sum;
    }
}
