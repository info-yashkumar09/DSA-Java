package DigitPrograms;

public class CountEvenDigit {
    public static void main(String[] args) {
        IO.println(getCountOfEvenDigits(634782573));
    }

    public static int getCountOfEvenDigits(int n){
        int count=0;
        while(n>0){
            int rem = n%10;
            if((rem&1)==0){
                count++;
            }
            n/=10;
        }
        return count;
    }

}
