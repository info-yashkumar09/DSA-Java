package Loops.whileLoopProgram;

public class SumOfSeries {
    public static void main(String[] args) {
        IO.println(getSeriesSum(10));
    }

    public static int getSeriesSum(int n){
        int sum=0; int i=1;
        while(i<=n){
            sum+=(i*(i+1));
            i++;
        }
        return sum;
    }

}
