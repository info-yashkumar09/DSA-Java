package Methods;

public class Prime {
    public static void main(String[] args) {
        checkPrime(17);
    }

    public static void checkPrime(int n){
        int count = 0;
        int i = 1;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==2){
            IO.println(n+" is Prime");
        }
        else{
            IO.println(n+" is not Prime");
        }
    }
    
}
