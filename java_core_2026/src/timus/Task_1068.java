package timus;

import java.util.Scanner;

public class Task_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int sum;
        if (N > 0) {
            sum = N * (N + 1) / 2;
        } else {
            sum = (-1 * N) * (-1 * N + 1) / 2;
            sum = -1 * sum + 1;
        }

        System.out.println(sum);
        in.close();
    }
}