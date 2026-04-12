package lr4.timus;

import java.util.Scanner;

public class Task1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Y = sc.nextInt();

        boolean found = false;

        for (int X = 0; X < M; X++) {
            int pow = 1;
            for (int i = 0; i < N; i++) {
                pow = (pow * X) % M;
            }

            if (pow == Y) {
                if (found) System.out.print(" ");
                System.out.print(X);
                found = true;
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}