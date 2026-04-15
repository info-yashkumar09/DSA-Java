package Loops.whileLoopProgram;

public class PerfectSquare {
    public static void main(String[] args) {
        int i=1;
        while(i*i<=30){
            IO.println(i*i);
            i++;
        }
        IO.println("Total Perfect Square Numbers: "+(i-1));
    }
}
