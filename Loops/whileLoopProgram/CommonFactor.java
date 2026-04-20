package Loops.whileLoopProgram;

public class CommonFactor{
    public static void main(String[] args) {
        IO.println(getNumberOfCommonFactors(12, 6));
    }

    public static int getNumberOfCommonFactors(int x, int y){
        int i=1; int count=0;
        while(i<=x && i<=y){
            if(x%i==0 && y%i==0){
                count++;
            }
            i++;
        }
        return count;
    }

}