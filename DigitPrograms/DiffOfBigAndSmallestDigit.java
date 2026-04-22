
public class DiffOfBigAndSmallestDigit {
    public static void main(String[] args) {
        IO.println(getDiff(34527479));
    }

    public static int getDiff(int n){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(n>0){
            int rem=n%10;
            if(rem>max){
                max=rem;
            }
            if(rem<min){
                min=rem;
            }
            n/=10;
        }
        int diff = max-min;
        return diff;
    }

}
