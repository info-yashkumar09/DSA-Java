

public class BiggestDigit {
    public static void main(String[] args) {
        IO.println(getBiggestDigit(3624));
    }

    public static int getBiggestDigit(int n){
        int biggestDigit=0;
        while(n>0){
            int rem=n%10;
            if(rem>biggestDigit){
                biggestDigit=rem;
            }
            n/=10;
        }
        return biggestDigit;
    }

}
