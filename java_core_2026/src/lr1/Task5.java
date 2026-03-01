package lr1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напишите год рождения: ");
        int date_of_age = in.nextInt();
        int age = 2026 - date_of_age;
        System.out.println("Вам " + age );
        in.close();
    }
}