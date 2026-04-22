package DigitPrograms;

public class CheckPalindrome {
    public static void main(String[] args) {
        IO.println(isPalindrome(1331));
    }

    public static boolean isPalindrome(int x) {
        int n=x; int rev=0;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        if(x==rev){
            return true;
        }
        else{
            return false;
        }
    }

}
