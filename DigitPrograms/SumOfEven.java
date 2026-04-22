package DigitPrograms;

public class SumOfEven {
    public static void main(String[] args) {
        IO.println(getEvenSum(894589));
    }

    public static int getEvenSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            if((rem&1)==0){
                sum+=rem;
            }
            n/=10;
        }
        return sum;
    }

}
