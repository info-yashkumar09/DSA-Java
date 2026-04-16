package Loops.whileLoopProgram;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int n =16; int i=1;
        while(i<=n){
            if(n%i==0){
                IO.println(i);
            }
            i++;
        }
    }
}
