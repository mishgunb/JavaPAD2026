package lr2.timus;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<Integer> result = new ArrayList<>();

        int prev = scanner.nextInt();
        int count = 1;

        for (int i = 1; i < N; i++) {
            int current = scanner.nextInt();

            if (current == prev) {
                count++;
            } else {
                result.add(count);
                result.add(prev);
                prev = current;
                count = 1;
            }
        }

        result.add(count);
        result.add(prev);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
