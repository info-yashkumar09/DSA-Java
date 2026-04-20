package Loops.whileLoopProgram;

public class Factorial {
    public static void main(String[] args) {
        IO.println(getFactorial(10));
    }

    public static long getFactorial(int n){
        long fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
        return fact;
    }

}
