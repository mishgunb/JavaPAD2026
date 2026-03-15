package lr2.timus;

import java.util.Scanner;

public class Task1502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long diamonds = (long)(N + 1) * (N + 2);

        System.out.println(diamonds);

        scanner.close();
    }
}
