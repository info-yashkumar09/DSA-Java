
public class CheckStringPalindrome {
    public static void main(String[] args) {
        IO.println(isStringPalindrome("madam"));
    }

    public static boolean isStringPalindrome(String s){
        int i=s.length()-1; String reverse="";
        while(i>=0){
            reverse+=s.charAt(i);
            i--;
        }
        return s.equalsIgnoreCase(reverse);
    }

}
