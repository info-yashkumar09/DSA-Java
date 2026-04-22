package DigitPrograms;

public class GetDigits {
    public static void main(String[] args) {
        getDigits(893257492);
    }

    public static void getDigits(int n){
        while(n>0){
            int rem=n%10;
            if(rem>=5){
                IO.print(rem);
            }
            n/=10;
        }
    }

}
