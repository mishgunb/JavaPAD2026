package lr1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = in.nextInt();
        in.nextLine();

        int number_minus = number - 1;
        int number_plus = number + 1;
        int square = (number_plus + number_minus + number) * (number_plus + number_minus + number);
        System.out.printf("%d %d %d %d \n", number_minus, number, number_plus, square);
        in.close();
    }
}