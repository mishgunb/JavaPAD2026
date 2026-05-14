package lr7.timus;

import java.util.Scanner;

public class Task1820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (k >= n) {
            System.out.println(2);
        } else {
            int sides = 2 * n;
            int minutes = (sides + k - 1) / k;
            if (minutes < 2) {
                minutes = 2;
            }
            System.out.println(minutes);
        }
    }
}
