package DigitPrograms;

public class PrintExactNumber {
    public static void main(String[] args) {
        getSameDigit(796762);
    }

    public static void getSameDigit(int n){
        int reverse=0;
        while(n>0){
            int rem=n%10;
            reverse=(reverse*10)+rem;
            n/=10;
        }
        while(reverse>0){
            int rem=reverse%10;
            IO.print(rem);
            reverse/=10;
        }
    }

}
