package lr6.timus;

import java.util.Scanner;

public class Task1319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] table = new int[N][N];

        int num = 1;

        for (int diag = 0; diag < 2 * N - 1; diag++) {
            int row, col;
            if (diag < N) {
                row = 0;
                col = N - 1 - diag;
            } else {
                row = diag - (N - 1);
                col = 0;
            }

            while (row < N && col < N) {
                table[row][col] = num++;
                row++;
                col++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(table[i][j] + (j < N - 1 ? " " : ""));
            }
            System.out.println();
        }
    }
}