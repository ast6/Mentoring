package mentoring.demo3;

public class HarmonicSum {

    public void countingOfHarmonicSum(int n){
        int i = 1;
        double sum=0;

       do{sum += 1.0/i++;
       }
        while(i<=n);
        System.out.println(sum);

    }

}
