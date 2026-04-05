package lr3.timus;

import java.util.Scanner;

public class Task1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (N == 1) {
            System.out.println(K - 1);
            return;
        }

        long a = K - 1;
        long b = (long) K * (K - 1);

        for (int i = 3; i <= N; i++) {
            long c = (long) (K - 1) * (a + b);
            a = b;
            b = c;
        }

        System.out.println(b);
    }
}
