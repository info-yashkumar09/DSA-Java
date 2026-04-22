
public class CountZero {
    public static void main(String[] args) {
        IO.println(getCountOfZero(54603066));
    }

    public static int getCountOfZero(int n){
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==0){
                count++;
            }
            n/=10;
        }
        return count;
    }

}
