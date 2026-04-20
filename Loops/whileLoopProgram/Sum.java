package Loops.whileLoopProgram;

public class Sum {
    public static void main(String[] args) {
        IO.println(getSum(20));
    }

    public static int getSum(int n){
        int sum=0; int i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
        return sum;
    }

}
