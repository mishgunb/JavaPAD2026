package lr8.timus;

import java.util.Scanner;

public class Task1893 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seat = scanner.nextLine().trim();

        int row = Integer.parseInt(seat.substring(0, seat.length() - 1));
        char letter = seat.charAt(seat.length() - 1);

        if (row >= 1 && row <= 2) {
            if (letter == 'A' || letter == 'D') {
                System.out.println("window");
            } else if (letter == 'B' || letter == 'C') {
                System.out.println("aisle");
            } else {
                System.out.println("neither");
            }
        } else if (row >= 3 && row <= 20) {
            if (letter == 'A' || letter == 'F') {
                System.out.println("window");
            } else if (letter == 'C' || letter == 'D') {
                System.out.println("aisle");
            } else {
                System.out.println("neither");
            }
        } else {
            if (letter == 'A' || letter == 'K') {
                System.out.println("window");
            } else if (letter == 'D' || letter == 'H') {
                System.out.println("aisle");
            } else {
                System.out.println("neither");
            }
        }
    }
}