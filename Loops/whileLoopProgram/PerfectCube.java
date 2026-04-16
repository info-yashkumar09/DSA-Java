package Loops.whileLoopProgram;

public class PerfectCube {
    public static void main(String[] args) {
        int i=1;
        while(i*i*i<=100){
            IO.println(i*i*i);
            i++;
        }
        IO.println("Total Perfect Square Numbers: "+(i-1));
    }
}
