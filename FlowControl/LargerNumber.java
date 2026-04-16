package FlowControl;

public class LargerNumber {
    public static void main(String[] args) {
        int x=20; int y=45;
        if(x>y){
            IO.println(x+" is larger");
        }
        else if(y>x){
            IO.println(y+" is larger");
        }
        else{
            IO.println("Both are equal");
        }
    }
}
