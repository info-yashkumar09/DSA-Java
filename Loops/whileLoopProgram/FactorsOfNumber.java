package Loops.whileLoopProgram;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int n =16; int i=1; int count=0;
        while(i<=n){
            if(n%i==0){
                IO.println(i);
                count++;
            }
            i++;
        }
        IO.println("Total factors of "+n+" are "+ count);
    }
}
