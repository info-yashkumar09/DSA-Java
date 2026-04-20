package Loops.whileLoopProgram;

public class SumOfSquareOfNumber {
    public static void main(String[] args) {
        IO.println(getSquareSum(10));
    }

    public static int getSquareSum(int n){
        int sum=0; int i=1;
        while(i<=n){
            sum+=(i*i);
            i++;
        }
        return sum;
    }

}
