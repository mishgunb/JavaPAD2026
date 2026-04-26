package lr6.timus;

import java.util.Scanner;

public class Task1404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encrypted = sc.nextLine();
        int n = encrypted.length();
        int[] ed = new int[n];
        for (int i = 0; i < n; i++) {
            ed[i] = encrypted.charAt(i) - 'a';
        }

        int[] e = new int[n];
        for (int candidate = 5; candidate <= 30; candidate++) {
            if (candidate % 26 == ed[0]) {
                e[0] = candidate;
                break;
            }
        }

        for (int i = 1; i < n; i++) {
            int candidate = e[i-1] + ((ed[i] - e[i-1]) % 26 + 26) % 26;
            if (candidate == e[i-1]) {
                candidate += 26;
            }
            e[i] = candidate;
        }

        int[] d = new int[n];
        d[0] = e[0] - 5;
        for (int i = 1; i < n; i++) {
            d[i] = e[i] - e[i-1];
        }

        StringBuilder result = new StringBuilder();
        for (int val : d) {
            result.append((char) (val + 'a'));
        }
        System.out.println(result.toString());
    }
}