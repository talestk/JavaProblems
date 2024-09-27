package org.example;

import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HyperskillTest {
     @Test
    public void chocoProblem() {
         /*
          * Imagine a chocolate bar. Remember how it is usually split into smaller bits by a special grid?
          * Now think of chocolate as an N x M rectangle divided into little segments: N segments in width and M in height.
          * Each segment is 1x1 and unbreakable. Find out whether it is possible to break off exactly K segments from the
          * chocolate with a single straight line: vertical or horizontal.
          *
          * Input data format
          * The program gets an input of three integers: N, M, K.
          *
          * Output data format
          * The program must output one of the two words: YES or NO.
          *
          * If you're having trouble understanding the task, try drawing it on a piece of paper.
          */
        // 2 10 7 = NO
        // 7 4 21 = YES
        // 348 41 6183 = ?
        resolveChocoProblem(348,41,6183);
        // 2 4 6 = YES
        resolveChocoProblem(2,4,6);

    }
    private void resolveChocoProblem(int n, int m, int wantedPiece) {
        // total number of pieces in the choco
        int numberOfPieces = n * m;
        // whatever was left from the choco
        int restOfChoco = (numberOfPieces) - wantedPiece;

        // we check if we are not asking for a piece greater than the whole chocolate
        if (wantedPiece > (numberOfPieces)) {
            System.out.print("NO");
        } else if (restOfChoco % 2 == 0 && numberOfPieces % 2 == 0 || restOfChoco == n || restOfChoco == m) {
            // we check if the leftover pieces are even and if the whole choco has even pieces (also some edge cases)
            System.out.print("YES");
        } else if (wantedPiece % n == 0 || wantedPiece % m == 0) {
            // we also check if we want a single row or a single column of the choco
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    @Test
    public void someChecks() {
         boolean b1 = true;
         boolean b2 = false;
         boolean b3 = false;

         int result = (b1 && b2) ? 10 : (b2 || b3) ? 20 : 30;
         System.out.println(result);
    }

    @Test
    public void multiConstrHSTest() throws FileNotFoundException {

       File file = new File("C:\\Users\\tales\\IdeaProjects\\CodeWars\\src\\test\\java\\org\\example\\dataset_91033.txt");
        Scanner scanner = new Scanner(file);
       int total = 0;
       while (scanner.hasNext()) {
           int nextInt = scanner.nextInt();
           if (nextInt == 0) break;

           if (nextInt % 2 == 0) {
               total++;
           }
       }
        System.out.println(total);
    }

}
