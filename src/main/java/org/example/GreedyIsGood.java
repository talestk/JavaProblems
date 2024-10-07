package org.example;


/*
 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point
 */
public class GreedyIsGood {
    public static int greedy(int[] dice){
        //code here
        int[] counts = new int[7];
        int totalScore = 0;

        for (int die : dice) {
            /*
             for example [5,1,3,4,1]
             this would translate to an array with the count of appearances of a number
             counts[0] = 0
             counts[1] = 2
             counts[2] = 0
             counts[3] = 1
             counts[4] = 1
             counts[5] = 1
             counts[6] = 0
             */

            counts[die]++;
        }

        // we only care about numbers 1 - 6 since it is a die
        for (int value = 1; value <= 6; value++) {
            // lets assign scores
            if (counts[value] >= 3) {
                if (value == 1) {
                    totalScore += 1000;
                } else {
                    totalScore += value * 100;
                }
                // we need to remove the counted triplet to avoid counting it again
                counts[value] -= 3;
            }
        }

        // lets deal with the remaining cases for 1 and 5
        totalScore += counts[1] * 100;
        totalScore += counts[5] * 50;

        return totalScore;
    }

    public static int greedyBestAnswer(int[] dice) {
        int n[] = new int[7];
        for (int d : dice) n[d]++;
        return n[1]/3*1000 + n[1]%3*100 + n[2]/3*200 + n[3]/3*300 + n[4]/3*400 + n[5]/3*500 + n[5]%3*50 + n[6]/3*600;
    }
}
