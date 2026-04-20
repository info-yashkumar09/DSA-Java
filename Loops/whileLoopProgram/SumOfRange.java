package Loops.whileLoopProgram;

public class SumOfRange {
    public static void main(String[] args) {
        IO.println(getSumOfRange(120, 180));
    }

    public static int getSumOfRange(int start, int end){
        int sum=0; int i=start;
        while(i<=end){
            sum+=i;
            i++;
        }
        return sum;
    }

}
