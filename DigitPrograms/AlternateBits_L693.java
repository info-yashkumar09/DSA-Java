public class AlternateBits_L693 {
    public static void main(String[] args) {
        IO.println(hasAlternatingBits(1365));
    }

    public static boolean hasAlternatingBits(int n) {
        int previousBit = n & 1;
        n >>= 1;
        while (n > 0) {
            int currentBit = n & 1;
            if (currentBit == previousBit) {
                return false;
            }
            previousBit = currentBit;
            n >>= 1;
        }
        return true;
    }

}
