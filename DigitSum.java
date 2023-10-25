import java.io.*;
import java.util.*;

public class DigitSum {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("digitsum.dat"));
        int n = in.nextInt();

        while (n-- > 0) {
            String num = in.next();

            long[][] dp = new long[num.length()][2];
            dp[0][0] = 45;

            int ones = getDigit(num, 0);
            dp[0][1] = (ones * (ones + 1)) / 2;

            for (int i = 1; i < dp.length; i++) {
                // get next digit
                int dig = getDigit(num, i);

                // add up sums for this digit
                for (int j = 0; j < dig; j++) {
                    dp[i][1] += dp[i - 1][0] + j * Math.pow(10, i);
                }

                dp[i][1] += dp[i - 1][1] + dig * (Long.parseLong(num.substring(num.length() - i)) + 1);
                for (int j = 0; j < 10; j++) {
                    dp[i][0] += dp[i - 1][0] + j * Math.pow(10, i);
                }
            }
            System.out.println(dp[dp.length - 1][1]);
        }
    }

    public static int getDigit(String n, int i) {
        return Integer.parseInt(n.substring(n.length() - 1 - i, n.length() - i));
    }
}
