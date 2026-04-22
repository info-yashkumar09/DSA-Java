public class BinaryToDecimal {
    public static void main(String[] args) {
        IO.println(getDecimal(1001011));
    }

    public static int getDecimal(int n){
        int decimal=0; int i=0; int m=1;
        while(n>0){
            int rem=n%10;
            if(rem==1){
                m=rem*(int)(Math.pow(2,i));
                decimal+=m;
            }
            i++;
            n/=10;
        }
        return decimal;
    }

}
