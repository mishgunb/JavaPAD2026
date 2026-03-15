package lr2.timus;

import java.util.Scanner;

public class Task1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String[] hieroglyphs = new String[N];

        for (int i = 0; i < N; i++) {
            hieroglyphs[i] = scanner.nextLine();
        }

        String letter = scanner.nextLine();

        for (String hieroglyph : hieroglyphs) {
            if (hieroglyph.startsWith(letter)) {
                System.out.println(hieroglyph);
            }
        }

        scanner.close();
    }
}
