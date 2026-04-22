package DigitPrograms;

public class CountOddDigit {
    public static void main(String[] args) {
        IO.println(getCountOfEvenDigits(634782573));
    }

    public static int getCountOfEvenDigits(int n){
        int count=0;
        while(n>0){
            int rem = n%10;
            if((rem&1)==1){
                count++;
            }
            n/=10;
        }
        return count;
    }

}
