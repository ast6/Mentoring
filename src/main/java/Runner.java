import demo1_2.Sqrt;
import demo3.*;


public class Runner {

    public static void main(String[] args) {
        //Initialize
        PrintNumberInWord printNumberInWord = new PrintNumberInWord();
        SumAndAverage sumAndAverage = new SumAndAverage();
        OddOrEvenNumber oddOrEvenNumber = new OddOrEvenNumber();
        ComputePi computePi = new ComputePi();
        HarmonicSum harmonicSum = new HarmonicSum();

        //Demo1
        Sqrt.demo1();
        //Bubble sorting and binary search
        SortingRunner.runner();
        printNumberInWord.converting();
        //Additional tasks
        System.out.println(String.format("The sum is %s, average is %s",sumAndAverage.counting(), sumAndAverage.counting()/101));
        oddOrEvenNumber.counting();
        harmonicSum.countingOfHarmonicSum(50000);
        computePi.countPiComp();
        computePi.countPiManual(3000000);


    }
}
