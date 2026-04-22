package DigitPrograms;

public class SumOfDigits {
    public static void main(String[] args) {
        IO.println(getSumOfDigits(887632));
    }

    public static int getSumOfDigits(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }

}
