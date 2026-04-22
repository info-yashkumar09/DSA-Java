public class DecimalToBinary {
    public static void main(String[] args) {
        IO.println(getBinary(20));
    }

    public static int getBinary(int n){
        int binary=0; int multiplier=1;
        while(n>0){
            int rem=n%2;
            binary+=(rem*multiplier);
            multiplier*=10;
            n/=2;
        }
        return binary;
    }

}
