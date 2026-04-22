
public class NumberOfSteps {
    public static void main(String[] args) {
        IO.println(getNumberOfSteps(8));
    }

    public static int getNumberOfSteps(int n) {
        int steps = 0;
        while (n > 0) {
            if ((n & 1) == 0) {
                n /= 2;
                steps++;
            } else {
                n--;
                steps++;
            }
        }
        return steps;
    }

}
