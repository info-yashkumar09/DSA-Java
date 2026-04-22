package DigitPrograms;

public class TrailingZeros {
    public static void main(String[] args) {
        IO.println(getTrailingZeros(7));
    }

    public static int getTrailingZeros(int n){
        long fact=1; int countZero=0;
        while(n>0){
            fact*=n;
            n--;
        }
        while(fact>0){
            long rem=fact%10;
            if(rem==0){
                countZero++;
                fact/=10;
            }
        }
        return countZero;
    }

}
