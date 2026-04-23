package lr5.timus;

import java.io.*;

public class Task1349 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if (n == 0) {
            System.out.println(-1);
        }

        else if (n == 1) {
            System.out.println("1 2 3");
        }

        else if (n == 2) {
            for (int a = 1; a <= 100; a++) {
                for (int b = a + 1; b <= 100; b++) {
                    for (int c = b + 1; c <= 100; c++) {
                        if (a * a + b * b == c * c) {
                            System.out.println(a + " " + b + " " + c);
                            return;
                        }
                    }
                }
            }
            System.out.println(-1);
        }

        // если n >= 3, то по теореме Ферма решений нет
        else {
            System.out.println(-1);
        }
    }
}