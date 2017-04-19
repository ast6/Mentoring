import demo6.CalculationOfRPN;
import demo6.ReversePolishNotation;
import demo6.StringCompressor;
import demo6.StringDecoder;

public class RunnerDemo6 {

    public static void main(String [] args){
        //Initializing
        CalculationOfRPN calculationOfRPN = new CalculationOfRPN();
        StringCompressor stringCompressor = new StringCompressor();
        StringDecoder stringDecoder = new StringDecoder();
        System.out.println(calculationOfRPN.val("6+6"));
    }
}
