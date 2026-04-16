package FlowControl;

public class DivisibleBy2And3 {
    public static void main(String[] args) {
        int n = 12;
        if(n>0){
            IO.println(n+" is +ve");
            if(n%2==0){
                IO.println(n+" is divisible by 2");
            }
            else{
                IO.println(n+" is not divisible by 2");
            }
        }
        else{
            IO.println(n+" is -ve");
            n = (-n);
            if(n%3==0){
                IO.println(n+" is divisible by 3");
            }
            else{
                IO.println(n+" is not divisible by 3");
            }
        }
    }
}
