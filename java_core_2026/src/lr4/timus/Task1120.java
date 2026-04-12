package lr4.timus;

import java.util.Scanner;

public class Task1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();

        for (long N = (long) Math.sqrt(2 * S); N >= 1; N--) {
            long num = 2 * S - N * (N - 1);
            if (num > 0 && num % (2 * N) == 0) {
                long A = num / (2 * N);
                System.out.println(A + " " + N);
                return;
            }
        }
    }
}