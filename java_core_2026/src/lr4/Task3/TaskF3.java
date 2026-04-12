package lr4.Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskF3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
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

            System.out.println("Сумма элементов массива: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка или число вне диапазона byte (-128...127)");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: размер массива не может быть отрицательным");
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e.getMessage());
        } finally {
            System.out.println("Программа завершена");
            scanner.close();
        }
    }
}