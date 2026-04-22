
public class MirrorDistanceProblemLeetCode {
    public static void main(String[] args) {
        IO.println(mirrorDistance(25));
    }

    public static int mirrorDistance(int n) {
        int reverse=0; int num=n;
        while(num>0){
            int rem=num%10;
            reverse=(reverse*10)+rem;
            num/=10;
        }
        int output = Math.abs(n-reverse);
        return output;
    }

}
