import java.io.*;
import java.util.*;

public class Square {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("square.dat"));

        int n = in.nextInt();
        while (n-- > 0) {
            int size = in.nextInt();
            int[][] nums = new int[size][size];
            int[][] dp = new int[size][size];
            for (int r = 0; r < size; r++) {
                for (int c = 0; c < size; c++) {
                    nums[r][c] = in.nextInt();
                }
            }

            // fill in first row and col
            for (int i = 0; i < size; i++) {
                dp[0][i] = nums[0][i];
                dp[i][0] = nums[i][0];
            }
            
            for (int r = 1; r < size; r++) {
                for (int c = 1; c < size; c++) {
                    if (nums[r][c] == 1) {
                        dp[r][c] = Math.min(Math.min(dp[r][c-1], dp[r-1][c]), dp[r-1][c-1]) + 1;
                    }
                }
            }

            int max = 0;
            for (int r = 0; r < size; r++) {
                for (int c = 0; c < size; c++) {
                    max = Math.max(max, dp[r][c]);
                }
            }
            System.out.println(max * max);

        }
    }
}
