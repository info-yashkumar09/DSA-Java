package DigitPrograms;

public class ReverseNumber{
    public static void main(String[] args) {
        getReversedNumber(7654);
    }

    public static void getReversedNumber(int n){
        while(n>0){
            int rem = n%10;
            IO.print(rem);
            n/=10;
        }
    }

}