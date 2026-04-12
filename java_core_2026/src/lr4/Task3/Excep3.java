package lr4.Task3;

import java.util.Scanner;

public class Excep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        byte[] array = new byte[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите число: ");
            array[i] = scanner.nextByte();
        }

        int sum = 0;
        for (byte b : array) {
            sum += b;
        }

        System.out.println("Сумма: " + sum);
    }
}