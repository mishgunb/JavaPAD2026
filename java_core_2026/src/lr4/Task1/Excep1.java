package lr4.Task1;

import java.util.Scanner;

public class Excep1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите целое число: ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Среднее положительных: " + (double) sum / count);
        } else {
            System.out.println("Положительные числа отсутствуют.");
        }

        scanner.close();
    }
}