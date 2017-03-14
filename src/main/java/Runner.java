import demo1_2.Sqrt;
import demo3.OddOrEvenNumber;
import demo3.PrintNumberInWord;
import demo3.SortingRunner;
import demo3.SumAndAverage;


public class Runner {

    public static void main(String[] args) {
        PrintNumberInWord printNumberInWord = new PrintNumberInWord();
        SumAndAverage sumAndAverage = new SumAndAverage();
        OddOrEvenNumber oddOrEvenNumber = new OddOrEvenNumber();


        Sqrt.demo1();
        SortingRunner.runner();
        printNumberInWord.converting();
        System.out.println(String.format("The sum is %s, average is %s",sumAndAverage.counting(), sumAndAverage.counting()/101));
        oddOrEvenNumber.counting();
    }
}
