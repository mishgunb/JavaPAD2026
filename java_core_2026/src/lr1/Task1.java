package lr1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input last_name: ");
        String last_name = in.nextLine();

        System.out.println("Input first_name: ");
        String first_name = in.nextLine();

        System.out.println("Input surname: ");
        String surname = in.nextLine();

        System.out.printf("Hello, %s %s %s!", last_name, first_name, surname);
        in.close();
    }
}
