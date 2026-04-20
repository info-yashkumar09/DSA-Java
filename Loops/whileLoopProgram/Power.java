package Loops.whileLoopProgram;

public class Power {
    public static void main(String[] args) {
        IO.println(getPower(6, 3));
    }

    public static long getPower(int a, int b){
        int pow=1; int i=1;
        while(i<=b){
            pow*=a;
            i++;
        }
        return pow;
    }

}
