package Loops.whileLoopProgram;

/*
There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.

On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.

Return the number of bulbs that are on after n rounds.
*/

//Concept of Perfect Square used

public class BulbSwitcher {
    public static void main(String[] args) {
        IO.println(bulbSwitch(100));
    }

    public static int bulbSwitch(int n) {
        int i=1;
        while(i*i<=n){
            i++;
        }
        return i-1;
    }

}
