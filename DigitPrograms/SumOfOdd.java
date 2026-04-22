package DigitPrograms;

public class SumOfOdd {
    public static void main(String[] args) {
        IO.println(getOddSum(894589));
    }

    public static int getOddSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            if((rem&1)==1){
                sum+=rem;
            }
            n/=10;
        }
        return sum;
    }

}
