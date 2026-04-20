package Loops.whileLoopProgram;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        IO.println(getEvenSum(100));
    }

    public static int getEvenSum(int n){
        int sum=0; int i=0;
        while(i<=n){
            if((i&1)==0){
                sum+=i;
            }
            i++;
        }
        return sum;
    }

}
