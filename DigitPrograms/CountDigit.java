package DigitPrograms;

public class CountDigit {
    public static void main(String[] args) {
        IO.println(getDigitCount(98124543));
    }

    public static int getDigitCount(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }

}
