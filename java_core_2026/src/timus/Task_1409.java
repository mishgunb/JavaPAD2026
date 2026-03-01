package timus;

import java.util.Scanner;

public class Task_1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int harry = scanner.nextInt();
        int larry = scanner.nextInt();

        int notHarry = larry - 1;
        int notLarry = harry - 1;

        System.out.println(notHarry + " " + notLarry);

        scanner.close();
    }
}