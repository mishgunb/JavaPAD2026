package lr4.Task2;

import java.util.Scanner;

public class Excep2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Введите номер столбца: ");
        int column = Integer.parseInt(scanner.nextLine());

        for (int[] into : matrix) {
            System.out.println(into[column]);
        }
    }
}
