package Methods;

public class ThreeDivisor {
    public static void main(String[] args) {
        IO.println(checkThreeDivisor(4));
    }

    public static boolean checkThreeDivisor(int n){
        int count=0; int i = 1;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        return count==3;
    }

}