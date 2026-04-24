public class CheckStringPalindrome2 {
    public static void main(String[] args) {
        IO.println(isStringPalindrome("madam"));
    }

    public static boolean isStringPalindrome(String s){
        s=s.toLowerCase(); int start=0; int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
