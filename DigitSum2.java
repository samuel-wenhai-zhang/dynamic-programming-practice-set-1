import java.io.*;
import java.util.*;

public class DigitSum2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("digitsum.dat"));
        int n = in.nextInt();

        while (n-- > 0) {
            String num = in.next();
            int total = 0;
            for (int i = 0; i < num.length(); i++) {
                int digit = getDigit(num, i);
                total += Integer.parseInt(num) / (int)(Math.pow(10, i + 1)) * 45 + getDigit(num, i) * (getDigit(num, i) + 1) / 2 * Math.pow(10, i);
            }
            System.out.println(total);
            
        }
    }

    public static int getDigit(String n, int i) {
        return Integer.parseInt(n.substring(n.length() - 1 - i, n.length() - i));
    }
}
