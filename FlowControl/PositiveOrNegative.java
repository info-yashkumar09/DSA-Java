package FlowControl;

public class PositiveOrNegative {
    public static void main(String[] args) {
        int n=20;
        if(n>0){
            IO.println("+ve number");
        }
        else if(n<0){
            IO.println("-ve number");
        }
        else{
            IO.println("number is zero");
        }
    }
}
