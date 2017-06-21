package mentoring;

import mentoring.demo3.*;

public class RunnerDemo3 {

    private final static int lastNumber = 100;

    public static void main(String[] args) {

        PrintNumberInWord printNumberInWord = new PrintNumberInWord();
        SumAndAverage sumAndAverage = new SumAndAverage();
        OddOrEvenNumber oddOrEvenNumber = new OddOrEvenNumber();
        ComputePi computePi = new ComputePi();
        HarmonicSum harmonicSum = new HarmonicSum();

        //Bubble sorting and binary search
        SortingRunner.runner();
        printNumberInWord.converting();

        //Additional tasks

        System.out.println(String.format("The sum is %s, average is %s", sumAndAverage.counting(lastNumber), sumAndAverage.counting(lastNumber) / lastNumber + 1));
        oddOrEvenNumber.oddVerification();
        harmonicSum.countingOfHarmonicSum(50000);
        computePi.countPiComp();
        computePi.countPiManual(3000000);
    }
}
