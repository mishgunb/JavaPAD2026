package lr8.timus;

import java.util.Scanner;

public class Task1877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeA = scanner.nextLine();
        String codeB = scanner.nextLine();

        int a = Integer.parseInt(codeA);
        int b = Integer.parseInt(codeB);

        if (a % 2 == 0 || b % 2 == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}